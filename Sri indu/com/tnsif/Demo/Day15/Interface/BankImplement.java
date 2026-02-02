package com.tnsif.Demo.Day15.Interface;

public class BankImplement implements Bank {

	@Override
	public void deposite(Account account,double amount) {
			if(amount>DEPOSITE_LIMIT) {
				System.out.println("The deposite is not possible");
			}
			else {
				account.setBalance(account.getBalance()+amount);
			System.out.println("The deposite is possible");
			}
		}

	@Override
	public void withdraw(Account account,double amount) {
		if(account.getBalance()>amount) {
			account.setBalance(account.getBalance()-amount);
			System.out.println("The transaction is successfull");
			}
		else {
			System.out.println("The insufficient fund");
		}
	}

	}
