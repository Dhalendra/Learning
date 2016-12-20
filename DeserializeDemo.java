package dc.learn.Testpack;

	import java.io.*;
	public class DeserializeDemo {

	   public static void main(String [] args) throws NoSuchFieldException, IllegalAccessException, IOException {
	      Test e = null;
	      try {
	         FileInputStream fileIn = new FileInputStream("input.txt");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Test) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i) {
	         i.printStackTrace();
	         return;
	         // Java 7 feature Multiple catch block within one statement.
	         
	      }catch(IllegalArgumentException | SecurityException io) {
	         System.out.println("Employee class not found");
	         io.printStackTrace();
	         return;
	      } catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.address);
	      System.out.println("SSN: " + e.SSN);
	      System.out.println("Number: " + e.number);
	   }
	}

