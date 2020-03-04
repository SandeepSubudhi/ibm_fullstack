package com.streams;

import java.util.ArrayList;
import java.util.List;

public class streamTest {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Sandeep");
		arrayList.add("Adarsh");
		arrayList.add("Suraj");
		arrayList.add("Subudhi");
		arrayList.add("Dipu");
		arrayList.add("Sipu");
		arrayList.stream().filter((String s)->s.startsWith("S")).sorted().forEach(System.out::println);
	}

}
