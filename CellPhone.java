

import java.util.*;
interface Camera
{
   abstract public void click();
    abstract public void record();
}
interface MusicPlayer
{
    abstract public void play();
    abstract public void stop();
}
 class Phone
{
   void call()
   {
       System.out.println("this is call method");
   }
   void sms()
   {
      System.out.println("this is sms method");
   }
}
class SmartPhone extends Phone implements Camera,MusicPlayer
 
{

   public void click()
   {
      System.out.println("this is click method");
    }
   public void record()
    {
       System.out.println("this is record method");
    }
   public void play()
    {
       System.out.println("this is play method");
    }
   public void stop()
   {
       System.out.println("this is stop method");
   }
 

}
class CellPhone
{
 


 public static void main(String []args)
  {
     Phone p=new Phone();
     p.call();
     p.sms();
    SmartPhone sp=new SmartPhone();
     sp.click();
     sp.record();
     sp.play();
     sp.stop();
     sp.call();
     sp.sms();
 }
}
