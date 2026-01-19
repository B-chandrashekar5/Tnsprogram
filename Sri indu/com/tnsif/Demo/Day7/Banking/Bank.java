package com.tnsif.Demo.Day7.Banking;

public interface Bank {
	double MIN_BALANCE=1000;
	double DEPOSIT_LIMIT=25000;
	
	void deposit(Account account,double amount);
	void withdraw(Account account,double amount);

}