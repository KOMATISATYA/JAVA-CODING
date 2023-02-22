import java.util.*;
class Sum1{
  public static void main(String []args)
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter size");
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
   }
   int sum=0;
   for(int i=0;i<n;i++)
   {
     if(arr[i]%2==0)
     {
        sum=sum+arr[i];
     }
   }
 System.out.println("sum of even numbers"+sum);
} 
}
