

import java.util.*;
class Account
{
   long accountNo,phoneNo,balance;
   String name,address;
   public Account(long accNo,long ph,long bal,String n,String a)
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
  public SavingsAccount(long accNo,long ph,long bal,String n,String a)
  {
      super(accNo,ph,bal,n,a);
  }
  void withdraw()
  {
     System.out.println("this is the withdraw method in class SavingsAccount");
  }
  void deposit()
  {

    System.out.println("this is the deposit method in class SavingsAccount");
  }
  void fixedDeposit()
  {
     System.out.println("this is the fixedDeposit method in class SavingsAccount");
 }
}
class LoanAccount extends Account
{
  public LoanAccount(long accNo,long ph,long bal,String n,String a)
  {
      super(accNo,ph,bal,n,a);
  }
  void payEMI()
  {
     System.out.println("this is the payEMI method in class LoanAccount");
 }
void topUpLoan()
  {
     System.out.println("this is the topUpLoan method in class LoanAccount");
 }
void repayment()
  {
     System.out.println("this is the repayment method in class LoanAccount");
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
      long bal=sc.nextLong();
      
      System.out.print("enter address");
      String a=sc.nextLine();
       
       Account acc=new Account(accNo,phNo,bal,n,a);
      acc.get();
     SavingsAccount sav=new SavingsAccount(accNo,phNo,bal,n,a);
     sav.withdraw();
     sav.deposit();
     sav.fixedDeposit();
     //sav.get();
   LoanAccount lan=new LoanAccount(accNo,phNo,bal,n,a);
    lan.payEMI();
    lan.topUpLoan();
    lan.repayment();
}
}

  


  
