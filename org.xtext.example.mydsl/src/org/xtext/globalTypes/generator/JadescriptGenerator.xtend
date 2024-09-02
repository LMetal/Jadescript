package org.xtext.globalTypes.generator

import org.xtext.globalTypes.myDsl.LocalProtocol
import org.eclipse.emf.common.util.EList
import org.xtext.globalTypes.myDsl.Definition

class JadescriptGenerator {
	def CharSequence project(LocalProtocol lp, EList<Definition> definitions)'''
		«printOntology(lp, definitions)»
	'''
	
	def printOntology(LocalProtocol lp, EList<Definition> definitions) '''
		ontology «lp.protocolName»
			«FOR d: definitions»
				«IF (d.type == '@proposition')»
					proposition «d.name»
				«ENDIF»
				«IF (d.type == '@predicate')»
					predicate «d.name»(«FOR t : d.types SEPARATOR ', '»«t»«ENDFOR»)
				«ENDIF»
				«IF (d.type == '@action')»
					«IF d.types.length != 0»
						action «d.name»(«FOR t : d.types SEPARATOR ', '»«t»«ENDFOR»)
					«ELSE»
						action «d.name»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
	'''
}