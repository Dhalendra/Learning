package dc.learn.Testpack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
*/

public class TestAnagram {

	/**1. check the indexOf character and if it is not -1 then it's present in there.
	 * 2. Use Arrays and sort it and then check eqauls method. you can sort character array only.
	 * 3. user StringBuffer and use deleteCharAt method. check the length of String Buffer.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ddd";
		String s2 = "ddg";
		//System.out.println(s1.indexOf("ar"));
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		boolean isAnagram = true;
		if((s1 != null && s2!= null) && (s1.length() == s2.length())){
			System.out.println("Anagram hai: " + isAnagramHashMap(s1,s2));
			char[] chars = s1.toCharArray(); 
			//char[] anagramChar= s2.toCharArray();
			for(char c : chars){
			int index = s2.indexOf(c); 
			//System.out.println("index : "+ index + " char "+ c + " s2. String : " + s2.substring(0,index) + s2.substring(index +1, s2.length()));
			if(index != -1){ 
				System.out.println("index : "+ index + " char "+ c + " s2. String : " + s2.substring(0,index) + s2.substring(index +1, s2.length()));
				//isAnagram = true;
				s2 = s2.substring(0,index) + s2.substring(index +1, s2.length()); //removing char which is present
				}else{ 
					isAnagram = false;
					break;
				} 
			}
			//System.out.println(10*5);
			//System.out.println("After processing : s2 : "+ s2);
		}
		if(s2.isEmpty()){
			System.out.println("Anagram");
		}else{
			System.out.println("not anagram");
		}
	}

	private static boolean isAnagramHashMap(String s1, String s2) {
		// TODO Auto-generated method stub
		Map<Character,Integer> anaMap = new HashMap<Character, Integer>();
	//	char[] wordCharArray = s1.toCharArray();
		//char[] anaCharArray = s2.toCharArray();
		int wordCount =0;
		for (int i =0 ; i< s1.length() ; i++){
			char wordc= s1.charAt(i);
			if(anaMap.containsKey(wordc)){
				//wordCount++;	
				wordCount= anaMap.get(wordc);
			}
			anaMap.put(wordc, ++wordCount);
			wordCount =0;
			wordc = s2.charAt(i);
			if(anaMap.containsKey(wordc)){
				//wordCount++;	
				wordCount= anaMap.get(wordc);
			}
			anaMap.put(wordc, --wordCount);
		}
		for(int value: anaMap.values()){
			if(value != 0){
				return false;
			}
		}
		return true;
	}
}


/**
 * A regex class for IP address.
 * @author chandd2
 *
 */
//Write your code here
class MyRegex{
  private  String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
  public  String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
}