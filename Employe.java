import java.util.*;
import java.io.*;
class Employee{
    

    public static double salary;
    public static String emp_name, addr, emp_id;
   
    public void menu(){
        System.out.println("MENU:");
        System.out.println("1.Insert employee\n2.Display employees\n3.search employee \n4.delete file\n5.exit");

    }
    public void insert(){
        try{
            File file = new File("C:\\Users\\DELL\\demo1\\empdetails.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file,true);
               String str =emp_id+" "+emp_name+" "+salary+" "+addr+"\n";
                fos.write(str.getBytes());
                fos.flush();
                fos.close();
        
        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println("record inserted");
    }
    public static String display(){
                String filecontent = "";
                FileInputStream f1;
                try {
                        f1 = new FileInputStream("C:\\Users\\DELL\\demo1\\empdetails.txt");
                
                try {
                        int i = f1.read();
                        while(!(i ==-1)){
                        char c = (char)i;
                        System.out.print(c);
                        filecontent = filecontent + c;
                        i = f1.read();
                        }
                } 
                
                catch(IOException e){
                System.out.println(e);
                }
                }
                catch (FileNotFoundException e) {
                        System.out.println("file not found");
                 }
                 return filecontent;
                
    }
    public static void removeRecord(File file, String empid) {
                    String line ="";
                    String empobj = "";
                    String filecontent = display();
                   
                    try{

                        Scanner sc1 = new Scanner(file);
                        while(sc1.hasNextLine()){

                                line = sc1.nextLine();
                                if(line.startsWith(empid)){
                                        empobj = empobj + line + "";
                                } 
                
                        }
                        
                        FileOutputStream fos = new FileOutputStream(file);
                        String finalcontent = filecontent.replace(empobj.trim(),"");
                        fos.write(finalcontent.getBytes());
                        fos.flush();
                        fos.close();
                        sc1.close();
                        System.out.println("record "+ empobj + " deleted successfully");
                    }
                    catch(IOException ae){
                    System.out.println(ae);
                    }

    }

}

class Employe extends Employee{
	public static void main(String args[]){
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
        e.menu();
        System.out.println("enter option: ");
        ch = sc.nextInt();
        
            switch(ch){
            case 1:
                    
                    System.out.println("insert employee details");
                    System.out.println("enter employee Id");
                    emp_id = sc.next();
                    System.out.println("enter employee Name");
                    emp_name = sc.next();
                    System.out.println("enter employee salary");
                    salary = sc.nextDouble();
                    System.out.println("enter employee Address");
                    addr = sc.next();
                    e.insert();

                    break;
            case 2:
                    display();
                    break;
            case 3:
                   
                    String line ="";
                    

                    try{
                    FileInputStream  file = new FileInputStream("C:\\Users\\DELL\\demo1\\empdetails.txt");
                    System.out.println("enter employee id");
                    emp_id = sc.next();
                    Scanner sc1 = new Scanner(file);
                    while(sc1.hasNextLine()){
                        line = sc1.nextLine();
                        if(line.startsWith(emp_id)){
                                System.out.println(line);
                              
                        } 
                        
                        
                    }
                   
                    sc1.close();
                    }
                    catch(IOException ae){
                    System.out.println(ae);
                    }
                    break;
            case 4:
                File file = new File("C:\\Users\\DELL\\demo1\\empdetails.txt");
                System.out.println("enter emp id to delete");
                String emp_id = sc.next();
                removeRecord(file,emp_id);
                
                   break;
            case 5:
                    System.exit(0);
            default:
                    System.out.println("invalid option");
                    
            }
        }while(ch>0);
        sc.close();
    }

       
}
