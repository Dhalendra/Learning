package dc.learn.Testpack;

import java.lang.Character;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string find first non repeating string character.
 * @author chandd2
 * This class also find non-repeating String character in given string
 */

public class FirstNonRepeatingCharInAString {

	/**we can sort the array and loop it to find first non repeating char as well.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabraKadadra";
		HashMap<Character, Integer> hMap = new LinkedHashMap<Character, Integer>();
		char[] charArry = str.toCharArray();
		/**
		 * This whole sortr and count method has more challenges than using hashmap.
		 */
		/* Arrays.sort(charArry);
		 System.out.println(charArry);
		 for(int i =0; i < charArry.length; i++){
			 if(i == charArry.length-1){
				 if(charArry[i-1] == charArry[i]){
					 break;
				 }else{
					 System.out.println(charArry[i-1]);
				 }
			 }else if(charArry[i] != charArry[i+1]){
				 System.out.println("First non r char "+ charArry[i] );
				 break;
			 }else continue;
		 }
		*///int strLength = str.length();
		for(Character c: charArry){
			if(hMap.containsKey(c) && hMap.get(c).equals(1)){
				//hMap.put(c, hMap.get(c)+1);
				hMap.remove(c);
				//System.out.println();
			}else{
				hMap.put(c, 1);
			}
		}
		
		for(Character i: hMap.keySet()){
			if(hMap.get(i).equals(1)){
				System.out.println(i);
				break;
			}
		}
		
		for(Map.Entry<Character, Integer> entry: hMap.entrySet()){
			System.out.println("non repeatec char: " +entry.getKey());	
		}
		
		System.out.println("HashMap: " + hMap );
		/*for(Character c: charArry){	
		if(hMap.get(c).equals(1)){
			System.out.println(" Non-repeating Char: " + c);
			break;
		}
	//System.out.println("HashMap: " + hMap );
	//System.out.println(strLength + " "+str.charAt(0));
		}*/
	}

}

