package com.lambdaexpression;

import java.util.ArrayList;
import java.util.function.Consumer;
public class StringBuilderConsumer {

	static StringBuilder s=new StringBuilder("");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Sandep");
		ar.add("Dipu");
		Consumer<String> consumer=(String s1)->s.append(s1.charAt(0));
		check(ar,consumer);
		System.out.println(s);
	}
	
	public static void check(ArrayList<String> ar,Consumer c) {
		for(String a:ar) {
			c.accept(a);
		}
	}

}





