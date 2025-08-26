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
import org.xtext.globalTypes.myDsl.CloseRecursion

class JadescriptGenerator {
	Queue<Entry<String, Entry<Object, Boolean>>> behQueue; //object is either a MessageNormal or a ChoiceL
	HashMap<String, Integer> recNumAssociation;
	String agentString;
	String agentName;
	String buffer;
	OntologyTypes ontology = new OntologyTypes();
	PayloadNames payloadNames = new PayloadNames();
	int waitNumber
	int behaviourNumber //incremental number of behaviour
	int recursionNumber
	int forNumber
	String forVariable
	String forRoleset
	boolean inCreateAgent = true
	int iteration = 0
	int forBodyNum
	int forExitNum
	
	
	def CharSequence translate(LocalProtocol lp, EList<Definition> definitions){
		agentString = new String()
		behQueue = new LinkedList<Entry<String, Entry<Object, Boolean>>>();
		recNumAssociation = new HashMap<String, Integer>();
		payloadNames.init(definitions);
		ontology.init(definitions);
		//agentString = printOntology(lp, definitions).toString
		agentName = lp.projectedRole.name
		waitNumber = 0
		behaviourNumber = 0
		recursionNumber = 0
		forNumber = 0
		inCreateAgent = true
		
		
		agentString = agentString + "\n\n" + createAgent(lp)
		
		//print behaviors loop
		while(behQueue.peek !== null){
			inCreateAgent = false
			
			var entry = behQueue.poll
			var firstObj = entry.getValue.getKey
			var behName = entry.getKey
			var par = entry.getValue.getValue
			
			System.out.println(entry.toString());
			if(firstObj instanceof ChoiceL){
				System.out.println("*******CHOICEL*******"+ entry.toString());
				agentString += "\n\n\n" + createBehaviour(behName, agentName, firstObj as ChoiceL, par)
			}
			else if(firstObj instanceof MessageL){
				System.out.println("*******MESSAGEL*******"+ entry.toString());
				agentString += "\n\n\n" + createBehaviour(behName, agentName, firstObj as MessageL, par)
				}
			else if(firstObj instanceof RecursionL){
				System.out.println("*******RECURSIONL*******"+ entry.toString());
				agentString += "\n\n\n" + createBehaviour(behName, agentName, firstObj as RecursionL, par)
				}
			else if(firstObj instanceof LocalProtocol){
				System.out.println("*******LOCALPROTOCOLL*******"+ entry.toString());
				agentString = agentString + "\n\n\n" + createWaitAgents(behName, firstObj as LocalProtocol)
				}
			else if(firstObj instanceof RoleSet){
				System.out.println("*******ROLESET*******"+ entry.toString());
				agentString = agentString + "\n\n\n" + createWaitAgents(behName, firstObj as RoleSet)
				}
			else if(firstObj instanceof ForEachL){
				System.out.println("*******FOREACH???*******"+ entry.toString());
				agentString += "\n\n\n" + createBehaviour(behName, agentName, firstObj as ForEachL, par)
				}
			else if(firstObj instanceof EndProtocol){
				System.out.println("*******END*******"+ entry.toString());
				agentString += "\n\n\n" + createBehaviour(behName, agentName, firstObj as EndProtocol, par)
				}
			else if(firstObj instanceof CloseRecursion){
				System.out.println("*******LOOP*******"+ entry.toString());
				agentString += "\n\n\n" + createBehaviour(behName, agentName, firstObj as CloseRecursion, par)
				}
			
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
		function cloneListOfAIDs(
			agents as list of aid) as list of aid do
			result = [] of aid
			for peer in agents do
				add peer to result
			return result
		
		agent «lp.projectedRole.name» uses ontology «lp.protocolName»
			«var mapList = EcoreUtil2.getAllContentsOfType(lp, ForEachL)»
			«IF !mapList.empty »
			property forCounter as integer
			property forAidList as list of aid
			«ENDIF»
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
					property «r.name» as aid = "«r.name»"@
				«ENDIF»
			«ENDFOR»
			
			on create do
				«FOR r: rolesetList»
					«IF lp.projectedRole.name.equals(r.ref.name)»
						activate WaitSubAgents«waitNumber»
						«val ignore = behQueue.add(getEntry("WaitSubAgents", lp, false, waitNumber++))»
						«val ignore2 = isDone = 1»
					«ENDIF»
				«ENDFOR»
				«IF lp.projectedRole instanceof RoleSet»
					activate ContactCoordinator«behaviourNumber»
					«val ignore = behQueue.add(getEntry("ContactCoordinator", lp.projectedRole, false, behaviourNumber))»
				«ENDIF»
				«IF (isDone == 0)»
					«createProtocol(lp.protocol.begin, false)»
				«ENDIF»
		'''
		// behQueue.add(getEntry("Behaviour", f.branch.begin, true, behaviourNumber))
		// «val ignore = behQueue.add(new SimpleEntry<String, Object>("ContactCoordinator"+behaviourNumber, lp.projectedRole))»
		// «val ignore = behQueue.add(new SimpleEntry<String, Object>("WaitSubAgents"+behaviourNumber, lp))»
	
	def dispatch createWaitAgents(String name, LocalProtocol lp){
		var rolesetList = EcoreUtil2.getAllContentsOfType(lp.roles, RoleSet);
		'''
			«FOR r : rolesetList»
				«IF agentName.equals(r.ref.name)»
						cyclic behaviour «name» for agent «agentName»
							property initTime as timestamp
						    property timeout as duration = "PT1S" as duration
						    on create do
						        initTime = now
						
							on message inform «r.ref.name»Hello do
								add sender of message to «r.name»List
								
							on execute do
							    if(now > initTime + timeout) do
									«createProtocol(lp.protocol.begin, false)»
				«ENDIF»
			«ENDFOR»
		'''
		}
		
	def dispatch createWaitAgents(String name, RoleSet r){
		'''
			one shot behaviour «name» for agent «agentName»
				on execute do
					send message inform «r.ref.name»Hello to «r.ref.name»
		'''
	}
	
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
			«IF par»
				property intAgent as aid
				on create with intAgent as aid do
					intAgent of this = intAgent
					
			«ENDIF»
			«IF m.sendReceive instanceof SenderL»
				«createHandler(m, par)»
			«ELSE»
				on activate do
					«createProtocol(m, par)»
			«ENDIF»
	'''
	
	//creo behaviour per rec
	def createBehaviour(String behName, String agentName, RecursionL r, boolean par)'''
		cyclic behaviour «behName» for agent «agentName»
			«IF par»
				property intAgent as aid
				on create with intAgent as aid do
					intAgent of this = intAgent
				
			«ENDIF»
			on activate do
				«createProtocol(r.recProtocol.begin, par)»
	'''
	
	//creo behaviour per for
	def createBehaviour(String behName, String agentName, ForEachL f, boolean par){
		behaviourNumber++
		forBodyNum = behaviourNumber
		behQueue.add(getEntry("Behaviour", f.branch.begin, true, behaviourNumber))
		behaviourNumber++
		forExitNum = behaviourNumber
		behQueue.add(getEntry("Behaviour", f.protocol.begin, false, behaviourNumber))
		return '''
			cyclic behaviour «behName» for agent «agentName»
				on activate do
					forCounter = length of «f.roleset.name»List
					forAidList = cloneListOfAIDs(«f.roleset.name»List)
					
					for i in forAidList do
						activate Behaviour«forBodyNum»(i)
		'''
	}
	
	
	//creo behaviour per end
	def createBehaviour(String behName, String agentName, EndProtocol r, boolean par)'''
		oneshot behaviour «behName» for agent «agentName»
			on activate do
				log "reached sub-protocol end"
	'''
	
	//creo behaviour per loop
	def createBehaviour(String behName, String agentName, CloseRecursion r, boolean par)'''
		oneshot behaviour «behName» for agent «agentName»
			«IF par»
				property intAgent as aid
				on create with intAgent as aid do
					intAgent of this = intAgent
				
			«ENDIF»
			on activate do
				«createProtocol(r, par)»
	'''
	
	
	def createHandler(MessageL message, boolean par)'''
		«IF message instanceof MessageNormalL»
			«IF par»
				on message inform(«message.messageType»«messageOntologyHandler(message, true)») when sender of message = intAgent do
			«ELSE»
				on message inform(«message.messageType»«messageOntologyHandler(message, true)») do
			«ENDIF»
				«createProtocol(message.protocol.begin, par)»
		«ELSE»
			«IF par»
				on message inform QUIT when sender of message = intAgent do
			«ELSE»
				on message inform QUIT do
			«ENDIF»
				remove sender of message from «forRoleset»List
				forCounter = forCounter-1
				if forCounter = 0 do
					activate Behaviour«forExitNum»
				«deactivate()»
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
				send message inform(«message.messageType»«messageOntologyHandler(message, false)») to «message.sendReceive.role.name»List
				«createProtocol(message.protocol.begin, p)»
			'''
			else return '''
				«IF message.sendReceive.role.name == forVariable»
					send message inform(«message.messageType»«messageOntologyHandler(message, false)») to intAgent
				«ELSE»
					send message inform(«message.messageType»«messageOntologyHandler(message, false)») to «message.sendReceive.role.name»
				«ENDIF»
				«createProtocol(message.protocol.begin, p)»
			'''
			
		else{
			behaviourNumber++;
			if(p){
				behQueue.add(getEntry("Behaviour", message, true, behaviourNumber))
				return '''
					activate Behaviour«behaviourNumber»(intAgent)
					«deactivate()»'''
			}else{
				behQueue.add(getEntry("Behaviour", message, false, behaviourNumber))
				return '''
					activate Behaviour«behaviourNumber»
					«deactivate()»'''
			}
			
		}
	}
	
	
	def String messageOntologyHandler(MessageNormalL message, boolean decision){
		var nameOntology = ontology.extractOntology(message.messageType);
		if(nameOntology.equals("@proposition"))
			return ""
		else{
			if(decision){
				return payloadNames.getPayload(message.messageType, false);
			}
			else{
				// estraggo tutti i campi che ha quella definizione
				// compongo una stringa
				// ritorno la stringa
				return payloadNames.getPayload(message.messageType, true);
			}
		}
	}
	
	def createMessage(MessageQuitL message, boolean p){
		if(message.sendReceive instanceof ReceiverL)
			return '''
				send message inform QUIT() to «message.sendReceive.role.name»
				«deactivate()»
			'''
			
		else{
			behaviourNumber++;
			if(p){
				behQueue.add(getEntry("Behaviour", message, true, behaviourNumber))
				return '''
					activate Behaviour«behaviourNumber»(intAgent)
					«deactivate()»'''
			} else {
				behQueue.add(getEntry("Behaviour", message, false, behaviourNumber))
				return '''
					activate Behaviour«behaviourNumber»
					«deactivate()»'''
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
			iteration = 0
			val numBranches = choice.branches.length
			return'''
				«FOR MessageL branch: choice.branches»
					«IF iteration++ == 0»
						if(/*cond*/) do
							«createProtocol(branch, p)»
					«ELSE»«
						IF iteration++ != numBranches»
							else if(/*cond*/) do
								«createProtocol(branch, p)»
						«ELSE»
							else do
								«createProtocol(branch, p)»
						«ENDIF»
					«ENDIF»
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
		forRoleset = forEach.roleset.name
		return "activate ForBehaviour"+forNumber
	}
	
	
	
	def dispatch createProtocol(RecursionL rec, boolean p){
		recursionNumber++;
		if(p){
			behQueue.add(getEntry("RecBehaviour", rec, true, recursionNumber))
			recNumAssociation.put(rec.name ,recursionNumber);
			return '''
				activate RecBehaviour«recursionNumber»(intAgent)
				«deactivate()»'''
		} else {
			behQueue.add(getEntry("RecBehaviour", rec, false, recursionNumber))
			recNumAssociation.put(rec.name ,recursionNumber);
			return '''
				activate RecBehaviour«recursionNumber»
				«deactivate()»'''
		}	
	}
	
	def dispatch createProtocol(CloseRecursionL closeRec, boolean p){
		var recNumber = recNumAssociation.get(closeRec.recursionVariable.name);
		System.out.println(recNumAssociation +" -> "+ closeRec.recursionVariable.name);
		if(p){
			return '''
				activate RecBehaviour«recNumber»(intAgent)
				«deactivate()»'''
		} else {
			return '''
				activate RecBehaviour«recNumber»
				«deactivate()»'''
		}
		
	}
	
	def dispatch createProtocol(EndProtocol end, boolean p)'''
		«IF p»
			forCounter = forCounter-1
			if forCounter = 0 do
				activate Behaviour«forExitNum»
		«ENDIF»
		«deactivate()»
	'''
	def Entry<String, Entry<Object, Boolean>> getEntry(String s, Object o, Boolean b, Integer n){
		return new SimpleEntry<String, Entry<Object, Boolean>>(s+n, new SimpleEntry<Object, Boolean>(o, b))
	}
	
	def deactivate() {
		if(!inCreateAgent) return "deactivate this"
		else return ""
	}
}