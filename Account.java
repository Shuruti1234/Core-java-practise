/*
Account class: deposit, withdraw, min bal<1000 , you can't withdraw
*/

import java.util.Scanner;
class BankAccount
{
	private int accountNumber;
	private String name;
	private String password;
	private String panCardNo;
	private long phoneNumber;
	private double balance;
	
	
	// no argument constructor
	BankAccount()
    {
		accountNumber=0;
		name="Unknown";
		password="1234";
		panCardNo="null";
		phoneNumber=0l;
		balance=00.00;
		
	
	}	
	
	//parameterized constructor
	
	BankAccount(int accountNumber, String name, String password, String panCardNo,long phoneNumber)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.password=password;
		this.panCardNo=panCardNo;
		this.phoneNumber=phoneNumber;
		this.balance= 1000.00;
		
		
	}
	//overloading the constructor
	BankAccount(int accountNumber, String name, String password, String panCardNo,long phoneNumber, double balance)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.password=password;
		this.panCardNo=panCardNo;
		this.phoneNumber=phoneNumber;
		this.balance= balance;
			
		
	}
	
	void deposit(double amt)
	{
		this.balance+=amt;
		System.out.println("The balance for :"+this.accountNumber+ "has been credited by :Rs"+ amt);
		System.out.println("Total balance is :Rs"+this.balance);
		
	}
	
	void withdraw(double amt)
	{
	   double money =this.balance;
       money= money-amt;
       if(money>=1000.00)
       {
		   this.balance=money;
		   System.out.println("The balance for :"+this.accountNumber+ "has been debited by :Rs"+ amt);
	   }
       else
	   {
		System.out.println("You don't have sufficient balance to withdraw");   
	   }		   
		System.out.println("Total balance is :Rs"+this.balance);
	}
	
	void printBankAccountDetails()
	{
		System.out.println("Account Number :"+this.accountNumber);
		System.out.println("Account Holder Name :"+this.name);
		System.out.println("PAN card number :"+this.panCardNo);
		System.out.println("Phone Number :"+this.phoneNumber);
		System.out.println("Account Balance :"+this.balance);
		
	}
	
}


class Account
{
	
	public static void main(String ...args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		double bal;
		BankAccount person1= new BankAccount(45433,"Shuruti Singhal","sh123","fgrd345",99778,60000);;
		do
		{
			System.out.println("Enter your choice:");
			System.out.println("1. Print account details");
			System.out.println("2. Deposit money");
			System.out.println("3. Withdraw money");
			System.out.println("0.Exit");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1 : person1.printBankAccountDetails();		
                         break;
                case 2 : System.out.println("Enter the amount to deposit:");
				        bal = sc.nextDouble();
						person1.deposit(bal);
						break;
				case 3 : System.out.println("Enter the amount to withdraw:");
				        bal = sc.nextDouble();
						person1.withdraw(bal);
						break;		
				default : System.out.println("Wrong input");		
				
                         				
			}
			
			
		}while(choice!=0);
		
		
		
		
	}

	
}
