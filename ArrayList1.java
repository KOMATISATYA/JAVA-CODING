import java.util.*;
class ArrayList1
{
  public static void main(String []args)
  {
      ArrayList<Integer> l=new ArrayList<Integer>();
      
      Scanner sc=new Scanner(System.in);
      int x=0;
      while(x!=-1)
      {
      System.out.println("enter a number ");

      int n=sc.nextInt();
      addElement(l,n);
     System.out.println("If Continue the add...enter 1 , if not add...enter -1");
      x=sc.nextInt();
     }
System.out.println(l);
      
   }
  static void addElement(ArrayList<Integer> l,int n)
  {
      if(!l.contains(n))
           l.add(n);
   }
}
  
      
 
