package com.exam;



import java.util.*;

class BankAccount{
	double account_no;
	String account_holder;
	double acc_balance = 10000;
	
	void getdata(double account_no, String account_holder, double acc_balance) {
		this.account_no=account_no;
		this.account_holder=account_holder;
		this.acc_balance=acc_balance;
	}
	
	void showdata() {
		System.out.println("Account no is: "+account_no+"\nName is: "+account_holder+"\nBalance is: "+acc_balance);
	}
	
	double deposit(double amt){
		double new_balance = acc_balance + amt;
		return new_balance;
	}
	
	double withdrawal(double amt) {
		double new_balance = acc_balance - amt;
		return new_balance;
	}
}

class SavingsAccount extends BankAccount{
	double interest_rate = 7;
	int time;
	BankAccount b = new BankAccount();
	 void interest(int time) {
		 double interest = b.acc_balance * time * interest_rate ;
		 System.out.println("Calculated amount is: "+interest);
		 System.out.println("Account type is Savings Account");
	 }
}

class CheckingAccount extends BankAccount{
	double overdraft_limit;
	BankAccount b = new BankAccount();

	void overdraft(double amount) {
		if(amount>b.acc_balance) {
			System.out.println("Overdraft has been implemented");
		}
		else
			System.out.println("Account balance: "+b.acc_balance+"\nThis is a Checking Account");
	}
}

public class Q10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();
		SavingsAccount sa = new SavingsAccount();
		CheckingAccount ca = new CheckingAccount();

		ba.getdata(1299430, "Jaya", ba.acc_balance);
		ba.showdata();
		System.out.println("\n1)Deposit \n2)Withdrawal \n3)Interest calculation \n4)Overdraft");
		System.out.print("Enter your choice: ");
		int c = sc.nextInt();
	    
		switch(c) {
		case 1: System.out.print("Enter the amount to be deposited: ");
				double amt = sc.nextDouble();
				System.out.println("Balance now is: "+ba.deposit(amt));
				break;
		case 2: System.out.print("Enter the amount to be withdrawn: ");
				double amount = sc.nextDouble();
				System.out.println("Enter the amount to be withdrawn: "+ba.withdrawal(amount));
				break;
		case 3: System.out.print("Enter the time period: ");
				int time = sc.nextInt();
				sa.interest(time);
				break;
		case 4: System.out.print("Enter the amount: ");
				double amount1 = sc.nextDouble();
				ca.overdraft(amount1);
				break;
		default: System.out.println("Enter valid choice!");
				 break;
		}
	}
}
