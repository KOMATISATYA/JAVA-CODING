import java.util.*;
class Generics
{
  public static void main(String []args)
{
 ArrayList<Integer> l=new ArrayList<Integer>();
  l.add(9);
   l.add(12);
int x=l.get(0);
int y=l.get(1);
System.out.println(x);
System.out.println(y);
Iterator<Integer> itr = l.iterator();
 while(itr.hasNext()){
      System.out.println(itr.next());
}
  
}
}