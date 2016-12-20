package dc.learn.ArrayExample;

import java.util.Arrays;

public class ArrayCopyReferences {

	/**
	 * @param args
	 */
	 public static void main(String[] args)
	   {
	      Object[] obj1 = {new Integer(10),
	                       new StringBuffer("foobar"),
	                       new Double(12.95)};
	      
	     // int[][] d = new int[5][]; // Run time exception // NullPointer Exception 
	      boolean[] a = new boolean[200];
	     /* int [] b = (int[])a.clone();
	      System.out.println(Arrays.equals(a, b));
	      if (!a.equals(b) ){
	    	  System.out.println("True" + "Inside here");
	    	  b[0]++;
	      }
	      System.out.println(b[0]);
	    */  
	      if(a[125]){
	    	  System.out.println("False array");
	      }
	      
	      Object[] obj = {new Integer(10), new String("CMU"), new Double(1.23)};
	      Object[] twin = (Object[]) obj.clone();
	      obj[1] = new Integer(15);
	      System.out.println("Twin:" + twin[0] + "Obj" + obj[1]);
	      
	    /*  d[0][0] = 10;
	      System.out.println(d[0][0]);
*/
	      Object[] obj2 =  new Object[obj1.length];
	      for(int i = 0; i < obj1.length; i ++)
	            obj2[i] = obj1[i];

	      //this change to obj1 does NOT effect obj2.
	      obj1[0] = new Integer(102);
	      obj2[0] = obj1[0];

	      System.out.println(Arrays.toString(obj1));
	      System.out.println(Arrays.toString(obj2));
	      System.out.println();


	      //this change to obj1 DOES effect obj2
	      ((StringBuffer) obj1[1]).append('s');

	      System.out.println(Arrays.toString(obj1));
	      System.out.println(Arrays.toString(obj2));
	   }


}
