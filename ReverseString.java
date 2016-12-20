package dc.learn.Testpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sky is blue and I am good";
		Pattern pattern = Pattern.compile(" ");
		String[] arr = pattern.split(str);
		System.out.println(arr.length);
		int i = arr[arr.length-1].length();
		System.out.println(i);
		String newArr = "";
		for(int index = arr.length - 1; index >= 0; --index)
		newArr +=" "+ arr[index];
		System.out.println(newArr.substring(1)); 
	}
}
