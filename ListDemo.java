import java.util.*;
class ListDemo
{
  public static void main(String []args)
   {
      ArrayList l=new ArrayList();
      System.out.println("Enter your option");
      Scanner sc=new Scanner(System.in);
      int n=0;
      while(n!=4)
    {
      System.out.println("1.Insert\n2.Remove\n3.Display\n4.Exit");
      n=sc.nextInt();
      switch(n)
      {
         case 1:System.out.println("Enter number");
                int x=sc.nextInt();
                l.add(x);
                break;
         case 2:System.out.println("Enter number to delete");
                int y=sc.nextInt();
                if(l.contains(y))
                  {
                    l.remove(Integer.valueOf(y));
                    System.out.println("number deleted");
                   }
                else
                  {
                      System.out.println("number not present");
                  }
               break;
          case 3:System.out.println("The numbers are"+l);
                 break;
         
                 

        }
    }
   }
}
