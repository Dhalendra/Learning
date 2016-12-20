package dc.learn.Testpack;

import java.io.*;
public class SerializeDemo {

   public static void main(String [] args) {
      Test e = new Test();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      
      //Try-With-Resource can't be used with Object Streams .. Object Stream doesn't implements auto-closeable interface. 
      
     // try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("input.txt"))){
      try{
        FileOutputStream fileOut =
         new FileOutputStream("input.txt");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i) {
         i.printStackTrace();
      }
   }
}
