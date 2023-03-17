class Equals {
    public static void main(String[] args)               //== is used for reference comparision
    {
        String s1 = "Satya";                               //.equals() is used for content comparision
        String s2 = "Satya";
        String s3 =  new String("HELLO");
        System.out.println("Using ==");
        System.out.println(s1 == s2); 
        System.out.println(s1 == s3); 
        System.out.println("Using .equals() method");

        System.out.println(s1.equals(s2)); 
        System.out.println(s1.equals(s3)); 
    }
}
