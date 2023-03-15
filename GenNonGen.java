import java.util.*;
public class GenNonGen
{
   public static void main(String []args)
  {
     ArrayList<String> l= new ArrayList<String>();
     l.add("komati");
     l.add("satya");
     m(l);
     System.out.println(l);
   }
   public static void m(ArrayList l)
  {
     l.add(10);
     l.add(10.5);
     l.add(true);
  }
}
