import java.util.*;
class Array{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("enter array elements");
for(int i=0;i<n;i++)
{
  arr[i]=sc.nextInt();
}
Arrays.sort(arr);
for (int i = n- 2; i >= 0; i--)
{
if (arr[i] != arr[n - 1])
{
System.out.println("The second largest " +
                        "element is %d\n", arr[i]);
 break;
  }
  }

}
}
