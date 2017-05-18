package dc.learn.Testpack;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Stack;

public class IsoMorphic {

	/**
	 * Two strings are isomorphic if the characters in s can be replaced to get
	 * t. ... No two characters may map to the same character but a character
	 * may map to itself. For example, Given "egg", "add", return true. Given
	 * "foo", "bar", return false. Given "paper", "title", return true
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final HashMap<Character, Character> charMap = new LinkedHashMap<Character, Character>();
		String s = "aba";
		String t = "aca";
		boolean isIsoMorphic = true;
		if (s.length() != t.length() || s == null || t == null) {
			System.out.println("NOPE");
		}

		if (s.length() == t.length()) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				char d = t.charAt(i);
				// System.out.println("loop" + i);
				if (charMap.containsKey(c) && charMap.get(c) != d) {
					// System.out.println("true");
					isIsoMorphic = false;
					break;
				} else {
					if (!charMap.containsKey(c)) {
						charMap.put(c, d);
					}

					// isIspMo = false;
				}
			}

			System.out.println(isIsoMorphic);
		}
		// boolean isIsoMorphic = checkIsoMorphic(charMap,s,t);
		// System.out.println(isIsoMorphic);
		/*
		 * int noOfTestCase= 0 ; boolean isBalancedParan = false; try{ Scanner
		 * sc = new Scanner(System.in); noOfTestCase = sc.nextInt();
		 * while(noOfTestCase>0){
		 * isBalancedParan=checkBalancedParan(charMap,sc.next());
		 * if(isBalancedParan){ System.out.println("VALID"); }else{
		 * System.out.println("Invalid"); } noOfTestCase--; }
		 * }catch(InputMismatchException e){ System.out.println("Wrong Input");
		 * }
		 */

	}

}
