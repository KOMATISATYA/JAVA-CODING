import java.util.*;
class FileReader1
{
  public static void main(String []args)
 {
  File file=new File("C:\\Users\\DELL\\demo1\\xyz.txt");

  try{
   FileWriter f=new FileWriter("xyz.txt");
   BufferedWriter bw=new BufferedWriter(f);
   bw.write(100);
   bw.newLine();
   char[] ch={'a','b','c'};
   bw.write(ch);
   bw.newLine();
   bw.write("Satya");
    bw.close();
} 
catch(IOException x)
 {
  System.out.println("Exception1");
}
  
    try
  {

   FileReader fr=new FileReader("xyz.txt");
   BufferedReader br=new BufferedReader(fr);
   String line=br.readLine();
   while(line!=null)
   {
      System.out.println(line);
      line=br.readLine();
   }
  br.close();
 }
 catch(IOException e)
  {
    System.out.println("Exception");
}
  }
}
