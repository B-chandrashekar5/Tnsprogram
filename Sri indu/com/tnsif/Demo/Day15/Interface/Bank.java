package com.tnsif.Demo.Day15.Interface;

public interface Bank {
	int MIN_BALANCE=1000;
	int DEPOSITE_LIMIT=25000;
	void deposite(Account account,double amount);
	void withdraw(Account account,double amount);

}
