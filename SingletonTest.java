package dc.learn.Testpack;

public class SingletonTest {
	
	private static SingletonTest singleton = new SingletonTest(); // Private static variable
	
	private SingletonTest(){} // private Constructor
	
	public static SingletonTest getInstance(){ //Public getInstance method
		return singleton;
	}
	
	public void singletonDemo(){
		System.out.println("Demo for singleton");
	}

}

// Old method to write Singleton

 class ClassicSingleton {

	   private static ClassicSingleton instance = null;
	   private ClassicSingleton() {
	      // Exists only to defeat instantiation.
	   }

	   public static ClassicSingleton getInstance() {
	      if(instance == null) {
	         instance = new ClassicSingleton(); // Lazy instantiation.
	      }
	      return instance;
	   }
	}