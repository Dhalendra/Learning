package dc.learn.ArrayExample;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class ArraysDemo {

	public static void main(String[] args) {

		/*// initializing unsorted int array
		int intArr[] = { 30, 20, 5, 12, 55 };
		String str = "hello";
		System.out.println(str.length()); // method
		System.out.println("Array length : "+ intArr.length);  // Field

		// sorting array
		Arrays.sort(intArr);

		// let us print all the elements available in list
		System.out.println("The sorted int array is:");
		for (int number : intArr) {
			System.out.println("Number = " + number);
		}

		// entering the value to be searched
		int searchVal = 0;

		int retVal = Arrays.binarySearch(intArr, searchVal);

		System.out.println("The index of element 12 is : " + retVal);
		*/

		/**
		 * BIRTHDAY PARADOAX
		 */
		
		Random rand = new Random();
	   // boolean[] bool = new boolean[356];
		Map <Integer, Boolean> map  = new TreeMap<Integer, Boolean>();
	    int count = 0;
	    while(true){
	    	int random = rand.nextInt(356);
	    	//map.put(random, false);
	    	System.out.println(random);
	        count++;
	        if(map.containsKey(random) && map.containsValue(true) ){ 
	        	count--;
	        	System.out.println(" Inside if");
	            break;
	        }
		    //bool[random] = true;
	        map.put(random, true);
	    }
	    System.out.println(count);
	}

}
