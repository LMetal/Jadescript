/*
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.validation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.xtext.globalTypes.myDsl.Choice;
import org.xtext.globalTypes.myDsl.ChoiceL;
import org.xtext.globalTypes.myDsl.Definition;
import org.xtext.globalTypes.myDsl.ForEach;
import org.xtext.globalTypes.myDsl.GlobalProtocol;
import org.xtext.globalTypes.myDsl.LocalProtocol;
import org.xtext.globalTypes.myDsl.Message;
import org.xtext.globalTypes.myDsl.MessageL;
import org.xtext.globalTypes.myDsl.MessageNormal;
import org.xtext.globalTypes.myDsl.MessageQuit;
import org.xtext.globalTypes.myDsl.Model;
import org.xtext.globalTypes.myDsl.MyDslPackage;
import org.xtext.globalTypes.myDsl.Payload;
import org.xtext.globalTypes.myDsl.ReceiverL;
import org.xtext.globalTypes.myDsl.Role;
import org.xtext.globalTypes.myDsl.RoleSet;
import org.xtext.globalTypes.myDsl.RoleOne;
import org.xtext.globalTypes.myDsl.Roles;
import org.xtext.globalTypes.myDsl.SenderL;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MyDslValidator extends AbstractMyDslValidator {
	
		@Check
		public void uniqueDefinitions(Model m) {
			List<Definition> definitions = m.getDefinitions();
			var defNames = new HashMap<String, Definition>();
			
			for(Definition d : definitions) {
				if(defNames.containsKey(d.getName())) {
					error(
							"Definition names must be unique",
							d,
							MyDslPackage.Literals.DEFINITION__NAME
						);
					error(
							"Definition names must be unique",
							defNames.get(d.getName()),
							MyDslPackage.Literals.DEFINITION__NAME
						);
				}
				else {
					defNames.put(d.getName(), d);
				}
			}
		}
	
		@Check
		public void rightDefinitionsPatternGlobal(Model mod) {
			List<Definition> definitions = EcoreUtil2.getAllContentsOfType(mod, Definition.class);
			List<Message> messages = EcoreUtil2.getAllContentsOfType(mod, Message.class);
			
			for(Message m: messages) {
				//System.out.println("check "+m.getMessageType().getName());
				if(m instanceof MessageQuit) continue;

				MessageNormal mn = (MessageNormal) m;
				//System.out.println(mn.getMessageType().getName());
				Definition d = definitions.stream()
                        .filter(def -> def.getName().equals(mn.getMessageType().getName()))
                        .findFirst()
                        .orElse(null);
				//System.out.println(d.getTypes());
				
				//se payload messaggio null
				if(mn.getPayload() == null) {
					if(d.getTypes().size() != 0) {
						error(
							"Wrong paylod pattern",
							mn,
							MyDslPackage.Literals.MESSAGE_NORMAL__PAYLOAD
						);
					}
				} else {
					EList<String> payload = mn.getPayload().getTypes();
					//System.out.println("payload: "+payload);
					EList<String> pattern = d.getTypes();
					//System.out.println(payload + " "+ pattern);

					
					if(payload.size() != pattern.size()) {
						error(
								"Wrong paylod pattern",
								mn,
								MyDslPackage.Literals.MESSAGE_NORMAL__PAYLOAD
								);
						continue;
					}

					for(int i=0; i<d.getTypes().size(); i++) {
						//System.out.println(payload.get(i) + " "+pattern.get(i));
						if(!payload.get(i).equals(pattern.get(i))) {
							error(
								"Wrong paylod pattern",
								mn,
								MyDslPackage.Literals.MESSAGE_NORMAL__PAYLOAD
								);
						}
					}
				}
			}
		}
		
		@Check
		public void choiceMessageFromChoiceAgent(Choice c) {
			for(Message m: c.getBranches()) {
				if(m.getSender() != c.getRole()) {
					error(
						"Sender of message must be role making choice",
						m,
						MyDslPackage.Literals.MESSAGE__SENDER
					);
				}
			}	
		}
		
		
		//@Check
		public void choiceMessageFromChoiceAgentLocal(LocalProtocol lp) {
			for(ChoiceL c: EcoreUtil2.getAllContentsOfType(lp, ChoiceL.class)) {
				for(MessageL m: c.getBranches()) {
					if(c.getRoleMakingChoice().getName().equals(lp.getProjectedRole().getName())) { //problema con roleset
						//se scelta interna deve essere un invio di messaggio
						//System.out.println(m.getSendReceive() instanceof ReceiverL);
						if(m.getSendReceive() instanceof SenderL) {
							error(
								"Must send message when making a choice" + c.getRoleMakingChoice().getName() + lp.getProjectedRole().getName(),
								m,
								MyDslPackage.Literals.MESSAGE_L__SEND_RECEIVE
							);
						}
					} else {
						//con scelta esterna ricevo messaggio dal ruolo che fa la scelta
						if(!m.getSendReceive().getRole().equals(c.getRoleMakingChoice())) {
							error(
								"Must receive message from role making choice "+ c.getRoleMakingChoice().getName() +" "+ lp.getProjectedRole().getName(),
								m,
								MyDslPackage.Literals.MESSAGE_L__SEND_RECEIVE
							);
						}
					}
				}
			}
		}
		
		@Check
		public void differentMessagesAtChoiceBranch(Choice c) {
			var messageTypeMap = new HashMap<String, Message>();
			
			for(Message m: c.getBranches()) {
				if(messageTypeMap.containsKey(m.getMessageType().getName())) {
					error("Messages must be different",
							m,
							MyDslPackage.Literals.MESSAGE__MESSAGE_TYPE);
					error("Messages must be different",
							messageTypeMap.get(m.getMessageType().getName()),
							MyDslPackage.Literals.MESSAGE__MESSAGE_TYPE);
				} else {
					messageTypeMap.put(m.getMessageType().getName(), m);
				}
			}
		}
		
		@Check
		public void sameReceiverChoice(Choice c) {
			Message firstMessage = null;
			
			for(Message m: c.getBranches()) {
				if(firstMessage==null) firstMessage = m;
				else {
					if(m.getReceiver() != firstMessage.getReceiver()) {
						error(
							"Receiver of first message must be equal in each branch",
							m,
							MyDslPackage.Literals.MESSAGE__RECEIVER
						);
						error(
							"Receiver of first message must be equal in each branch",
							firstMessage,
							MyDslPackage.Literals.MESSAGE__RECEIVER
						);
					}
				}
			}
		}
		
		@Check
		public void noSelfMessage(Model global) {
			for(Message m: EcoreUtil2.getAllContentsOfType(global, MessageNormal.class)) {
				if(m.getSender() == m.getReceiver()) {
				error(
					"No self-message is allowed [" + m.getSender() + " "+m.getReceiver() + "]",
					m,
					MyDslPackage.Literals.MESSAGE__SENDER
				);
				
				error(
					"No self-message is allowed",
					m,
					MyDslPackage.Literals.MESSAGE__RECEIVER
				);
				}
			}
			
		}
		
		
		
		HashMap<RoleSet, RoleOne> getRolesetRef(Model m) {
			List<RoleSet> rolesetDef = EcoreUtil2.getAllContentsOfType(m, RoleSet.class);
			System.out.println(rolesetDef);
			var references = new HashMap<RoleSet, RoleOne>();
			for(RoleSet r: rolesetDef) {
				references.put(r, r.getRef());
			}
			return references;
		}
		
		HashMap<RoleSet, RoleOne> getRolesetRef(GlobalProtocol g) {
			List<RoleSet> rolesetDef = EcoreUtil2.getAllContentsOfType(g, RoleSet.class);
			
			var references = new HashMap<RoleSet, RoleOne>();
			for(RoleSet r: rolesetDef) {
				references.put(r, r.getRef());
			}
			return references;
		}
		
		

		@Check
		public void rightRefRoleForEach(GlobalProtocol glob_p) {
			var rolesetRef = getRolesetRef(glob_p);
			List<ForEach> forEachList = EcoreUtil2.getAllContentsOfType(glob_p, ForEach.class);
			
			for(ForEach f : forEachList) {
				if(f.getRefRole() != rolesetRef.get(f.getRoleset())) {
					error(
						"Role cicling over Roleset must be referent of that Roleset",
						f,
						MyDslPackage.Literals.FOR_EACH__REF_ROLE
						);
				}
			}
		}
		

		@Check
		public void forEachVariableScope(Model m) {
			//ottengo tutti i ForEach
			List<ForEach> forEachList = EcoreUtil2.getAllContentsOfType(m, ForEach.class);
			//ottengo tutto, ogni action
			List<EObject> allActions = EcoreUtil2.getAllContentsOfType(m, EObject.class);
			
			//ciclo sui ForEach, controllo una variabile di ciclo alla volta
			for(ForEach f : forEachList) {
				//ottengo il contenuto del ForEach
				List<EObject> forEachActions = EcoreUtil2.getAllContentsOfType(f, EObject.class);
				//ciclo sul contenuto
				for(EObject action : allActions) {
					//può essere questo errore solo se ci si trova fuori dal foreach di cui si sta controllando la variabile
					if(!forEachActions.contains(action)) {
						//differisco per tipo di action e controllo
						if(action instanceof Message) {
							//se il sender o receiver di un messaggio fuori dal foreach è il ruolo definito nel foreach, errore
							Message message = (Message) action;
							if(message.getSender() == f.getLoopRole()) {
								error("Role not defined in this scope",
										message,
										MyDslPackage.Literals.MESSAGE__SENDER
										);}
							if(message.getReceiver() == f.getLoopRole()) {
								error("Role not defined in this scope",
										message,
										MyDslPackage.Literals.MESSAGE__RECEIVER
										);}
						}
						
						if(action instanceof Choice) {
							Choice choice = (Choice) action;
							if(choice.getRole() == f.getLoopRole()) {
								error("Role not defined in this scope",
										choice,
										MyDslPackage.Literals.CHOICE__ROLE
										);}
							}
						}
	
				}
			}
		}
		
		
		@Check
		public void noNestedFor(ForEach f) {
			List<ForEach> list = EcoreUtil2.getAllContentsOfType(f.getForBody(), ForEach.class);
			if(!list.isEmpty()) {
				error("Nested for are not allowed",
						list.get(0),
						MyDslPackage.Literals.FOR_EACH__FOR_BODY);
						
			}
		}
		
		
		@Check
		public void noRolesetSender(Message m) {
			if(m.getSender() instanceof RoleSet) {
				error("Sender of message must not be a role multiple",
						m,
						MyDslPackage.Literals.MESSAGE__SENDER);
			}
		}
		
		
		@Check
		public void messageToRolesetRef(GlobalProtocol glob_p) {
			List<Message> messageList = EcoreUtil2.getAllContentsOfType(glob_p, Message.class);
			var rolesetRef = getRolesetRef(glob_p);
			
			for(Message m : messageList) {
				if(m.getReceiver() instanceof RoleSet) {
					if(m.getSender() != rolesetRef.get(m.getReceiver())) {
						error(
							"Sender role must be referent of that Roleset",
							m,
							MyDslPackage.Literals.MESSAGE__SENDER
						);
					}
				}
			}
		}
		
		
		@Check
		public void rightForEachInteractions(GlobalProtocol glob_p) {
			//estraggo lista di foreach
			List<ForEach> eachList = EcoreUtil2.getAllContentsOfType(glob_p, ForEach.class);
			//estraggo lista di dichiarazione di roleset
			List<RoleSet> rolesetDef = EcoreUtil2.getAllContentsOfType(glob_p, RoleSet.class);
			
			//associo roleset a referente
			var references = new HashMap<RoleSet, RoleOne>();
			for(RoleSet r: rolesetDef) {
				references.put(r, r.getRef());
			}
			
			for(ForEach f : eachList) {
				//estraggo tutti i messaggi del foreach
				List<Message> messagesToCheck = EcoreUtil2.getAllContentsOfType(f, Message.class);
				
				for(Message mess : messagesToCheck) {
					if(mess.getReceiver() == f.getLoopRole()) {
						if(mess.getSender() != references.get(f.getRoleset())) {
							error("Sender of message must be reference of receiver",
									mess,
									MyDslPackage.Literals.MESSAGE__SENDER);
						}
					}
					
					if(mess.getSender() == f.getLoopRole()) {
						if(mess.getReceiver() != references.get(f.getRoleset())) {
							error("Receiver of message must be reference of sender",
									mess,
									MyDslPackage.Literals.MESSAGE__RECEIVER);
						}
					}
				}
				
			}
			
		}
		
		
		@Check
		public void uniqueRoleName(Model m) {
			//estraggo tutte le dichiarazioni di Role nel model
			List<Role> roles = EcoreUtil2.getAllContentsOfType(m, Roles.class).get(0).getRoles();
			//associazione nome ruolo dichiarato, oggetto Role
			var declaredRoles = new HashMap<String, Role>();
			
			for(Role r : roles) {
				if(declaredRoles.containsKey(r.getName())) {
					error("Role's name must be unique", 
							r,
							MyDslPackage.Literals.ROLE__NAME
							);
					
					error("Role's name must be unique", 
							declaredRoles.get(r.getName()),
							MyDslPackage.Literals.ROLE__NAME
							);
				} else {
					declaredRoles.put(r.getName(), r);
				}
			}
			
			//check variabili di loop ForEach, possono essere uguali tra loro ma non con i Role già in uso
			List<ForEach> forEachList = EcoreUtil2.getAllContentsOfType(m, ForEach.class);
			for(ForEach f : forEachList) {
				if(declaredRoles.containsKey(f.getLoopRole().getName())) {
					error("Role's name must be unique", 
							f.getLoopRole(),
							MyDslPackage.Literals.ROLE__NAME
							);
				}
			}
		}
	
}
