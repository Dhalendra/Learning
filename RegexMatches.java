package dc.learn.Testpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	/*public static void main(String args[]) {
		// String to be scanned to find the pattern.
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(line);
	
		if (m.find()) {
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
		} else {
			System.out.println("NO MATCH");
		}
	}*/
	
	private static final String REGEX = "cat";
	   private static final String INPUT = "cat cat cat cattie cat";

	   public static void main( String args[] ) {
	      Pattern p = Pattern.compile(REGEX);// get a Pattern Object
	      Matcher m = p.matcher(INPUT);   // get a matcher object
	      int count = 0;

	      while(m.find()) {
	         count++;
	         System.out.println("start(): "+m.start());
	         System.out.println("end(): "+m.end());
	      }
	      System.out.println("Match number "+count);
	         
	   }
}
