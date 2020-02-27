package com.collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hashset_LinkedHashSet_Test 
{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			testHashSet();
			testLinkedHashSet();
		}
	
	
	private static void testHashSet() {
		Set<String> hset = new HashSet<String>();
		hset.add("Sandeep");
		hset.add("Himanshu");
		hset.add("Dipu");
		hset.add("Suraj");
		
		Iterator<String> itr = hset.iterator();
		System.out.println("HashSet");
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}
	private static void testLinkedHashSet()
	{
	         Set<String> copy = new LinkedHashSet<String>();
	         copy.add("Sandeep");
	         copy.add("Himanshu");
	         copy.add("Dipu");
	         copy.add("Suraj");
	         Iterator<String> itr = copy.iterator();
	         System.out.println("LinkedHashSet");
	 		while(itr.hasNext()) {
	 			String name = itr.next();
	 			System.out.println(name);
	 		}
		
	}
}
