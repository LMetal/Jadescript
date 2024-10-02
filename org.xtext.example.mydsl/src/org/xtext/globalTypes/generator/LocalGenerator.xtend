package org.xtext.globalTypes.generator

import org.xtext.globalTypes.myDsl.GlobalProtocol

import org.xtext.globalTypes.myDsl.Protocol
import org.xtext.globalTypes.myDsl.Message
import org.xtext.globalTypes.myDsl.Choice
import org.xtext.globalTypes.myDsl.Recursion
import org.xtext.globalTypes.myDsl.CloseRecursion
import org.xtext.globalTypes.myDsl.ForEach
import org.xtext.globalTypes.myDsl.Roles
import org.xtext.globalTypes.myDsl.Payload
import org.xtext.globalTypes.myDsl.RoleOne
import org.xtext.globalTypes.myDsl.RoleSet
import org.xtext.globalTypes.myDsl.MessageNormal
import org.xtext.globalTypes.myDsl.MessageQuit
import org.xtext.globalTypes.myDsl.EndProtocol
import org.eclipse.emf.common.util.EList
import org.xtext.globalTypes.myDsl.Definition
import org.xtext.globalTypes.myDsl.Role


class LocalGenerator {
	val parts = new Participants()
	
	def CharSequence project(GlobalProtocol p, EList<Definition> definitions, Role role)'''
		«parts.resetLists()»
		«parts.addRoleOne(p)»
		«FOR d: definitions»
			«IF (d.type == '@proposition')»
				«d.type» «d.name»
			«ENDIF»
			«IF (d.type == '@predicate')»
				«d.type» «d.name»(«FOR t : d.types SEPARATOR ', '»«t»«ENDFOR»)
			«ENDIF»
			«IF (d.type == '@action')»
				«IF d.types.length != 0»
					«d.type» «d.name»(«FOR t : d.types SEPARATOR ', '»«t»«ENDFOR»)
				«ELSE»
					«d.type» «d.name»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		
		local protocol «p.protocolName» at «projectOn(role, role)»(«projectOn(p.roles, role)») {
			«projectOn(p.protocol, role)»
		}
	'''
	
	def dispatch projectOn(Protocol protocol, Role role)'''
		«projectOn(protocol.begin, role)»'''
	
	def dispatch projectOn(Roles roles, Role r)
	'''«IF r instanceof RoleOne»
	   «FOR role : roles.roles.filter[!name.equals(r.name)] SEPARATOR ', '»«projectOn(role, r)»«ENDFOR»«ELSE»
	   role «(r as RoleSet).ref.name»«ENDIF»'''
	
		
	def dispatch projectOn(Role role, Role r)'''
		«IF role instanceof RoleOne»role «role.name»«ELSE»roleset «role.name»:«(role as RoleSet).ref.name»«ENDIF»'''
	
	
	/*
	 * projection of a message on a role with differentiation between normal messages
	 * and quit messages. In the first case the protocol continues.
	 * 
	 * m: Message (superclass of MessageNormal and MessageQuit)
	 * r: role to project on
	 * 
	 * 
	 * (𝑥 → q ℓQuit ) ↾𝜌 q = 𝑥 ? ℓQuit
	 * (𝑥 → q ℓQuit ) ↾𝜌R = q!ℓQuit
	 * (𝑥 → q ℓQuit ) ↾𝜌 p = End
	 */
	def dispatch projectOn(Message m, Role r)'''
		«IF m instanceof MessageNormal»
			«IF m.sender.name == r.name»
				«m.messageType.name»(«printPayload(m.payload)») to «m.receiver.name».
			«ELSE»
				«IF m.receiver.name == r.name»
					«m.messageType.name»(«printPayload(m.payload)») from «m.sender.name».
				«ENDIF»
			«ENDIF»
			«projectOn(m.protocol, r)»
		«ELSE»
			«IF m.sender.name == r.name»
				QUIT() to «m.receiver.name»
			«ELSE»
				«IF m.receiver.name == r.name»
					QUIT() from «m.sender.name»
				«ELSE»
					End
				«ENDIF»
			«ENDIF»
		«ENDIF»
		'''

		
	/*
	 * p → Q{ ℓ𝑖⟨S𝑖⟩.G𝑖 }𝑖∈𝐼 ↾𝜌 R = Q!{ ℓ𝑖⟨S𝑖⟩.G𝑖 ↾𝜌 R }𝑖∈𝐼 if RoleSet(p, 𝜌) = R
	 * p → Q{ ℓ𝑖⟨S𝑖⟩.G𝑖 }𝑖∈𝐼 ↾𝜌 R = p?{ ℓ𝑖⟨S𝑖⟩.G𝑖 ↾𝜌 R }𝑖∈𝐼 if RoleSet(Q, 𝜌) = R
	 * p → Q{ ℓ𝑖⟨S𝑖⟩.G𝑖 }𝑖∈𝐼 ↾𝜌 R = ⨆︀𝑖∈𝐼 G𝑖 ↾𝜌 R //merge
	 */
	def dispatch projectOn(Choice c, Role r)'''
		«IF parts.partsChoice(c).contains(r)»
			«IF c.branches.get(0).getReceiver() == r || c.branches.get(0).getSender() == r»
				choice at «parts.roleSet(c.role).name»{
				«FOR int i: 0..c.branches.length-1 SEPARATOR ' or {'»
						«projectOn(c.branches.get(i), r)»
					}
				«ENDFOR»
			«ELSE»
				«MergeUtil.merge(c, r)»
			«ENDIF»
		«ENDIF»
	'''
	
