class custom extends Exception
{
   String str;
   custom(String str1)
   {
      str=str1;
   }
   public String toString() {
      return ("Custom Exception Occurred : " +str);
   }
}



class CustomExample{
  public static void main(String []args)
  {
   try
   {
      throw new custom("this is the example of customexception");
   }
   catch(custom c)
    {
       System.out.println(c);
    }
 }
}
