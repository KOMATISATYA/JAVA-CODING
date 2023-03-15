public class ThrowsThrow {  
      
    public static int divideNum(int m, int n) throws ArithmeticException {  
        int div = m / n;  
        return div;  
    }  
      
    public static void main(String[] args) {  
        ThrowsThrow obj = new ThrowsThrow();  
        try {  
            System.out.println(obj.divideNum(26, 0));  
        }  
        catch (ArithmeticException e){  
            System.out.println("Number cannot be divided by 0");  
        }  
      }    
      
}  
