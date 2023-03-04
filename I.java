import java.util.*;
class I
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double p=sc.nextDouble();
double t=sc.nextDouble();
double r=sc.nextDouble();
double SI=(p*t*r)/100;
System.out.println("Simple interest"+SI);

double CI = p *(Math.pow((1 +r/ 100), t));
          
System.out.println("Compound Interest is "+ CI);
    }
}

