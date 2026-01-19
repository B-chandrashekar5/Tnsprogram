package com.tnsif.Demo.Day7.Banking;

public class Account {
	private int accno;
	private String name;
	private double balance;
	private Bank bank;
	public Account(int accno, String name, double balance, Bank bank) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.bank = bank;
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
	
	public void deposit(double amount) {
		bank.deposit(this, amount);
	}
	
	public void withdraw(double amount) {
		bank.withdraw(this, amount);
		
	}

	
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + ", bank=" + bank + "]";
	}
	
}