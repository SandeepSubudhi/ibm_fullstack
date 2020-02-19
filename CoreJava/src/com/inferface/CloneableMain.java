package com.inferface;
class Date implements Cloneable {
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
		this.day = 10;
		this.month = 4;
		this.year = 2020;
	}
	
	public Object clone() { //Shallow copy
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}






class Employee2 implements Cloneable {
	Date dob;

	public Employee2(Date dob) {
		this.dob = dob;
	}
	public Employee2() {
		
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	public Object clone() { //Deep copy
		try {
			Employee2 c= (Employee2)super.clone();
			c.setDob((Date)c.getDob().clone());
			return c;
			/*return super.clone()*/
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public String toString() {
		return "Employee2 [dob=" + dob + "]";
	}
	
}

public class CloneableMain {
	public static void main(String args[]) {
		Date dt = new Date(12, 8, 2019);
		Employee2 e = new Employee2(dt);
		Employee2 e2 = (Employee2)e.clone();
System.out.println("Shallow: " + (e.getDob()==e2.getDob()));
		
	}
}