	//only used by MERGE UTIL if merge is possible
	def safeProjectOn(Choice c, Role r)'''
		choice at «c.role.name»{
		«FOR int i: 0..c.branches.length-1 SEPARATOR ' or {'»
				«projectOn(c.branches.get(i), r)»
			}
		«ENDFOR»
	'''
	
	
	def dispatch projectOn(Recursion rec, Role r)'''
		«IF !parts.partsRecursion(rec).contains(r)»
			End
		«ELSE»
			«IF Util.isRecVariableInRecursion(rec)»
				«projectOn(rec.recProtocol, r)»
			«ELSE»
				rec «rec.name»: {
					«projectOn(rec.recProtocol, r)»
				}
			«ENDIF»
		«ENDIF»
	'''
	
	def dispatch projectOn(CloseRecursion recEnd, Role r)'''
		loop «recEnd.recursionVariable.name»
	'''
	
	/*
	 * (for 𝑥 : ⟨R, q⟩ G1; G2) ↾𝜌 R = G2 ↾𝜌 R 							if R ̸∈ Parts(G1, 𝜌)
	 * (for 𝑥 : ⟨R, q⟩ G1; G2) ↾𝜌 q = for 𝑥 : ⟨R, q⟩ (G1 ↾𝜌[𝑥↦→R] q); (G2 ↾𝜌 q )
	 * (for 𝑥 : ⟨R, q⟩ G1; G2) ↾𝜌 R = Seq(G1 ↾𝜌[𝑥↦→R] R‘, G2 ↾𝜌 R ) 		otherwise
	 */
	def dispatch projectOn(ForEach each, Role r)'''
		«IF !parts.partsFor(each).contains(r)»
			«projectOn(each.protocol, r)»
		«ELSE»
			«IF each.refRole == r»
				for role «each.loopRole.name»:<«each.roleset.name»,«each.refRole.name»>{
					«projectOn(each.forBody, r)»
				};
				«projectOn(each.protocol, r)»
			«ELSE»
				«IF r == each.roleset»
					«seqOn(each.forBody, each.loopRole, each.protocol)»
				«ELSE»
					«seqOn(each.forBody, r, each.protocol)»
				«ENDIF»
			«ENDIF»
		«ENDIF»
	'''
	
	def dispatch projectOn(EndProtocol end, Role r)'''
		End
	'''
	
	def dispatch seqOn(Protocol protocol, Role role, Protocol p)'''
		«seqOn(protocol.begin, role, p)»'''
	
	def dispatch seqOn(Message m, Role r, Protocol p)'''
		«IF m instanceof MessageNormal»
			«IF m.sender.name == r.name»
				«m.messageType.name»(«printPayload(m.payload)») to «m.receiver.name».
			«ELSE»
				«IF m.receiver.name == r.name»
					«m.messageType.name»(«printPayload(m.payload)») from «m.sender.name».
				«ENDIF»
			«ENDIF»
			«seqOn(m.protocol, r, p)»
		«ELSE»
			«IF m.sender.name == r.name»
				QUIT() to «m.receiver.name»
			«ELSE»
				«IF m.receiver.name == r.name»
					QUIT() from «m.sender.name»
				«ENDIF»
			«ENDIF»
		«ENDIF»
	'''
	
	def dispatch seqOn(Choice c, Role r, Protocol p)'''
		choice at «parts.roleSet(c.role).name»{
		«FOR int i: 0..c.branches.length-1 SEPARATOR ' or {'»
				«seqOn(c.branches.get(i), r, p)»
			}
		«ENDFOR»
	'''

	/*
	 * (𝜇X .G) ↾𝜌 R = End if R ̸∈ Parts(G, 𝜌)
	 * (𝜇X .G) ↾𝜌 R = G↾𝜌 R if X ̸∈ G
	 * (𝜇X .G) ↾𝜌 R = 𝜇X .(G↾𝜌 R ) otherwise
	 */
	def dispatch seqOn(Recursion rec, Role r, Protocol p)'''
		rec «rec.name»: {
			«seqOn(rec.recProtocol, r, p)»
		}
	'''
	
	def dispatch seqOn(ForEach f, Role r, Protocol p)'''
		«projectOn(f, parts.roleSet(r))»
	'''
	
	def dispatch seqOn(CloseRecursion close, Role r, Protocol p)'''
		«projectOn(close, r)»
	'''
	
	def dispatch seqOn(EndProtocol end, Role r, Protocol p)'''
		«projectOn(p, parts.roleSet(r))»
	'''
	
	def printPayload(Payload payload)'''
		«IF payload !== null»
			«FOR type: payload.types SEPARATOR ', '»«type»«ENDFOR»«ENDIF»'''
}