import java.io.*;
import java.util.*;
public class FileExample {
   public static void main( String[] args ) {

      try {
         String data = "This is the file Example";
         File f1 = new File("abc.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         }

         FileWriter fileWritter = new FileWriter(f1.getName());
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("Done");
      } catch(IOException e){
         e.printStackTrace();
      }

   }
}
