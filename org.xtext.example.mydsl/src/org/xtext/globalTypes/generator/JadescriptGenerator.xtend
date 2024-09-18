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
	Queue<Entry<String, Entry<Object, Boolean>>> behQueue; //object is either a MessageNormal or a ChoiceL
	HashMap<String, Integer> recNumAssociation;
	String agentString;
	String agentName;
	String buffer;
	PayloadNames payloadNames = new PayloadNames();
	int behaviourNumber
	int recursionNumber
	int forNumber
	String forVariable
	
	
	def CharSequence translate(LocalProtocol lp, EList<Definition> definitions){
		agentString = new String()
		behQueue = new LinkedList<Entry<String, Entry<Object, Boolean>>>();
		recNumAssociation = new HashMap<String, Integer>();
		payloadNames.init(definitions);
		agentString = printOntology(lp, definitions).toString
		agentName = lp.projectedRole.name
		behaviourNumber = 0
		recursionNumber = 0
		forNumber = 0
		
		
		agentString = agentString + "\n\n" + createAgent(lp)
		
		//print behaviors loop
		while(behQueue.peek !== null){
			var entry = behQueue.poll
			var firstObj = entry.getValue.getKey
			var behName = entry.getKey
			var par = entry.getValue.getValue
			
			if(firstObj instanceof ChoiceL) agentString += "\n\n\n" + createBehaviour(behName, agentName, firstObj as ChoiceL, par)
			else if(firstObj instanceof MessageL) agentString += "\n\n\n" + createBehaviour(behName, agentName, firstObj as MessageL, par)
			else if(firstObj instanceof RecursionL) agentString += "\n\n\n" + createBehaviour(behName, agentName, firstObj as RecursionL, par)
			else agentString += "\n\n\n" + createBehaviour(behName, agentName, firstObj as ForEachL, par)
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
				«createProtocol(lp.protocol.begin, false)»
	'''
	
	//creo behaviour con scelta esterna
	def createBehaviour(String behName, String agentName, ChoiceL c, boolean par)'''
		cyclic behaviour «behName» for agent «agentName»
			«IF par»
				property intAgent as aid
				on create with intAgent as aid do
					intAgent of this = intAgent
				
			«ENDIF»
			«IF c.roleMakingChoice.name != agentName»
				«FOR MessageL branch: c.branches»
					«createHandler(branch, par)»
				«ENDFOR»
			«ELSE»
				on activate do
					«createProtocol(c, par)»
			«ENDIF»
	'''
	
	//creo behaviour per ricezione messaggio
	def createBehaviour(String behName, String agentName, MessageL m, boolean par)'''
		cyclic behaviour «behName» for agent «agentName»
			«IF m.sendReceive instanceof SenderL»
				«createHandler(m, par)»
			«ELSE»
				«IF par»
					property intAgent as aid
					on create with intAgent as aid do
						intAgent of this = intAgent
					
				«ENDIF»
				on activate do
					«createProtocol(m, par)»
			«ENDIF»
	'''
	
	//creo behaviour per rec annidate
	def createBehaviour(String behName, String agentName, RecursionL r, boolean par)'''
		cyclic behaviour «behName» for agent «agentName»
			«IF par»
				property intAgent as aid
				on create with intAgent as aid do
					intAgent of this = intAgent
				
			«ENDIF»
			on activate do
				«createProtocol(r, par)»
	'''
	
	//creo behaviour per for in rec
	def createBehaviour(String behName, String agentName, ForEachL f, boolean par){
		behaviourNumber++
		val forBodyNum = behaviourNumber
		behQueue.add(getEntry("Behaviour", f.branch.begin, true, behaviourNumber))
		behaviourNumber++
		val forExitNum = behaviourNumber
		behQueue.add(getEntry("Behaviour", f.protocol.begin, false, behaviourNumber))
		return '''
			cyclic behaviour «behName» for agent «agentName»
				on create do
					forCounter = 0
				
				on activate do
					for i in «f.roleset.name»List do
						activate Behaviour«forBodyNum»(i)
					
				on execute do
					if forCounter = 0 do
						activate Behaviour«forExitNum»
						deactivate this
		'''
	}
	
	
	def createHandler(MessageL message, boolean par)'''
		«IF message instanceof MessageNormalL»
			«IF par»
				on message inform «message.messageType» when sender of message = intAgent do
			«ELSE»
				on message inform «message.messageType» do
			«ENDIF»
				«createProtocol(message.protocol.begin, par)»
		«ELSE»
			handler quit
		«ENDIF»
	'''
	
	
	def dispatch createProtocol(MessageL message, boolean p)'''
		«IF message instanceof MessageNormalL»
			«createMessage(message, p)»
		«ENDIF»
		«IF message instanceof MessageQuitL»
			«createMessage(message, p)»
		«ENDIF»
	'''
	
	
	def createMessage(MessageNormalL message, boolean p){
		if(message.sendReceive instanceof ReceiverL)
			if(message.sendReceive.role instanceof RoleSet)
				return '''
				send message inform «message.messageType»(/*payload*/) to «message.sendReceive.role.name»List
				«createProtocol(message.protocol.begin, p)»
			'''
			else return '''
				«IF message.sendReceive.role.name == forVariable»
					send message inform «message.messageType»(/*payload*/) to intAgent
				«ELSE»
					send message inform «message.messageType»(/*payload*/) to «message.sendReceive.role.name»
				«ENDIF»
				«createProtocol(message.protocol.begin, p)»
			'''
			
		else{
			behaviourNumber++;
			if(p){
				behQueue.add(getEntry("Behaviour", message, true, behaviourNumber))
				return '''
					activate Behaviour«behaviourNumber»(intAgent)
					deactivate this'''
			}else{
				behQueue.add(getEntry("Behaviour", message, false, behaviourNumber))
				return '''
					activate Behaviour«behaviourNumber»
					deactivate this'''
			}
			
		}
	}
	
	def createMessage(MessageQuitL message, boolean p){
		if(message.sendReceive instanceof ReceiverL)
			return '''
				send message inform QUIT to «message.sendReceive.role.name»
				deactivate this
			'''
			
		else{
			behaviourNumber++;
			if(p){
				behQueue.add(getEntry("Behaviour", message, true, behaviourNumber))
				return '''
					activate Behaviour«behaviourNumber»(intAgent)
					deactivate this'''
			} else {
				behQueue.add(getEntry("Behaviour", message, false, behaviourNumber))
				return '''
					activate Behaviour«behaviourNumber»
					deactivate this'''
			}
			
		}
	}
	
	/*
	 * se scelta interna, serie di if
	 * se scelta esterna, inserisco nella coda di behaviour
	 */
	def dispatch createProtocol(ChoiceL choice, boolean p){
		buffer = ""
		if(choice.roleMakingChoice.name == agentName){
			return'''
				«FOR MessageL branch: choice.branches»
					if(/*cond*/) do
						«createProtocol(branch, p)»
				«ENDFOR»
			'''
			/*for(MessageL branch: choice.branches){
				if(branch != choice.branches.get(0)){
					buffer += "else "
				}
				if(branch != choice.branches.get(choice.branches.length-1)){
					buffer = buffer + "if(/*cond*) ";
				}
				buffer += "do\n"+createProtocol(branch);
			}
			return buffer;*/
		}else{
			if(p){
				behaviourNumber++;
				behQueue.add(getEntry("Behaviour", choice, true, behaviourNumber))
				return "activate Behaviour"+ behaviourNumber +"(intAgent)\ndeactivate this"
			} else {
				behaviourNumber++;
				behQueue.add(getEntry("Behaviour", choice, false, behaviourNumber))
				return "activate Behaviour"+ behaviourNumber +"\ndeactivate this"
			}
		}
	}
	
	def dispatch createProtocol(ForEachL forEach, boolean p){
		forNumber++;
		behQueue.add(getEntry("ForBehaviour", forEach, true, forNumber))
		forVariable = forEach.eachRole.name
		return "activate ForBehaviour"+forNumber
	}
	
	
	
	def dispatch createProtocol(RecursionL rec, boolean p){
		recursionNumber++;
		if(p){
			behQueue.add(getEntry("Behaviour", rec, true, recursionNumber))
			recNumAssociation.put(rec.name ,recursionNumber);
			return '''
				activate RecBehaviour«recursionNumber»(intAgent)
				deactivate this'''
		} else {
			behQueue.add(getEntry("Behaviour", rec, false, recursionNumber))
			recNumAssociation.put(rec.name ,recursionNumber);
			return '''
				activate RecBehaviour«recursionNumber»
				deactivate this'''
		}	
	}
	
	def dispatch createProtocol(CloseRecursionL closeRec, boolean p){
		var recNumber = recNumAssociation.get(closeRec.recursionVariable.name);
		System.out.println(recNumAssociation +" -> "+ closeRec.recursionVariable.name);
		if(p){
			return '''
				activate RecBehaviour«recNumber»(intAgent)
				deactivate this'''
		} else {
			return '''
				activate RecBehaviour«recNumber»
				deactivate this'''
		}
		
	}
	
	def dispatch createProtocol(EndProtocol end, boolean p)'''
		deactivate this
	'''
	def Entry<String, Entry<Object, Boolean>> getEntry(String s, Object o, Boolean b, Integer n){
		return new SimpleEntry<String, Entry<Object, Boolean>>(s+n, new SimpleEntry<Object, Boolean>(o, b))
	}
}