package org.xtext.globalTypes.generator;

import java.util.ArrayList;

import org.xtext.globalTypes.myDsl.Choice;
import org.xtext.globalTypes.myDsl.Role;
import org.xtext.globalTypes.myDsl.Message;

public class MergeUtil {
	public static CharSequence merge(Choice c, Role r) {
		MyDslGenerator gen = new MyDslGenerator();
		var localTypes = new ArrayList<CharSequence>();
		var localTypesNoSpaces = new ArrayList<CharSequence>();
		for(Message m: c.getBranches()) {
			localTypes.add(gen._projectOn(m, r));
			localTypesNoSpaces.add(gen._projectOn(m, r).toString().replace(" ", ""));

		}
		
		System.out.println(localTypes);
		
		if(allEquals(localTypesNoSpaces)) {
			System.out.print("Equals");
			return localTypes.get(0);
		} else if(! allFirstMessageExternalChoice(localTypes)) {
			return "//MERGE FAILED: Must wait message in choice";
		} else if(! allFirstMessageDifferents(localTypes)) {
			return "//MERGE FAILED: Two branches, but not all, waits for same message";
		}
		
		//SUCCESS, can merge
		
		return gen.safeProjectOn(c, r);
	}

	private static boolean allFirstMessageDifferents(ArrayList<CharSequence> localTypes) {
		ArrayList<String> messageTypes = new ArrayList<String>();
		
		for(CharSequence l: localTypes) {
			String s = l.toString();
			s = s.substring(0, s.indexOf('('));
			
			if(messageTypes.contains(s)) return false;
			else messageTypes.add(s);
		}
		
		return true;
	}

	private static boolean allFirstMessageExternalChoice(ArrayList<CharSequence> localTypes) {
		for(CharSequence l: localTypes) {
			String l1 = l.toString();
			//porzione interessante per capire se e' messaggio in ingresso o uscita
			String s = l1.subSequence(l1.indexOf(')')+2, l1.indexOf('.')).toString();
			System.out.println(s);
			if(s.startsWith("to")) return false;
		}
		return true;
	}

	private static boolean allEquals(ArrayList<CharSequence> localTypes) {
		for(int i=0; i<localTypes.size()-1; i++) {
			if(! localTypes.get(i).equals(localTypes.get(i+1))) return false;
		}
		return true;
	}

}
