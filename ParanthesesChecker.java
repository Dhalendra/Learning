package dc.learn.Stack;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;



public class ParanthesesChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final HashMap<Character, Character> charMap = new HashMap<Character, Character>();
		charMap.put('[', ']');
		charMap.put('{', '}');
		charMap.put('(', ')');
		
		int noOfTestCase= 0 ;
		boolean isBalancedParan = false;
		try{
		Scanner sc = new Scanner(System.in);
		noOfTestCase = sc.nextInt();
		while(noOfTestCase>0){
			isBalancedParan=checkBalancedParan(charMap,sc.next());
			if(isBalancedParan){
				System.out.println("VALID");
			}else{
				System.out.println("Invalid");
			}
			noOfTestCase--;
		}
		}catch(InputMismatchException e){
			System.out.println("Wrong Input");
		}

	}

	private static boolean checkBalancedParan(HashMap<Character, Character> charMap, String next) {
		// TODO Auto-generated method stub
		Stack<Character> stk = new Stack<Character>();
		for(Character str: next.toCharArray()){
			//System.out.println(str.toString());
			if(charMap.keySet().contains(str)){
				stk.push(str);
			}else if(charMap.values().contains(str)){
				System.out.println("stk.Peek() "+stk.peek() + "str: " + str);
				if(!stk.empty() && charMap.get(stk.peek()) == str){
					stk.pop();
				}else{
				return false;
			}
		
		}
	} return stk.empty();
		
	}

}
