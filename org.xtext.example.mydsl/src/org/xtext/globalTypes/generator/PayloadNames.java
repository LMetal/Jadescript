package org.xtext.globalTypes.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.globalTypes.myDsl.Definition;

public class PayloadNames {
	HashMap<String, ArrayList<String>> actionPredicateList;
	ArrayList<String> variables;
	
	int textNum = 0;
	int intNum = 0;
	int aidNum = 0;

	public void init(EList<Definition> defList) {
		actionPredicateList = new HashMap<String, ArrayList<String>>();
		variables = new ArrayList<String>();
		textNum = 0;
		intNum = 0;
		aidNum = 0;
		
		ArrayList<String> names;
		for(Definition d: defList) {
			names = new ArrayList<String>();			
			for(String type: d.getTypes()) {
				if(type.equals("text")) {
					names.add("text" + textNum);
					textNum++;
				}
				if(type.equals("integer")) {
					names.add("integer" + intNum);
					intNum++;
				}
				if(type.equals("aid")) {
					names.add("aid" + aidNum);
					aidNum++;
				}
			}
			actionPredicateList.put(d.getName(), names);
		}	  
	}
	
	public String getPayload(Definition def) {
		if(actionPredicateList.containsKey(def.getName())) {
			ArrayList<String> defNames = actionPredicateList.get(def.getName());
			String payload = "";
			int index=0;
			for(var v: def.getTypes()) {
				if(index != 0) payload = payload + ", ";
				payload = payload + defNames.get(index) + " as " + v;
				index++;
			}
			return payload;
		} else {
			return null;
		}
	}
	
	/*public ArrayList<String> getNames() {
		var list = new ArrayList<String>();
		for(var d: actionPredicateList) {
			
		}
	}*/
	
	public String getPayload(String name, boolean choice) {
		if(actionPredicateList.containsKey(name)) {
			ArrayList<String> defNames = actionPredicateList.get(name);
			String result = "(";
			int count = 0;
			for(String found : defNames) {
				if(count != 0)
					result = result + ", ";
				// integer | float | text | aid
				if(found.substring(0, 3).equals("aid")) {

					if(choice)
						result = result + "/*fill_AID*/" /*+ " as aid"*/;
					else
						result = result + found/*+ " as aid"*/;
				}
				else if(found.substring(0, 3).equals("int")) {
					if(choice)
						result = result + "/*fill_INT*/" /*+ " as integer"*/;
					else
						result = result + found/* + " as integer"*/;
				}
					
				else if(found.substring(0, 3).equals("flo")) {
					if(choice)
						result = result + "/*fill_FLOAT*/" /*+ " as float"*/;
					else
						result = result + found/* + " as float"*/;
				}
				else {
					if(choice)
						result = result + "/*fill_TEXT*/" /*+ " as text"*/;
					else
						result = result + found/* + " as text"*/;
				}
				count++;
			}
			return result + ")";
		}else {
			return null;
		}
	}
}
