import java.util.*;
class Even{
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size");
  int n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("enter numbers");
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
  }
  int arr1[]=new int[n];
  int arr2[]=new int[n];
  int k=0,j=0;
  for(int i=0;i<n;i++)
  {
    if(arr[i]%2==0)
    {
       arr1[k]=arr[i];
       k++;
    }
    else
    {
       arr2[j]=arr[i];
       j++;
    }
  }
System.out.println("even array");
for(int i=0;i<k;i++)
{
  System.out.println(arr1[i]);
}
System.out.println("odd array");
for(int i=0;i<j;i++)
{
  System.out.println(arr2[i]);
}
}
}
 
      

