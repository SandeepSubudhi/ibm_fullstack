package com.wrapperclasses;
class MutableTest
{
	public static void main(String args[])
	{
		String s1="ABC";
		MutableTest.check(s1);
		System.out.println("String = "+s1);
		StringBuffer s2=new StringBuffer("ABC");
		MutableTest.check1(s2);
		System.out.println("String = "+s2);
		
	}
	public static void check(String s1)
	{
	 s1=s1+"PQR";
	}
	public static void check1(StringBuffer s2)
	{
	 s2=s2.append("PQR");
	}
}