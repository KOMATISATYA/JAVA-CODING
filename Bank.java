

import java.util.*;
class Account
{
   long accountNo,phoneNo;
     double balance;
   String name,address;
   public Account(long accNo,long ph,double bal,String n,String a)
   {
      this.accountNo=accNo;
      this.phoneNo=ph;
      this.balance=bal;
      this.name=n;
      this.address=a;
      
   }
   void get()
   {
      
      System.out.println("accont no"+accountNo);
      System.out.println("phone no"+phoneNo);
      System.out.println("balance"+balance);
      System.out.println("name"+name);
      System.out.println("address"+address);
      
   }
  void closeAccount()
  {
    System.out.println("this is the closeAccount method in class Account");
  }
}
class SavingsAccount extends Account

{
String fixedDepositDetails;

 public String getfixedDepositDetails(){
        return fixedDepositDetails;
    }
  public SavingsAccount(long accNo,long ph,double bal,String n,String a)
  {
      super(accNo,ph,bal,n,a);
  }
  double withdraw(double amount)
  {
     System.out.println("this is the withdraw method in class SavingsAccount");
     super.balance=super.balance-amount;
     return super.balance;
  }
  double deposit(double amount)
  {

    System.out.println("this is the deposit method in class SavingsAccount");
    super.balance=super.balance+amount;
    return super.balance;
  }
  void fixedDeposit(double amount,int yr)
  {
     System.out.println("this is the fixedDeposit method in class SavingsAccount");
     double finalAmount = ((amount*yr*5.5)/100) + amount;
     this.fixedDepositDetails = amount+"deposited for the timeperiod of"+yr+"years, and the final amount would be "+finalAmount;

 }
}
class LoanAccount extends Account
{
  double limit, availableLimit;
   public LoanAccount(long accNo,long ph,double bal,String n,String a)
  {
      super(accNo,ph,bal,n,a);
  }
    public double getLimit(){
        return limit;
    }
    public double getAvailableLimit(){
        return availableLimit;
    }
    public void setLimit(double limit){
        this.limit = limit;
    }
    public void setAvailableLimit(double availableLimit){
        this.availableLimit = availableLimit;
    }

    public void payEMI(double amount){
        availableLimit = availableLimit+amount;
        System.out.println("amount paid"+amount);
    }

    public void topUpLoan(double amount){
        availableLimit = availableLimit+amount;
        limit = limit+amount;
         System.out.println("credit limit extended to "+limit);
    }

    public void repayment(double amount){
        availableLimit = availableLimit+amount;
         System.out.println("amount paid"+amount);
    }
}
class Bank
{
  public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter name");
      String n=sc.nextLine();
      System.out.println("enter accont no");
      long accNo=sc.nextLong();
      System.out.println("enter phone no");
      long phNo=sc.nextLong();
      System.out.println("enter balance");
      double bal=sc.nextDouble();
      
      System.out.print("enter address");
      String a=sc.nextLine();
       
       Account acc=new Account(accNo,phNo,bal,n,a);
      acc.get();
     SavingsAccount sav=new SavingsAccount(accNo,phNo,bal,n,a);
     System.out.println("Enter withdraw amount");
     double d=sc.nextDouble();
     System.out.println("After withDraw balance is"+sav.withdraw(d));
     System.out.println("Enter deposit amount");
     double x=sc.nextDouble();
     System.out.println("After withDraw balance is"+sav.deposit(x));
     System.out.println("Enter amount for fixeddeposit");
     
     double y=sc.nextDouble();
    System.out.println("Enter year for fixeddeposit");
     int z=sc.nextInt();
     sav.fixedDeposit(y,z);
     //sav.get();
   LoanAccount lan=new LoanAccount(accNo,phNo,bal,n,a);
    System.out.println("Enter limt");
    double limit=sc.nextDouble();
   lan.setLimit(limit);
    System.out.println("Enter Avllimt");
    double avllimit=sc.nextDouble();
    lan.setAvailableLimit(avllimit);
   
    lan.payEMI(1000);
    lan.topUpLoan(2000);
    lan.repayment(4780);
}
}

  


  
