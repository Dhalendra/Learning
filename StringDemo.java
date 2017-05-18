package dc.learn.Testpack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class StringDemo {
	static String s = "Nothing_is_as easy as it looks";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = 
		StringTokenizer st = new StringTokenizer(s," _");
		while (st.hasMoreTokens())
		{
		    String token = st.nextToken();
		    System.out.println( "Token [" + token + "]" );
		}
		
		String regex = ".*"+"abc"+"_+";

		System.out.println("..abc___".matches(regex));

		System.out.println("abc___".matches(regex));

		System.out.println("abc_".matches(regex));
		String str = "aabfooaaaabfooabfoob";
		str = str.replaceAll("a*b", "-");
		System.out.println(str);
		
		String str2 = "Every_solution____breeds_new__problems";
		String[] stArray = str2.split("_+");
		String st3 = "";
		for(String str4: stArray){
			st3 += str4 + " ";
		}
		System.out.println(st3);

		String ptr = "On_the_edge_of_history";
		String[] tmp = ptr.split("_"); // Split returns String Array.
		System.out.println( Arrays.toString(tmp)); // Arrays has been used to print String Array.
		System.out.println( tmp);

		str = "On_the___edge_of____history";
		tmp = str.split("_+");
		System.out.println( Arrays.toString(tmp));
		System.out.println( );

		str = "On***the___edge**of____history";
		tmp = str.split("_+|\\*+");
		System.out.println( Arrays.toString(tmp));
		System.out.println( );
		
		/**
		 * O(n^2) solution for finding unique character in String.
		 */
		
		
		String strA = "abcd efgh";
		char[] charArray = strA.toCharArray();
		int strLength = strA.length();
		boolean unique = true;
		for(int i= 0; i<strLength; i++){
			for(int j =0 ;j < strLength; j++){
				if(charArray[i] == charArray[j] && i != j){
					unique = false;
					System.out.println(" Not unique character " + charArray[i] +" and index of  " + j );
					break;
				}	
			}
			if(!unique){
				System.out.println(" String doesn't have uniq chars");
			break;
			}else{
				System.out.println("unique");
				break;
			}
		}
		
		/**
		 * O(n) solution for finding unique character in String. Point to note is boolean array
		 */
		

		String strB = "ab";
		boolean uniq = false;
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(Character c : strB.toCharArray()){
			if(charMap.containsKey(c)){
				System.out.println("Not unique MAP");
				break;
			}else charMap.put(c, 1);
		}
		for(Integer i: charMap.values()){
			if(!i.equals(1)){
				uniq = false;
			}else uniq = true;
		}
		if(uniq) System.out.println(" unique hai MAP");
		boolean[] charArray1 = new boolean[256];
		int stLength = strB.length();
		
		//System.out.println(stLength); // Boolean Array is the best solution to check all unique character
		for(int i =0; i<stLength; i++){
			int var = strB.charAt(i);
			if(charArray1[var]) {
				uniq = false;
				System.out.println(" not unique");
				break;
			}else{
				charArray1[var]= true;
				//System.out.println(charArray1[var] + " " + var);
			}
			
		}
		if(uniq) System.out.println(" unique hai");
		//System.out.println(charArray1[0]);
		
		
	}

}
