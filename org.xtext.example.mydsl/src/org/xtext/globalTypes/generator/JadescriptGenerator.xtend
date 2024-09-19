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
	PayloadNames payloadNames = new PayloadNames();
	int behaviourNumber
	int recursionNumber
	int forNumber
	String forVariable
	String forRoleset
	
	
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
						«val ignore = behQueue.add(getEntry("WaitSubAgents", lp, false, behaviourNumber))»
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
								«createProtocol(lp.protocol.begin, false)»
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
				on message inform «message.messageType» when sender of message = intAgent do
			«ELSE»
				on message inform «message.messageType» do
			«ENDIF»
				«createProtocol(message.protocol.begin, par)»
		«ELSE»
			on message inform QUIT do
				remove sender of message from «forRoleset»List
				forCounter = forCounter-1
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
				deactivate this'''
		} else {
			behQueue.add(getEntry("RecBehaviour", rec, false, recursionNumber))
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
				forCounter = forCounter-1
				deactivate this'''
		} else {
			return '''
				activate RecBehaviour«recNumber»
				deactivate this'''
		}
		
	}
	
	def dispatch createProtocol(EndProtocol end, boolean p)'''
		«IF p»
			forCounter = forCounter-1
		«ENDIF»
		deactivate this
	'''
	def Entry<String, Entry<Object, Boolean>> getEntry(String s, Object o, Boolean b, Integer n){
		return new SimpleEntry<String, Entry<Object, Boolean>>(s+n, new SimpleEntry<Object, Boolean>(o, b))
	}
}