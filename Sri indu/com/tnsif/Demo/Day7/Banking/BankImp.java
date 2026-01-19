package com.tnsif.Demo.Day7.Banking;

public class BankImp implements Bank{
	public void deposit(Account account,double amount){
		if(amount>DEPOSIT_LIMIT) {
			System.out.println("Deposit amount be less than 25000!");
		}
		else {
			account.setBalance(account.getBalance()+amount);
			System.out.println("Amount is deposited.");
			
			
		}
	}
	public void withdraw(Account account,double amount) {
		if(account.getBalance()-amount>=MIN_BALANCE) {
			account.setBalance(account.getBalance()-amount);
			System.out.println("Amount is withdrawn.");
		}
		else {
			System.out.println("insufficient funds!..");
		}
		
		
	}

}