package org.xtext.globalTypes.generator

import org.xtext.globalTypes.myDsl.LocalProtocol
import org.eclipse.emf.common.util.EList
import org.xtext.globalTypes.myDsl.Definition
import org.eclipse.xtext.EcoreUtil2
import org.xtext.globalTypes.myDsl.RoleSet
import java.util.ArrayList

class JadescriptGenerator {
	ArrayList<CharSequence> behList;
	String agentString;
	PayloadNames payloadNames = new PayloadNames();
	
	
	def CharSequence project(LocalProtocol lp, EList<Definition> definitions){
		agentString = new String()
		behList = new ArrayList<CharSequence>();
		payloadNames.init(definitions);
		agentString = printOntology(lp, definitions).toString
		behList.add("AAA")
		behList.add("BBB")
		behList.add("CCC")
		
		agentString = agentString + "\n\n" + createAgent(lp)
		
		//print behaviors loop
		for(b: behList){
			agentString = agentString + "\n\n" + b.toString
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
		agent «lp.projectedRole.name» uses ontology «lp.protocolName.capitalize»
			«var rolesetList = EcoreUtil2.getAllContentsOfType(lp.roles, RoleSet)»
			«IF !rolesetList.empty»
				«FOR r: rolesetList»
					property «r.name»List as list of aid
				«ENDFOR»
			«ENDIF»
			on create do
				activate firstBehaviour
	'''
	
	def capitalize(String string) {
		//add capitalize code
		return string
	}
	
}