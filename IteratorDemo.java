import java.util.*;
class IteratorDemo
{
   public static void main(String []args)
   {
     ArrayList<Integer> l=new ArrayList<>();
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
   Iterator itr=l.iterator();
   while(itr.hasNext())
   {
     Integer i=(Integer)itr.next();
     if(i%2==0)
        System.out.println(i);
     else
        itr.remove();
  }
  System.out.println("After iterator AL is"+l);
}
}
   
