import java.util.*;
class Currency
{
  public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter indian Currency");
double n=sc.nextDouble();
System.out.println("enter country to change indian currency-1.1.japan,2.america,3.dubai");
int s=sc.nextInt();
switch(s)
{

case 1: double x=n*1.66;
           System.out.println("indian to japan"+x);
break;
case 2: double y=n*0.012;
           System.out.println("indian to america"+y);
break;
case 3: double z=n*0.045;
           System.out.println("indian to dubai"+z);
break;
}
}
}
