package org.xtext.globalTypes.generator;

import org.eclipse.xtext.EcoreUtil2;
import org.xtext.globalTypes.myDsl.CloseRecursion;
import org.xtext.globalTypes.myDsl.Recursion;

public class Util {
	public static boolean isRecVariableInRecursion(Recursion rec) {
		var closeLoopList = EcoreUtil2.getAllContentsOfType(rec, CloseRecursion.class);
		
		boolean cond = closeLoopList.stream()
				.filter(c -> c.getRecursionVariable().getName() == rec.getName())
				.toList()
				.isEmpty();
		
		if(!cond) return false;
		else return true;
	}
}
