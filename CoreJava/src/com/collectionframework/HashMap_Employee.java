package com.collectionframework;

import java.util.HashMap;
import java.util.Iterator;

class Employee
{
	private int id;
	//private String name;
	private double salary;
	public Employee(int id, double salary) {
		super();
		this.id = id;
		//this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ",salary=" + salary + "]";
	}
	public boolean equals(Object obj) {
       return true;
	}
	
//	@Override
    public int hashCode() {
        return 25;
    }
}
public class HashMap_Employee {

	public static void main(String[] args) {
		HashMap<Employee, String> map = new HashMap<>();
		map.put(new Employee(25,19980), "Suraj");
		map.put(new Employee(83,29000), "Swadhin");
		map.put(new Employee(71,36000), "Sandeep");
		
       	
		Iterator<Employee> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e);
		}
		 
	
	}
// due to the same Hashcode the at time of iterator you only get the 1st one.
}
