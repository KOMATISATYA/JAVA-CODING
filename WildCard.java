import java.util.ArrayList;  
  
public class WildCard {  
  
      private static Double add(ArrayList<? extends Number> num) {  
        
       System.out.println("UpperBound");
      
        double sum=0.0;  
          
        for(Number n:num)  
        {  
            sum = sum+n.doubleValue();  
        }  
          
        return sum;  
    }  
    private static void show(ArrayList<? super Integer> n)
    {
       System.out.println("LowerBound");
       System.out.println(n);
    }
   private static void show1(ArrayList<?> n)
    {
       System.out.println("UnBound");
       System.out.println(n);
    }
     


    public static void main(String[] args) {  
          
        ArrayList<Integer> l1=new ArrayList<Integer>();  
        l1.add(10);  
        l1.add(20);  
        System.out.println("displaying the sum= "+add(l1));  
          
        ArrayList<Double> l2=new ArrayList<Double>();  
        l2.add(30.0);  
        l2.add(40.0);  
        System.out.println("displaying the sum= "+add(l2)); 
        
        ArrayList<Integer> l3=new ArrayList<Integer>(); 
        l3.add(50);
        l3.add(60);
        show(l3);
        ArrayList<Number> l4=new ArrayList<Number>(); 
        l4.add(10.5);
        l4.add(3);
        show(l4);
  
        ArrayList<String> l5=new ArrayList<String>(); 
        l5.add("komati");
        l5.add("Satya");
        show1(l3);
        
     }  
      
}  
