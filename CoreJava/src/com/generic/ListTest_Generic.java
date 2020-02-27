package com.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListTest_Generic {
	private static void PrintNumber(List<? extends Number> arrayList) {
		Iterator<? extends Number> itr = (Iterator<? extends Number>) arrayList.iterator();
		while(itr.hasNext()) {
	    	Number	 n = itr.next();
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		List<Integer> arrayListint = new ArrayList<Integer>();
		arrayListint.add(132);
		arrayListint.add(654);
		arrayListint.add(789);
		PrintNumber(arrayListint);
		
	}

}
