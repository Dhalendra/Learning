package dc.learn.Testpack;

import java.util.ArrayList;

public class TestPermutation {

	/** Recursion is a must.
	 * @param args
	 */
	/*public static void main(String[] args) {

        String str = "123";
        if(!str.equals(null)){
        	ArrayList<String> permList = permutations(str);
            System.out.println(permList.size());
            System.out.println(permList);
        }else{
        	System.out.println("Input is null");
        }
       
    }

	public static ArrayList<String> permutations(String s) {
	    ArrayList<String> out = new ArrayList<String>();
	    if( s.isEmpty()) {
	    	System.out.println("String is empty");
	    	out.add("");
	    	return out;
	    }
	    if (s.length() == 1) {
	        out.add(s);
	        return out;
	    }
	    char first = s.charAt(0);
	    String rest = s.substring(1);
	    for (String permutation : permutations(rest)) {
	    	//System.out.println("number of times string : " + permutation);
	        out.addAll(insertAtAllPositions(first, permutation));
	    }
	    return out;
	}
	public static ArrayList<String> insertAtAllPositions(char ch, String s) {
	    ArrayList<String> out = new ArrayList<String>();
	    for (int i = 0; i <=s.length(); i++) { // NOTE: most important point is run it till equals to String lengthh
	        String inserted = s.substring(0, i)+ch + s.substring(i);
	        out.add(inserted);
	    }
	    return out;
	}*/
	
	/**
	 * This one is easier.
	 * @param input
	 */
	
	 static public void StringPermutation(String input)
	    {
	       System.out.println( StringPermutation("", input));
	    }
	     
	    private static ArrayList<String> StringPermutation(String permutation, String input)
	    {    ArrayList<String> permList = new ArrayList<String>();
	        if(input.length() == 0)
	        {
	            //System.out.println(permutation);
	        	permList.add(permutation);
	        	//System.out.println(permList);
	        	//return permList;
	        }
	        else
	        {
	            for (int i = 0; i < input.length(); i++)
	            {    
	                permList.addAll(StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length())));
	            }
	        }
	        return permList;
	    }
	     
	    public static void main(String[] args) 
	    {
	        StringPermutation("123");
	    } 

}

