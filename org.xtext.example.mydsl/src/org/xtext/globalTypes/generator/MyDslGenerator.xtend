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
import org.xtext.globalTypes.myDsl.GlobalProtocol
import org.xtext.globalTypes.myDsl.LocalProtocol
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.emf.ecore.EObject
import org.xtext.globalTypes.myDsl.RoleOne
import org.eclipse.emf.common.util.EList
import org.xtext.globalTypes.myDsl.Definition
import org.xtext.globalTypes.myDsl.RoleSet

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {
	LocalGenerator locGen = new LocalGenerator;
	JadescriptGenerator jadeGen = new JadescriptGenerator;
	
	PayloadNames payloadNames = new PayloadNames();
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var model = resource.contents.head as Model;
		//create projection file(local protocol) for each role
		if(model.getProtocol() instanceof GlobalProtocol){
			var globalProtocol = model.protocol as GlobalProtocol
			fsa.generateFile('Start.java', this.genStartFile(globalProtocol.roles));
			payloadNames.init(model.getDefinitions);
			fsa.generateFile('ontology.jade', this.genOntoFile(globalProtocol, model.getDefinitions));
			for(Role r : globalProtocol.getRoles().getRoles()){
				System.out.println("LOCAL in " + r.getName());
				fsa.generateFile('local/local_'+r.getName()+'.jglobal', locGen.project(globalProtocol, model.getDefinitions, r))
				System.out.println("END LOCAL on " + r.getName());		
			}
		} else {
			var localProtocol = model.protocol as LocalProtocol
			System.out.println("JADE");
			fsa.generateFile('jade/jade_'+localProtocol.getProjectedRole()+'.jade', jadeGen.translate(localProtocol, model.getDefinitions))
		}	
	}
	
	def genOntoFile(GlobalProtocol gp, EList<Definition> definitions)'''
		«var rolesetList = EcoreUtil2.getAllContentsOfType(gp.roles, RoleSet)»
		ontology «gp.protocolName»
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
			«FOR r: rolesetList»
				proposition «r.ref.name»Hello
			«ENDFOR»
	'''

	

	
	def genStartFile(EObject roles)'''
		import java.util.Scanner;
		import jade.wrapper.ContainerController;
		import jadescript.java.Jadescript;
		
		public class Start {
			public static void main(String[] args) {
				try (Scanner scanner = new Scanner(System.in)) {
					int port = (int) (Math.random()*1000) + 10000;
					System.out.println(port);
					ContainerController container = Jadescript.newMainContainer(port);
					
				«var roleList = EcoreUtil2.getAllContentsOfType(roles, Role)»
				«FOR r: roleList»
					«IF r instanceof RoleOne»
						«r.name».create(container, "«r.name»");
					«ELSE»
						for(int i=0; i<3; i++){ //rimpiazza 3 con il numero di agenti richiesti
							«r.name».create(container, "«r.name»"+Integer.toString(i));
						}
					«ENDIF»
				«ENDFOR»
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	'''
}

