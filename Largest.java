import java.util.*;
class Largest{
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
   System.out.println("enter numbers");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   if(a>b && a>c)
   {
     System.out.println("largest number"+a);
   }
   if(b>c)
   {
     System.out.println("largest number"+b);
   }
   else
   {
     System.out.println("largest number"+c);
   }
}
}