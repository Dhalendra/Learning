package dc.learn.Testpack;

import java.util.ArrayList;
import java.lang.NullPointerException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import com.sun.tracing.dtrace.Attributes;

/**
 * This can be very good example of understanding wrong requirements. 1. just
 * reversing any string 2. reverse string word by word
 * 
 * @author chandd2
 * 
 */

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args)
			throws java.lang.NullPointerException {
		// TODO Auto-generated method stub
		String str = "Sky is blue and I am good";
		// String str = null;
		if (str == null)
			return; // you can write just return in void method. It's dead code.
		// System.out.println("Original String: "+ str);
		try {
			if (!str.equals(null)) {
				char[] charArray = str.toCharArray();
				// System.out.println(charArray);
				String str1 = "", str2 = "";
				for (int i = charArray.length - 1; i >= 0; i--) {
					str1 += charArray[i];
					// Another way is to not change String to charArray and use
					// charAt(i);
				}
				System.out.println(str.length());
				
				for(int j = str.length()-1;j>=0; j--){
					//System.out.println("in");
					str2 += str.charAt(j);
				}
				System.out.println("str2: "+str2);
				System.out.println(str1);

				System.out.println(reverseWord(str));
			}
		} catch (NullPointerException nullPointer) {
			// LEARNING: If you want to catch exception and print stack trace
			// use try/catch. if you just want to throw it no need of try/catch
			// use throw.
			// System.out.println(" String is null" );
			// nullPointer.printStackTrace();
			throw nullPointer;
			// throw new NullPointerException("String is null") ;
		}

	}

	private static String reverseWord(String str) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(" ");
		String[] arr = pattern.split(str);
		String newArr = "";
		for (int index = arr.length - 1; index >= 0; --index)
			newArr += arr[index]+ " "; // this space is given to maintain space in original String
		// System.out.println(newArr.substring(1));
		return newArr;
	}
}
