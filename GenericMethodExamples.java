package dc.learn.Testpack;


public class GenericMethodExamples {

		   // generic method printArray
		   public static < MyArray > void printArray( MyArray[] inputArray ) {
		      // Display array elements
		      for(MyArray element : inputArray) {
		         System.out.printf("%s ", element);
		      }
		      System.out.println();
		   }
		   
		   public static <MyNumber extends Comparable <MyNumber>> MyNumber calculateMax(MyNumber a, MyNumber b, MyNumber c){
			   MyNumber max= a;
			   if(b.compareTo(max)>0){
				   max = b;
			   }
			   if(c.compareTo(max)>0){
				   max=c;
			   }
			   return max;
			   
		   }

		   public static void main(String args[]) {
		      // Create arrays of Integer, Double and Character
		      Integer[] intArray = { 1, 2, 3, 4, 5 };
		      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		      
		     // You can't convert String to collection directly. String is not collection, however, you Array of String object is a collection.

		      System.out.println("Array integerArray contains:");
		      printArray(intArray);   // pass an Integer array

		      System.out.println("\nArray doubleArray contains:");
		      printArray(doubleArray);   // pass a Double array

		      System.out.println("\nArray characterArray contains:");
		      printArray(charArray);   // pass a Character array
		      
		      System.out.println(calculateMax(12.02, 10.03, 109.99));
		      
		      
		   }

}
