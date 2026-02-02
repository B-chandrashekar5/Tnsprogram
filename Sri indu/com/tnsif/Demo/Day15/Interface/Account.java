package com.tnsif.Demo.Day15.Interface;

public class Account {
	private int accno;
	private String name;
	private double balance;
	private Bank bank;
	public Account(int accountNo, String name, double balance, Bank bank) {
		super();
		this.accno = accountNo;
		this.name = name;
		this.balance = balance;
		this.bank = bank;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accno + ", name=" + name + ", balance=" + balance + ", bank=" + bank + "]"; 
	}

	public void deposite(double amount) {
		bank.deposite(this,amount);
	}
	public void withdraw(double amount) {
		bank.withdraw(this,amount);
	}
	}


