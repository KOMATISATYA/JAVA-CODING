import java.lang.*;
import java.io.*;
import java.util.regex.*;
import java.util.*;

class ValidPin
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a Pincode:");
String pincode = s.nextLine();

String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
Pattern p = Pattern.compile(regex);

if(pincode == null)
{
System.out.println("Not a valid Pin Code");

}

Matcher m = p.matcher(pincode);
System.out.println(m.matches());


}
}