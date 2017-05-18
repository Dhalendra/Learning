package dc.learn.Testpack;


import java.util.regex.Pattern;

/**
 * Write a program to remove given String from another String. write it without using replaceAll method
 * @author chandd2
 *
 */

public class RemoveSpecificChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "Ram Rajya";
		//System.out.println(str1.substring(2));
		String rStr = "Ra";
		// First and easy way to do is is repalceAll method 
		//System.out.println(str1.replaceAll(rStr, ""));//use replace method for just a character.
		//Second best way to do it is Pattern
		Pattern ptr = Pattern.compile(rStr);
		String[] strArry = ptr.split(str1);
		String strB = "";
		for(String str: strArry){
			strB += str;
		}
		System.out.println(strB);
 }
}
