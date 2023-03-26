import java.util.*;
public class SetDemo {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array to be created ::");
      int size = sc.nextInt();
      int [] arr = new int[size];
      for(int i=0; i<arr.length; i++){
         System.out.println("Enter the element "+(i+1)+"  ");
         arr[i]=sc.nextInt();
      }
      Set set = new HashSet();
      for(int i=0;i<size;i++)
       {
            if(!set.contains(arr[i]))
                set.add(arr[i]);
       }
      System.out.println("Contents of set ::"+set);
   }
}
   
