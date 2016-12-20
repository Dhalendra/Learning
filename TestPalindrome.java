package dc.learn.Testpack;

public class TestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Red rum, sir, is murde";
		//boolean isPalindrome = true;
		   s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();

	        int start = 0;
	        int end = s.length() - 1;

	        while (start < end){
	            if (s.charAt(start) != s.charAt(end)){
	                System.out.println("False");
	                break;
	            }  
	            start++;
	            end--;
	        }
	        
	        System.out.println("True");
	    }

}
