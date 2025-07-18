package org.xtext.globalTypes.generator;

import java.util.ArrayList;

import org.xtext.globalTypes.myDsl.Choice;
import org.xtext.globalTypes.myDsl.Role;
import org.xtext.globalTypes.myDsl.Message;

public class MergeUtil {
	public static CharSequence merge(Choice c, Role r) {
		LocalGenerator gen = new LocalGenerator();
		var localTypes = new ArrayList<CharSequence>();
		var localTypesNoSpaces = new ArrayList<CharSequence>();
		for(Message m: c.getBranches()) {
			localTypes.add(gen._projectOn(m, r));
			localTypesNoSpaces.add(gen._projectOn(m, r).toString().replace(" ", ""));

		}
		
		//System.out.println(localTypes);
		
		if(allEquals(localTypesNoSpaces)) {
			//success, all branches are equal, no choice needed
			return localTypes.get(0);
		} else if(! allFirstMessageExternalChoice(localTypes)) {
			// error, internal choice as first message
			return "//MERGE FAILED: Must wait message in choice";
			
		} else if(! allFirstMessageDifferents(localTypes)) {
			// error, not all messages are different
			return "//MERGE FAILED: Two branches, but not all, waits for same message";
		}
		
		
		//SUCCESS, all branches begins with an external choice. In each branch the first message is different
		return gen.safeProjectOn(c, r);
	}

	private static boolean allFirstMessageDifferents(ArrayList<CharSequence> localTypes) {
		ArrayList<String> messageTypes = new ArrayList<String>();
		boolean someEmpty = false;
		
		for(CharSequence l: localTypes) {
			String s = l.toString();
			
			if(s.isEmpty()) {
				someEmpty = true;
			} else {
				s = s.substring(0, s.indexOf('('));
				if(messageTypes.contains(s)) return false;
				else messageTypes.add(s);
			}
		}
		
		if(someEmpty && !messageTypes.isEmpty()) return false;
		return true;
	}

	private static boolean allFirstMessageExternalChoice(ArrayList<CharSequence> localTypes) {
		for(CharSequence l: localTypes) {
			String l1 = l.toString();
			//porzione interessante per capire se e' messaggio in ingresso o uscita
			if (l1.isEmpty()){
				return true;
			}
			String s = l1.subSequence(l1.indexOf(')')+2, l1.indexOf('.')).toString();
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
