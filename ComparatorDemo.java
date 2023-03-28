import java.util.*;
public class ComparatorDemo
{
 public static void main(String []args)
  {
    TreeSet<Integer> t=new TreeSet<>(new MyComparator());  //passing comparator object
    t.add(10);
    t.add(0);
    t.add(15);
    t.add(5);                                 
    t.add(20);
    t.add(20);
    System.out.println(t);
  }
}
class MyComparator implements Comparator
{
   public int compare(Object obj1,Object obj2)      //comparator(I) contains compare method.In this we should give a customized sorting order.
   {
     Integer i1=(Integer)obj1;
     Integer i2=(Integer)obj2;
     if(i1<i2)
       return -1;
     else if(i1>i2)
       return 1;
     else
       return 0;
    }
}
    
