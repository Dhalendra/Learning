package dc.learn.Testpack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class CopyFiles {

	public static void main(String args[]) throws IOException { 
    //FileInputStream in = null;
    //FileOutputStream out = null;
		System.out.println(Math.pow(2,7));
    try (FileInputStream in = new FileInputStream("input.txt"); FileOutputStream out = new FileOutputStream("output.txt")){
      // in = new FileInputStream("input.txt");
       //out = new FileOutputStream("output.txt");
       
       System.out.println(in.read());
       int c;
       while ((c = in.read()) != -1) {
          out.write(c);
       }
    }/*finally {
       if (in != null) {
          in.close();
       }
       if (out != null) {
          out.close();
       }
    }*/
 }

}
