package dc.learn.Testpack;

public class OuterClass {
	
	private int i = 12;
	
	private class Inner_class{
	//public class Inner_class{
		public void print(){
			System.out.println("This is Inner class: int : " +12);
		}
	 
	}
	
	/*public void access_inner(){
		Inner_class iClass = new Inner_class();
		iClass.print();
	}*/
}
