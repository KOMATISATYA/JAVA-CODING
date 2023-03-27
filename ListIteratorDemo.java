import java.util.*;
public class ListIteratorDemo
{
   public static void main(String []args)
   {
     LinkedList<Integer> l=new LinkedList<>();
     System.out.println("enter no of elements");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter elements to AL");
     for(int i=0;i<n;i++)
     {
       arr[i]=sc.nextInt();
       l.add(arr[i]);
     }
    System.out.println(l);
   ListIterator ltr=l.listIterator();
   while(ltr.hasNext())
   {
     Integer i=(Integer)ltr.next();
     if(i%2==0)
        ltr.set(0);
     else 
        ltr.add(1);
     

  }
  System.out.println("After iterator AL is"+l);
}
}
   
