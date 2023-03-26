import java.util.*;
class EnumerationDemo
{
  public static void main(String []args)
   {
     Vector<Integer> v =new Vector<Integer>();
     System.out.println("enter no of elements to add vector");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter elements to vector");
     for(int i=0;i<n;i++)
     {
       arr[i]=sc.nextInt();
       v.add(arr[i]);
     }
     System.out.println("elements vector"+v);
     Enumeration e=v.elements();
     while(e.hasMoreElements())
     {
        Integer i=(Integer)e.nextElement();
        if(i%2==0)
          System.out.println(i);
      }
     System.out.println("After enumeration"+v);
   }
}
