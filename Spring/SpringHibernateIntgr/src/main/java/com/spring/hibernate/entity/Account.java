package com.spring.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account {

	@GeneratedValue
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NAME")
	private String accname;
	
	@Column(name = "BAL")
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
