package org.xtext.globalTypes.generator

import org.xtext.globalTypes.myDsl.LocalProtocol
import org.eclipse.emf.common.util.EList
import org.xtext.globalTypes.myDsl.Definition
import org.eclipse.xtext.EcoreUtil2
import org.xtext.globalTypes.myDsl.RoleSet
import java.util.ArrayList
import org.xtext.globalTypes.myDsl.MessageL
import org.xtext.globalTypes.myDsl.ChoiceL
import org.xtext.globalTypes.myDsl.ForEachL
import org.xtext.globalTypes.myDsl.RecursionL
import org.xtext.globalTypes.myDsl.CloseRecursionL
import org.xtext.globalTypes.myDsl.EndProtocol
import org.xtext.globalTypes.myDsl.ProtocolL
import org.xtext.globalTypes.myDsl.SenderL
import org.xtext.globalTypes.myDsl.ReceiverL
import org.xtext.globalTypes.myDsl.MessageNormalL
import org.xtext.globalTypes.myDsl.MessageQuitL
import java.util.HashMap
import java.util.Queue
import java.util.Map.Entry
import java.util.LinkedList
import java.util.AbstractMap.SimpleEntry
import org.xtext.globalTypes.myDsl.RoleOne

class JadescriptGenerator {
	Queue<Entry<String, Object>> behQueue; //object is either a MessageNormal or a ChoiceL
	HashMap<String, Integer> recNumAssociation;
	String agentString;
	String agentName;
	PayloadNames payloadNames = new PayloadNames();
	int behaviourNumber
	int recursionNumber
	
	
	def CharSequence project(LocalProtocol lp, EList<Definition> definitions){
		agentString = new String()
		behQueue = new LinkedList<Entry<String, Object>>();
		recNumAssociation = new HashMap<String, Integer>();
		payloadNames.init(definitions);
		agentString = printOntology(lp, definitions).toString
		agentName = lp.projectedRole.name
		behaviourNumber = 0
		recursionNumber = 0
		
		
		agentString = agentString + "\n\n" + createAgent(lp)
		
		//print behaviors loop
		while(behQueue.peek !== null){
			var entry = behQueue.poll
			
			if(entry.getValue instanceof ChoiceL) agentString = agentString + "\n\n\n" + createBehaviour(entry.getKey, agentName, entry.getValue as ChoiceL)
			else if(entry.getValue instanceof MessageL) agentString = agentString + "\n\n\n" + createBehaviour(entry.getKey, agentName, entry.getValue as MessageL)
			else if(entry.getValue instanceof LocalProtocol) agentString = agentString + "\n\n\n" + createWaitAgents(entry.getKey, entry.getValue as LocalProtocol)
			else  agentString = agentString + "\n\n\n" + createWaitAgents(entry.getKey, entry.getValue as RoleSet)
		}
		
		return agentString
	}
		
		
	
	def printOntology(LocalProtocol lp, EList<Definition> definitions) '''
		ontology «lp.protocolName»
			«FOR d: definitions»
				«IF (d.type == '@proposition')»
					proposition «d.name»
				«ENDIF»
				«IF (d.type == '@predicate')»
					predicate «d.name»(«payloadNames.getPayload(d)»)
				«ENDIF»
				«IF (d.type == '@action')»
					«IF d.types.length != 0»
						action «d.name»(«payloadNames.getPayload(d)»)
					«ELSE»
						action «d.name»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
	'''
	
	def createAgent(LocalProtocol lp)'''
		agent «lp.projectedRole.name» uses ontology «lp.protocolName»
			property forCounter as integer = 0
			«var rolesetList = EcoreUtil2.getAllContentsOfType(lp.roles, RoleSet)»
			«var isDone = 0»
			«FOR r: rolesetList»
				«IF r.ref.name == agentName»
					property «r.name»List as list of aid
				«ENDIF»
			«ENDFOR»
			«var roleList = EcoreUtil2.getAllContentsOfType(lp.roles, RoleOne)»
			«FOR r: roleList»
				«IF r.name != agentName»
					property «r.name» as aid
				«ENDIF»
			«ENDFOR»
			
			on create do
				«FOR r: rolesetList»
					«IF lp.projectedRole.name.equals(r.ref.name)»
						activate WaitSubAgents«behaviourNumber»
						«val ignore = behQueue.add(new SimpleEntry<String, Object>("WaitSubAgents"+behaviourNumber, lp))»
						«val ignore2 = isDone = 1»
					«ENDIF»
				«ENDFOR»
				«IF lp.projectedRole instanceof RoleSet»
						activate ContactCoordinator«behaviourNumber»
						«val ignore = behQueue.add(new SimpleEntry<String, Object>("ContactCoordinator"+behaviourNumber, lp.projectedRole))»
				«ENDIF»
				«IF (isDone == 0)»
					«createProtocol(lp.protocol.begin)»
				«ENDIF»
	'''
	
