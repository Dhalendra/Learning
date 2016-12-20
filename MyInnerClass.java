package dc.learn.Testpack;

//Annonymous class is mostly used to write an one time implementation for Abstract class and abstract method. 

abstract class AnonymousIn {
	   public abstract void mymethod();
	}

public class MyInnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*OuterClass oClass = new OuterClass();
		OuterClass.Inner_class iClass = oClass.new Inner_class();
		//oClass.access_inner();
		iClass.print();*/
		 AnonymousIn inner = new AnonymousIn() {
	         public void mymethod() {
	            System.out.println("This is an example of anonymous inner class");
	         }
	      };
	      inner.mymethod();
	}

}
