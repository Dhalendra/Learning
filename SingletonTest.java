package dc.learn.Testpack;

public class SingletonTest {
	
	// one more method
	
	public enum Singleton{
		 INSTANCE;
	}
	
	private static SingletonTest singleton = new SingletonTest(); // Private static variable
	
	private SingletonTest(){} // private Constructor
	
	public static  SingletonTest getInstance(){ //Public getInstance method
		return singleton;
	}
	
	public void singletonDemo(){
		System.out.println("Demo for singleton");
	}

}

// Old method to write Singleton
// Double null check singelton 

 class ClassicSingleton {

	   private static volatile ClassicSingleton instance = null;
	   private ClassicSingleton() {
	      // Exists only to defeat instantiation.
	   }

	   public  ClassicSingleton getInstance() {
	      if(instance == null) {
	    	  synchronized(ClassicSingleton.class){
	    		 if(instance == null) instance = new ClassicSingleton(); 
	    	  }
	         // Lazy instantiation.
	      }
	      return instance;
	   }
	}