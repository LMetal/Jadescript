/*
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.globalTypes.myDsl.Model
import org.xtext.globalTypes.myDsl.Role
import org.xtext.globalTypes.myDsl.Protocol
import org.xtext.globalTypes.myDsl.Message
import org.xtext.globalTypes.myDsl.Choice
import org.xtext.globalTypes.myDsl.Recursion
import org.xtext.globalTypes.myDsl.CloseRecursion
import org.xtext.globalTypes.myDsl.ForEach
import org.xtext.globalTypes.myDsl.Roles
import org.xtext.globalTypes.myDsl.Payload
import org.xtext.globalTypes.myDsl.GlobalProtocol
import org.xtext.globalTypes.myDsl.LocalProtocol
import org.xtext.globalTypes.myDsl.RoleOne
import org.xtext.globalTypes.myDsl.RoleSet

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var model = resource.contents.head as Model;
		//create projection file(local protocol) for each role
		if(model.getProtocol() instanceof GlobalProtocol){
			var globalProtocol = model.protocol as GlobalProtocol
			for(Role r : globalProtocol.getRoles().getRoles()){
				System.out.println("LOCAL in " + r.getName());
				fsa.generateFile('../src/local/local_'+r.getName()+'.jglobal', '''here''')//globalProtocol.project(r))
				System.out.println("END LOCAL on " + r.getName());		
			}
		} else {
			var localProtocol = model.protocol as LocalProtocol
			System.out.println("JADE");
			fsa.generateFile('jade/jade'+localProtocol.projectedRole+'.txt', '''aaa''')
		}
		
		
	}
	
	/*def CharSequence project(GlobalProtocol p, Role role)'''
		local protocol «p.protocolName» at «role.name»(«projectOn(p.roles, role)») {
			«projectOn(p.protocol, role)»
		}
	'''
	
	def dispatch projectOn(Protocol protocol, Role role)'''
		«FOR a : protocol.actions»
			«projectOn(a, role)»
		«ENDFOR»
		«IF protocol.doesEnd == 'End'»End«ENDIF»'''
	
	def dispatch projectOn(Roles roles, Role r)
	'''«FOR role : roles.roles.filter[!name.equals(r.name)] SEPARATOR ', '»«projectOn(role, r)»«ENDFOR»'''
	
		
	def dispatch projectOn(Role role, Role r)'''
		«IF role instanceof RoleOne»role «role.name»«ELSE»roleset «role.name»:«(role as RoleSet).ref.name»«ENDIF»'''
	
	
	def dispatch projectOn(Message m, Role r)'''
		«IF m.sender.name == r.name»
			«m.messageType»(«printPayload(m.payload)») to «m.receiver.name».
		«ELSE»
			«IF m.receiver.name == r.name»
				«m.messageType»(«printPayload(m.payload)») from «m.sender.name».
			«ENDIF»
		«ENDIF»
		'''
		
	
	def dispatch projectOn(Choice c, Role r)'''
		choice at «c.role.name»{
		«FOR int i: 0..c.branches.length-1 SEPARATOR ' or {'»
				«projectOn(c.branches.get(i), r)»
			}
		«ENDFOR»
	'''
	
	def dispatch projectOn(ChoiceBranch branch, Role r)'''
		«projectOn(branch.message, r)»
		«projectOn(branch.protocol, r)»
	'''
	
	def dispatch projectOn(Recursion rec, Role r)'''
		rec «rec.name»: {
			«projectOn(rec.recProtocol, r)»
		}
	'''
	
	def dispatch projectOn(CloseRecursion recEnd, Role r)'''
		loop «recEnd.recursionVariable.name»
	'''
	
	def dispatch projectOn(ForEach each, Role r)'''
		«IF each.roleset == r»
			«projectOn(each.branch, each.loopRole)»
		«ENDIF»
		«IF each.refRole == r»
			foreach role «each.loopRole.name»:<«each.roleset.name»,«each.refRole.name»>{
				«projectOn(each.branch, r)»
			}
		«ENDIF»
		
	'''
	
	def printPayload(Payload payload)'''
		«IF payload !== null»
			«FOR type: payload.types SEPARATOR ', '»«type»«ENDFOR»«ENDIF»'''*/
}