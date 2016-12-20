package dc.learn.CollectionTest;


import java.util.*;
public class WeakHashMapDemo {

   private static Map<String, String> map;
   public static void main (String args[]) {
      map = new WeakHashMap<String, String>();
      map.put(new String("Maine"), "Augusta");
      
      Runnable runner = new Runnable() {
         public void run() {
            while (map.containsKey("Maine")) {
               try {
                  Thread.sleep(1000);
               }catch (InterruptedException ignored) {
               }
               System.out.println("Thread waiting");
               System.gc();
            }
         }
      };
      
      Thread t = new Thread(runner);
      t.start();
      System.out.println("Main waiting");
      try {
         t.join();
      }catch (InterruptedException ignored) {
      }
   }
}