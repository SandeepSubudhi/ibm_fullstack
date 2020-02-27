package com.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_ListIterator {

	public static void main(String[] args) {
		testArrayList();

	}

	private static void testArrayList() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Sandeep");
		arrayList.add("Adarsh");
		arrayList.add("Suraj");
		for(int i=arrayList.size();i>0;i--) 
		{
			ListIterator<String> itr = arrayList.listIterator(i-1);
				String name = itr.next();
				System.out.println(name);
		}
		
	}
}
