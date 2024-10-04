package org.xtext.globalTypes.generator;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.xtext.globalTypes.myDsl.Definition;

public class OntologyTypes {
	HashMap<String, String> ontologyTypes;
	
	
	public void init(EList<Definition> defList) {
		ontologyTypes = new HashMap<String, String>();
		for(Definition d: defList) {
			ontologyTypes.put(d.getName(), d.getType());
		}
	}
	
	public String extractOntology(String name) {
		return ontologyTypes.get(name);
	}
}
