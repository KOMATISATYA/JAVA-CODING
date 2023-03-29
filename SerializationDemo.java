import java.io.*;
class Dog implements Serializable              //The process of writing state of an object to a file is called serialization.
{                                              //For serialization process the class should implement Serializable Interface.
  int i=10;
  int j=20;
}
class SerializationDemo
{
  public static void main(String []args) throws Exception
  {
    Dog d1=new Dog();
    FileOutputStream fos=new FileOutputStream("xyz.ser");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(d1);
    FileInputStream fis=new FileInputStream("xyz.ser");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Dog d2=(Dog)ois.readObject();
    System.out.println(d2.i+"...."+d2.j);
  }
}
