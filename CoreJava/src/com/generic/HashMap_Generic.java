package com.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMap_Generic {
	private static void PrintMapKeyValues(Map<? extends Number,?> hashmap) {
		Iterator<? extends Number> itr =(Iterator<? extends Number>) hashmap.keySet().iterator();
		while(itr.hasNext()) {
		Number name = (Number) itr.next();
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		Map<Integer, String> ht = new HashMap<Integer, String>();
		ht.put(12, "Anand");
		ht.put(56, "Bipin");
		ht.put(78, "Chandan");
		ht.put(69, "Dawood");
		PrintMapKeyValues(ht);
		
	}

}
