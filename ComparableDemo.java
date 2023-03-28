import java.util.*;
public class ComparableDemo
{
 public static void main(String []args)   //Comparable(I) contains compareTo() method.Jvm will autometically call the compareTo() method.
  {
    TreeSet t=new TreeSet();              //when we want default nature of sorting order then we go to the Comparable(I).
    t.add("K");
    t.add("Z");
    t.add("A");
    t.add("A");
    System.out.println(t);
  }
}
    