	def dispatch createWaitAgents(String name, LocalProtocol lp){
		behaviourNumber++;
		var rolesetList = EcoreUtil2.getAllContentsOfType(lp.roles, RoleSet);
		'''
			«FOR r : rolesetList»
				«IF agentName.equals(r.ref.name)»
						cyclic behaviour «name» for agent «agentName»
							on create do
								deactivate this after "PT(/*time*)S" as duration
						
							on message inform(«r.ref.name») do
								add sender of message to «r.name»List
								
							on deactivate do
								«createProtocol(lp.protocol.begin)»
				«ENDIF»
			«ENDFOR»
		'''
		}
		
	def dispatch createWaitAgents(String name, RoleSet r){
		'''
			one shot behaviour «name» for agent «agentName»
				on execute do
					send message inform(«r.ref.name») to «r.ref.name»
		'''
	}
	

	//creo behaviour con scelta esterna
	def createBehaviour(String behName, String agentName, ChoiceL c)'''
		cyclic behaviour «behName» for agent «agentName»
			«IF c.roleMakingChoice.name != agentName»
				«FOR MessageL branch: c.branches»
					«createHandler(branch)»
				«ENDFOR»
			«ELSE»
				on create do
					«createProtocol(c)»
			«ENDIF»
	'''
	
	//creo behaviour per ricezione messaggio
	def createBehaviour(String behName, String agentName, MessageL m)'''
		cyclic behaviour «behName» for agent «agentName»
			«IF m.sendReceive instanceof SenderL»
				«createHandler(m)»
			«ELSE»
				on create do
					«createProtocol(m)»
			«ENDIF»
	'''
	
	def createHandler(MessageL message)'''
		«IF message instanceof MessageNormalL»
			on message inform «message.messageType» do
				«createProtocol(message.protocol.begin)»
		«ELSE»
			handler quit
		«ENDIF»
	'''
	
	
	def dispatch createProtocol(MessageL message)'''
		«IF message instanceof MessageNormalL»
			«createMessage(message)»
		«ENDIF»
	'''
	
	
	def createMessage(MessageNormalL message){
		if(message.sendReceive instanceof ReceiverL)
			return '''
				send message inform «message.messageType»(/*payload*/) to «message.sendReceive.role.name»
				«createProtocol(message.protocol.begin)»
			'''
			
		else{
			behaviourNumber++;
			behQueue.add(new SimpleEntry<String, Object>("Behaviour"+behaviourNumber, message))
			return '''
				activate Behaviour«behaviourNumber»
				deactivate this'''
		}
	}
	
	def createMessage(MessageQuitL message){
		if(message.sendReceive instanceof ReceiverL)
			return '''
				send message inform QUIT to «message.sendReceive.role.name»
				deactivate this
			'''
			
		else{
			behaviourNumber++;
			behQueue.add(new SimpleEntry<String, Object>("Behaviour"+behaviourNumber, message))
			return '''
				activate Behaviour«behaviourNumber»
				deactivate this'''
		}
	}
	
	/*
	 * se scelta interna, serie di if
	 * se scelta esterna, inserisco nella coda di behaviour
	 */
	def dispatch createProtocol(ChoiceL choice){
		if(choice.roleMakingChoice.name == agentName)
			return'''
				«FOR MessageL branch: choice.branches»
					if(/*cond*/) do
						«createProtocol(branch)»
				«ENDFOR»
			'''
		else{
			behaviourNumber++;
			behQueue.add(new SimpleEntry<String, Object>("Behaviour"+behaviourNumber, choice))
			return "activate Behaviour"+ behaviourNumber +"\ndeactivate this"
		}
	}
	
	/*
	 * «IF forEach.refrole.name.equals(agentName)», alias "sto proiettando sul coordinatore"
	 * 		*metodo ad-hoc per gestire il coordinatore*
	 * 	ELSE -> non sto proiettando sul coordinatore
	 * 		IF sto proiettando sui subagents
	 * 			*metodo ad-hoc per gestire i subagents*
	 * 		ELS
	 * 			// non ancora implementato
	 */
	def dispatch createProtocol(ForEachL forEach){
		if (forEach.refrole.name.equals(agentName)){
		behaviourNumber++;
		'''
			for agents in «forEach.roleset.name»List do
				activate Behaviour«behaviourNumber»(agents)
			deactivate this
			«forLoopCoordinator(forEach.branch)»
		'''
		}
	}

	
	def forLoopCoordinator(ProtocolL protocol){
		'''
			*behaviour*
		'''
	}
	
	def dispatch createProtocol(RecursionL rec){
		recursionNumber++;
		behQueue.add(new SimpleEntry<String, Object>("RecBehaviour"+recursionNumber, rec.recProtocol.begin))
		recNumAssociation.put(rec.name ,recursionNumber);
		return '''
			activate RecBehaviour«recursionNumber»
			deactivate this'''
	}
	
	def dispatch createProtocol(CloseRecursionL closeRec){
		var recNumber = recNumAssociation.get(closeRec.recursionVariable.name);
		System.out.println(recNumAssociation +" -> "+ closeRec.recursionVariable.name);
		return '''
			activate RecBehaviour«recNumber»
			deactivate this'''
	}
	
	def dispatch createProtocol(EndProtocol end)'''
		deactivate this
	'''
	
}