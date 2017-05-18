package dc.learn.Testpack;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Given two strings find all anagram of str2 in string 1. find index of anagram of given string in another string.
 * Amazon first attemp question 
 * @author chandd2
 *Anagram: two equal length string making different words while rearranging the order of chars.
 *
 */

public class FindAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abchfkecbaljmebabdlsb acaaatsbabcr gsk";
		String str2 = "skg";
		//System.out.println(str1.substring(0,str2.length()));
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		ArrayList<Integer> indexOfAnagram = indexOfAnagram(str1,str2);
		System.out.println(indexOfAnagram);
		
	}

	private static ArrayList<Integer> indexOfAnagram(String str1, String anagramStr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> indexOfAnagram = new ArrayList<Integer>();
		int anagramStrLength = anagramStr.length();
		for(int i=0; i< str1.length()-anagramStrLength ;i++){
			if(isAnagram(str1.substring(i,i+anagramStrLength),anagramStr)){
				indexOfAnagram.add(i);
			}
		}
		if(isAnagram(str1.substring(str1.length()-anagramStrLength),anagramStr)){
			indexOfAnagram.add(str1.length()-anagramStrLength);
		}
			
		//}
		return indexOfAnagram;
	}

	private static boolean isAnagram(String substring, String anagramStr) {
		// TODO Auto-generated method stub
		char[] mainCharArray = substring.toCharArray();
		char[] anagramCharArray = anagramStr.toCharArray();
		Arrays.sort(mainCharArray);
		Arrays.sort(anagramCharArray);
		//NOTE: using Arrays.equals : Which will check if contents are equal
		return Arrays.equals(mainCharArray, anagramCharArray);

	}

}
