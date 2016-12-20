package dc.learn.CollectionTest;
import java.util.*;
public class SetExamples {

	public SetExamples() {
		// TODO Auto-generated constructor stub
	}
	

	   public static void main(String args[]) {
	      // Create a tree set
	      LinkedHashSet<String> s1 = new LinkedHashSet<String>();
	     Set<String> ts = new TreeSet<String>(s1);
	      // Add elements to the tree set
	      ts.add("C");
	      ts.add("A");
	      ts.add("B");
	      ts.add("E");
	      ts.add("F");
	      ts.add("F");
	      ts.remove("P");
	      ts.add("Hello World");
	     // ts.add(null);
	      System.out.println(ts);
	   }
	}


