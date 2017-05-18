package dc.learn.Testpack;

import java.util.Collections;

public class TestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// you can reverse the string and can check if both are equal as well.
		String s= "MalalaM";
		//String s= "Sore was, I ere I ,saw Eros";
		// easy method
		StringBuffer stb = new StringBuffer(s);
		StringBuffer stb1 =  stb.reverse();
		System.out.println(stb1);
		System.out.println(stb.equals(stb1));
		// 2nd difficult method
		boolean isPalindrome = true;
		//String s = "Kayaku";
		System.out.println(s.toLowerCase());
		s= s.toLowerCase();
		int n = s.length();
		//System.out.println("n is : "+ n + "mid is  "+ n/2);
		for (int i = 0; i<=n/2;i++){
			if(s.charAt(i) == s.charAt(n-1)){
				n--;
			//	isPalindrome = true;
			}
			else {
				isPalindrome = false;
				//System.out.println(" not palindrome");
				break;
			}
			
		}
		System.out.println(isPalindrome);
	    }

}
