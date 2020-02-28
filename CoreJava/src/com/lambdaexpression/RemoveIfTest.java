package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
public class RemoveIfTest {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Sandeep");
		arrayList.add("Adarsh");
		arrayList.add("Suraj");
		arrayList.add("Dipu");
		arrayList.removeIf(n->n.length()%2!=0);
		System.out.println(arrayList);
	}

}
