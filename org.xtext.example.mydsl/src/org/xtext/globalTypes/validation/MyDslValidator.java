/*
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.validation;


import java.util.HashMap;
import java.util.List;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.xtext.globalTypes.myDsl.Choice;
import org.xtext.globalTypes.myDsl.ForEach;
import org.xtext.globalTypes.myDsl.Message;
import org.xtext.globalTypes.myDsl.Model;
import org.xtext.globalTypes.myDsl.MyDslPackage;
import org.xtext.globalTypes.myDsl.Role;
import org.xtext.globalTypes.myDsl.RoleSet;
import org.xtext.globalTypes.myDsl.RoleOne;
import org.xtext.globalTypes.myDsl.Roles;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MyDslValidator extends AbstractMyDslValidator {		
		
		@Check
		public void choiceMessageFromChoiceAgent(Choice c) {
			for(int i=0; i<c.getMessage().size(); i++) {
				if(c.getRole() != c.getMessage().get(i).getSender()) {
					error("Role sending message must be the role chosing",
							c,
							MyDslPackage.Literals.CHOICE__ROLE
							);
					error("Role sending message must be the role chosing",
							c.getMessage().get(i),
							MyDslPackage.Literals.MESSAGE__SENDER
							);
				}
			}
			
		}
		
		//TODO
		//add verification each loop variable not used after each loop
		
		
		@Check
		public void singleSender(Message m) {
			if(m.getSender() instanceof RoleSet) {
				error("Sender of message must not be a role multiple",
						m,
						MyDslPackage.Literals.MESSAGE__SENDER);
			}
		}
		
		
		@Check
		public void rightForEachInteractions(Model m) {
			//estraggo lista di foreach
			List<ForEach> eachList = EcoreUtil2.getAllContentsOfType(m, ForEach.class);
			//estraggo lista di dichiarazione di roleset
			List<RoleSet> rolesetDef = EcoreUtil2.getAllContentsOfType(m, RoleSet.class);
			
			//associo roleset a referente
			var references = new HashMap<RoleSet, RoleOne>();
			for(RoleSet r: rolesetDef) {
				references.put(r, r.getRef());
			}
			
			for(ForEach f : eachList) {
				//estraggo tutti i messaggi del foreach
				List<Message> messagesToCheck = EcoreUtil2.getAllContentsOfType(f, Message.class);
				
				for(Message mess : messagesToCheck) {
					if(mess.getReceiver() == f.getEachRole()) {
						if(mess.getSender() != references.get(f.getRole())) {
							error("Sender of message must be reference of receiver",
									mess,
									MyDslPackage.Literals.MESSAGE__SENDER);
						}
					}
					
					if(mess.getSender() == f.getEachRole()) {
						if(mess.getReceiver() != references.get(f.getRole())) {
							error("Receiver of message must be reference of sender",
									mess,
									MyDslPackage.Literals.MESSAGE__RECEIVER);
						}
					}
				}
				
			}
			
		}
		
		
		@Check
		public void uniqueRoleName(Model model) {
			//estraggo tutte le dichiarazioni di Role nel model
			List<Role> roles = EcoreUtil2.getAllContentsOfType(model, Role.class);
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
		}
	
}
