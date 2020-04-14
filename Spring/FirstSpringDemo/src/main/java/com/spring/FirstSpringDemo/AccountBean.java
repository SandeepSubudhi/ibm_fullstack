package com.spring.FirstSpringDemo;

public class AccountBean {
 private int id;
 private String name;
 private double bal;
public AccountBean(int id, String name, double bal) {
	super();
	this.id = id;
	this.name = name;
	this.bal = bal;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
 
 
}
