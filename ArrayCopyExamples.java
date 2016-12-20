package dc.learn.ArrayExample;

import java.util.Arrays;
public class ArrayCopyExamples {

	/**
	 * @param args
	 */

	   public static void main(String[] args)
	   {
	      int[] obj1 = {1, 2, 3};

	      //copying by using a loop structure
	      int[] obj2 =  new int[obj1.length];
	      for(int i = 0; i < obj1.length; i ++)
	         obj2[i] = obj1[i];
	      System.out.println(" loop copy: " + Arrays.toString(obj2) );

	      //copying by using arraycopy()
	      int[] obj3a =  new int[obj1.length];
	      System.arraycopy (obj1, 0, obj3a, 0, obj1.length);
	      System.out.println(" arrayCopy method : " + Arrays.toString(obj3a));

	      int[] obj3b =  new int[obj1.length];
	      System.arraycopy(obj1, 1, obj3b, 0, obj1.length-1);
	      System.out.println(Arrays.toString(obj3b));

	      //copying by using copyOf()
	      int[] obj4 = Arrays.copyOf(obj1, 1);
	      System.out.println(Arrays.toString(obj4));

	      //copying by using clone()
	      int[] obj5 = (int []) obj1.clone();
	      System.out.println(Arrays.toString(obj5));
	   }
	}

