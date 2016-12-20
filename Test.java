package dc.learn.Testpack;

import java.io.Serializable;
import java.util.Scanner;

public class Test implements Serializable {

	/**
	 * @param args
	 */
	
	public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	   
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for(int t = 0; t < n; t++) {
	        	 int c = 0;
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            System.out.println(a+b);
	            System.out.println("value of n" + n);
	        }

	}

}
