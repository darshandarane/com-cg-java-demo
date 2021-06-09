package com.cg.demo.oop;

public class BankCustomer
{
	static int ifsc = 10101;
	int acNo;
	String name;
	double balance;
	
	void checkBalance() {
		System.out.println(balance);
   }
	
	static void openAccount() {
		System.out.println("Open an Account.");
	}
	
	public static void main(String[] args) {
		 
		BankCustomer c1 = new BankCustomer();
		c1.acNo = 1025;
		c1.name = "Spome";
		c1.balance = 120000;
		System.out.println(c1.acNo + "  " + c1.name + " " + "  " + c1.balance) ;
		c1.checkBalance();
		//checkBalance();
		//System.out.println(balance);
		openAccount();
		System.out.println(ifsc);
		System.out.println(c1.ifsc);
	
	}
	
} 