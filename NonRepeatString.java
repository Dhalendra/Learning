package dc.learn.Testpack;

import java.lang.Character;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class NonRepeatString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabraKadadra";
		HashMap<Character, Integer> hMap = new LinkedHashMap<Character, Integer>();
		char[] charArry = str.toCharArray();
		int strLength = str.length();
		/*for(int i= 0; i< strLength; i++){
			for(int j =0;j<strLength; j++){
				if(charArry[i] == charArry[j] && i!=j){
					hMap.put(charArry[i], 2);
					break;
				}else{
					hMap.put(charArry[i], 1);
				}
				if(hMap.containsValue(1)){
					break;
				}
			}
		}*/
		for(Character c: charArry){
			if(hMap.containsKey(c)){
				hMap.put(c, hMap.get(c)+1);
			}else{
				hMap.put(c, 1);
			}
		}
		for(Character c: charArry){	
		if(hMap.get(c).equals(1)){
			System.out.println("First Non-repeating Char: " + c);
			break;
		}
	System.out.println("HashMap: " + hMap );
		//System.out.println(strLength + " "+str.charAt(0));

	}

}
}
