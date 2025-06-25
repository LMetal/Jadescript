package org.xtext.globalTypes.generator;

import org.xtext.globalTypes.myDsl.impl.*;
import org.eclipse.emf.ecore.EObject;
import org.xtext.globalTypes.myDsl.*;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Participants {
		
	private HashMap<RoleOne, RoleSet> rho;
	private Set<RoleOne> roleOne;
	private Set<RoleOne> loopRole;
	
	public Participants() {
		// creation of HashMap and ArrayList
		rho = new HashMap<>();
		roleOne = new LinkedHashSet<>();
		loopRole = new LinkedHashSet<>();
	}
	
	public void resetLists() {
		// reset to be used after an iteration of code generation
		rho.clear();
		roleOne.clear();
		loopRole.clear();
	}
	
	public void addRoleOne(EObject globalProtocol) {
		
		RolesImpl roles = (RolesImpl) ((GlobalProtocolImpl) globalProtocol).getRoles();
		//System.out.println(roles.getRoles().toString());
		for(Role x : roles.getRoles()) {
			if(x instanceof RoleOneImpl) {
				//result.put(((RoleOneImpl) x).getName().toString(), ((RoleOneImpl) x).getName().toString());
				roleOne.add((RoleOneImpl)x);
				//System.out.println("RoleOne found: " + ((RoleOne)x).toString());
				//System.out.println("name: " + ((RoleOneImpl) x).getName().toString());
			}
		}
		
	}
	
	// function to add variables used in forLoop
	private void addRhoHash(EObject forEach){
		System.out.println("Found a loop");
		// check in order to avoid duplicates of the same loop variable
		if(!rho.containsKey(((ForEachImpl) forEach).getLoopRole())) {
			rho.put(((ForEachImpl) forEach).getLoopRole(), ((ForEachImpl) forEach).getRoleset());
			loopRole.add(((ForEachImpl) forEach).getLoopRole());
		}
		System.out.println("rho:"+rho.toString());
	}
		
	public HashMap<RoleOne, RoleSet> getRho() {
		return rho;
	}
	
	public Set<RoleOne> getListRoleOne(){
		return roleOne;
	}
	
	public Set<RoleOne> getListLoopRole(){
		return loopRole;
	}
	
	/*
	 * RoleSet(Q, 𝜌) =︃
			R if Q = R ∨ (Q = 𝑥 ∧ 𝑥 : R ∈ 𝜌)
			p if Q = p for some p
	*/
	public Role roleSet(Role examined) {
		
		// R if Q = R
		if(examined instanceof RoleSet) { // if examined is a RoleSet class
			return examined;
		}
		
		// (Q = 𝑥 ∧ 𝑥 : R ∈ 𝜌)
		else if(loopRole.contains((RoleOne) examined)) { // if examined is a RoleOne class contained in the loopRole list
			if(rho.containsKey((RoleOne) examined)) { // search if a RoleOne is contained in the hash table
				return rho.get((RoleOne) examined);
			}else return null;
		}
		
		
		// p if Q = p for some p
		else if(examined instanceof RoleOne) { // if examined is a RoleOne class, we search in the RoleOne list
			for(RoleOne role: roleOne)
				if(examined.equals(role)) 	   // if is equal to a RoleOne, we return that
						return role;
			return null;
		}else {
		return null;
		}
	}
	
	private Role roleSet3(Role examined) {
		if(examined instanceof RoleSet) {
			return examined;
		} else {
			if(roleOne.contains(examined)) return examined;
			return null;
		}
	}
	
	// Parts(p → Q{ ℓ𝑖⟨S𝑖⟩.G𝑖 }𝑖∈𝐼 , 𝜌) = {RoleSet(p, 𝜌),RoleSet(Q, 𝜌) } U𝑖∈𝐼 Parts(G𝑖)
	public Set<Role> partsMessage(EObject message){
		Set<Role> parts = new LinkedHashSet<>();
		Set<Role> partsGlobal = new LinkedHashSet<>();
		// RoleSet(p, 𝜌)
		parts.add(roleSet(((MessageImpl)message).getSender()));
		// RoleSet(Q, 𝜌)
		parts.add(roleSet(((MessageImpl)message).getReceiver()));
		// U𝑖∈𝐼 Parts(G𝑖)
		// obtaining the global protocol after the message
		if(message instanceof MessageQuitImpl) return parts;
		EObject protocol = ((MessageNormalImpl)message).getProtocol();
		EObject begin = ((ProtocolImpl)protocol).getBegin();
		// search for the type of protocol in order to use the right Parts function
		if(begin instanceof MessageNormalImpl)
			partsGlobal = partsMessage(begin);
		else if(begin instanceof RecursionImpl)
			partsGlobal = partsRecursion(begin);
		else if(begin instanceof ForEachImpl)
			partsGlobal = partsFor(begin);
		else if(begin instanceof MessageQuitImpl)
			partsGlobal = partsQuit(begin);
		else if(begin instanceof ChoiceImpl)
			partsGlobal = partsChoice(begin);
		// merging the results
		parts.addAll(partsGlobal);
		
		System.out.println(parts);
		return parts;
	}
	
	// Parts(𝜇X.G, 𝜌) = Parts(G, 𝜌), Parts(End) = Parts(X) = ∅
	public Set<Role> partsRecursion(EObject recursion){
		Set<Role> parts = new LinkedHashSet<>();
		EObject begin = ((ProtocolImpl)((RecursionImpl)recursion).getRecProtocol()).getBegin();
		if(begin instanceof MessageNormalImpl)
			parts = partsMessage(begin);
		else if(begin instanceof RecursionImpl)
			parts = partsRecursion(begin);
		else if(begin instanceof ForEachImpl)
			parts = partsFor(begin);
		else if(begin instanceof MessageQuitImpl)
			parts = partsQuit(begin);
		else if(begin instanceof ChoiceImpl)
			parts = partsChoice(begin);
	
		return parts;
	}
	
	// Parts(for 𝑥 : ⟨R, q⟩ G1;G2, 𝜌) = Parts(G1, 𝜌[𝑥 ↦→ R]) U Parts(G2, 𝜌)
	public Set<Role> partsFor(EObject forEach){
		Set<Role> partsGlobal1 = new LinkedHashSet<>();
		Set<Role> partsGlobal2 = new LinkedHashSet<>();
		
		RoleSet Roleset = ((ForEachImpl)forEach).getRoleset();
		// extracting begin of forBody protocol
		EObject begin1 = ((ProtocolImpl)((ForEachImpl)forEach).getForBody()).getBegin();
		// extracting begin of protocol after forEach
		//EObject begin2 = ((ProtocolImpl)((ForEachImpl)forEach).getProtocol()).getBegin();
		// Parts(G1, 𝜌[𝑥 ↦→ R])
		// a modify to hashmap rho is neeeded
		addRhoHash((ForEachImpl)forEach);
		if(begin1 instanceof MessageNormalImpl)
			partsGlobal1 = partsMessage(begin1);
		else if(begin1 instanceof RecursionImpl)
			partsGlobal1 = partsRecursion(begin1);
		else if(begin1 instanceof ForEachImpl)
			partsGlobal1 = partsRecursion(begin1);
		else if(begin1 instanceof MessageQuitImpl)
			partsGlobal1 = partsQuit(begin1);
		else if(begin1 instanceof ChoiceImpl)
			partsGlobal1 = partsChoice(begin1);
		// Parts(G2, 𝜌)
		/*if(begin2 instanceof MessageNormalImpl)
			partsGlobal2 = partsMessage(begin2);
		else if(begin2 instanceof RecursionImpl)
			partsGlobal2 = partsRecursion(begin2);
		else if(begin2 instanceof ForEachImpl)
			partsGlobal2 = partsRecursion(begin2);
		else if(begin2 instanceof MessageQuitImpl)
			partsGlobal2 = partsQuit(begin2);
		else if(begin2 instanceof ChoiceImpl)
			partsGlobal2 = partsChoice(begin2);
		// merging the results
		partsGlobal1.addAll(partsGlobal2);*/
		partsGlobal1.add(Roleset);
		
		System.out.println(partsGlobal1);
		return partsGlobal1;
		
	}
	// Parts(𝑥 → q ℓQuit ) = {RoleSet(𝑥, 𝜌), q }
	public Set<Role> partsQuit(EObject messageQuit){
		Set<Role> parts = new LinkedHashSet<>();
		parts.add(((MessageQuitImpl)messageQuit).getReceiver());
		parts.add(roleSet(((MessageQuitImpl)messageQuit).getSender()));
		return parts;
	}
	
	public Set<Role> partsChoice(EObject choice){
		ChoiceImpl c = (ChoiceImpl) choice;
		Set<Role> parts = new LinkedHashSet<>();
		parts.add(c.getRole());
		for(Message m: c.getBranches()) {
			parts.addAll(partsMessage(m));
		}
		
		return parts;
	}
	
	public boolean inside(Set<Role> set, Role r) {
		if(r == null) return false;
		for(Role role: set) {
			if(role == null) continue;
			if(role.getName().equals(r.getName())){
				System.out.println(role.getName()+" "+r.getName());
				return true;
			}
		}
		return false;
	}
	
}
	

