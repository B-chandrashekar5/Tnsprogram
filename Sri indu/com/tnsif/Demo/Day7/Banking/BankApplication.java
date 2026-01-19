package com.tnsif.Demo.Day7.Banking;

public class BankApplication {
	public static void main(String [] args) {
		Bank bank=new BankImp();
		Account account=new Account(111,"chandu",5000,bank);
		account.deposit(9000);
		account.withdraw(5000);
		System.out.println(account);
	}
}