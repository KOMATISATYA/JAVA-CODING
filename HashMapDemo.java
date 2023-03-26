import java.util.*;     
public class HashMapDemo 
{  
public static void main(String args[])   
{  
System.out.println("enter a String");
Scanner sc =new Scanner(System.in);
String str = sc.next();    
HashMap<Character,Integer> h = new HashMap<>();  
for (int i = str.length() - 1; i >= 0; i--)   
{  
if(h.containsKey(str.charAt(i)))   
{  
int count = h.get(str.charAt(i));  
h.put(str.charAt(i), ++count);  
}   
else   
{  
h.put(str.charAt(i),1);  
}  
}  
System.out.println(h);  
}  
}  
