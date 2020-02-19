package com.reflection;
import java.lang.reflect.*;
class Sample
{
	private String messageTxt="Welcome";
}
class sClass
{
	public static void main(String [] args) throws Exception
	{
		//System.setSecurityManager(new SecurityManager());//Security Manager
		Class sClass=Sample.class;
		Field messageField=sClass.getDeclaredField("messageTxt");
		messageField.setAccessible(true);
		System.out.println("messageText= "+messageField.get(new Sample()));
	}
}