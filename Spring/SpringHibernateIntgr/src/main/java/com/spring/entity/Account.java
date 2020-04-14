package com.spring.entity;

public class Account {

	private int id;
	private String accname;
	private double balance;
	
	public Account() {
		
	}	
	public Account(int id, String accname, double balance) {
		super();
		this.id = id;
		this.accname = accname;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return id + " - " + accname + " - " + balance ;
	}
}

