
import java.util.*;
abstract class Shape
{
  public abstract double perimeter();
  public abstract double area();
}
class Circle extends Shape
{
   double radius;
   double pi=Math.PI;
  public Circle(double r)
  {
    
    this.radius=r;
  }
  public double perimeter()
  {
    return (2*pi*radius);
  }
  public double area()
  {
    return (pi*Math.pow(radius,2));
  }
}

class Rectangle extends Shape
{
   double length;
   double breath;
  public Rectangle(double l,double b)
  {
   this.length=l;
   this.breath=b;
  }
  public double perimeter()
  {
    return 2*(length+breath);
  }
  public double area()
  {
    return length*breath;
  }
}
class AbsShape
{
  public static void main(String []args)
  {
    System.out.println("enter length of rectangle");
    Scanner sc=new Scanner(System.in);
   double  l=sc.nextDouble();
    System.out.println("enter breath of rectangle");
   double b=sc.nextDouble();

     Shape rectangle = new Rectangle(l,b);
     
    System.out.println("perimeter of rectangle"+ rectangle.perimeter());
     System.out.println("area of rectangle"+rectangle.area());

    System.out.println("enter radius of circle");
    double r=sc.nextDouble();
    Shape circle = new Circle(r);
    System.out.println("perimeter of circle"+ circle.perimeter());
     System.out.println("area of circle"+circle.area());
  }
}

