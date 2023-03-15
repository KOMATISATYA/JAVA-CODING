import java.util.*;
import java.io.*;
class EmployeeTest{
    

    public static double salary;
    public static String emp_name, addr, emp_id;
   
    public void menu(){
        System.out.println("MENU:");
        System.out.println("1.Insert employee\n2.Display employees\n3.search employee \n4.delete file\n5.exit");

    }
    public void insert(){
        try{
            File file = new File("C:\\Users\\DELL\\demo1\\Employee.txt");
            if(!file.exists()){
                file.createNewFile();
            }
                FileWriter f=new FileWriter("Employee.txt",true);
                BufferedWriter bw=new BufferedWriter(f);
                String str =" "+emp_id+" "+emp_name+" "+salary+" "+addr+"\n";
                bw.write(str);
                bw.flush();
                bw.close();
        
        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println("record inserted");
    }
    public void display(){
       
                FileInputStream f1;
                try {
                        f1 = new FileInputStream("C:\\Users\\DELL\\demo1\\Employee.txt");
                
                try {
                         FileReader fr=new FileReader("Employee.txt");
                         BufferedReader br=new BufferedReader(fr);
                          String line=br.readLine();
                        while(line!=null)
                             {
                             System.out.println(line);
                              line=br.readLine();
                               }
  
                } 
                
                catch(IOException e){
                System.out.println(e);
                }
                }
                catch (FileNotFoundException e) {
                        System.out.println("file not found");
                 }
                
    }
   
}
class Employe extends EmployeeTest{
	public static void main(String args[]){
        EmployeeTest e = new EmployeeTest();
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
                    e.display();
                    break;
            case 3:
                    String line ="";
                    try{
                    File file = new File("C:\\Users\\DELL\\demo1\\Employee.txt");
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
                
                File fo = new File("C:\\Users\\DELL\\demo1\\Employee.txt");
                if(fo.delete()){
                        System.out.println("file deleted");
                }
                else{
                        System.out.println("error in deletion");
                }
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
