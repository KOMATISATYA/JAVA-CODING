import java.util.*;
class All {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=x+y;
        int b=x-y;
        int c=x*y;
        int d=x/y;
        int e=x%y;
        
        System.out.println("addition of two numbers: "+a);
        System.out.println("\nsub of two numbers: "+b);
        System.out.println("mul of two numbers: "+c);
        System.out.println("division of two numbers: "+d);
        System.out.println("\nrem of two numbers: "+e);
    }
}