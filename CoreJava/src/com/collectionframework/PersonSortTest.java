package com.collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private double weight;
	private int height_incm;
	private String name;
	public Person(double weight, int height_incm, String name) {
		super();
		this.weight = weight;
		this.height_incm = height_incm;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height_incm=" + height_incm + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person p) {
		if(this.weight>p.weight)
		{
			return -1;
		}
		else if(this.weight<p.weight)
		{
			return 1;
		}
		else
		{
			if(this.height_incm>p.height_incm)
			{
				return -1;
			}
			if(this.height_incm<p.height_incm)
			{
				return 1;
			}
			else 
			{
				return 0;
			}
		}
	}
	
	
}
public class PersonSortTest
{

	public static void main(String[] args) 
	{
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person(75.23,160,"Sandeep"));
		treeSet.add(new Person(65.03,120,"SWADHIN"));
		treeSet.add(new Person(99.36,150,"Suraj"));
		treeSet.add(new Person(75.23,190,"Sandy"));
		Iterator<Person> itr = treeSet.iterator();
		while(itr.hasNext()) 
		{
			Person P2 = itr.next();
			System.out.println(P2);
		}
	}
}
