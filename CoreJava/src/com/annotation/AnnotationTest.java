package com.annotation;
import java.lang.annotation.*;
class AnnotationDefault
{
	private String name="SANDEEP";
	private int marks=96;
	@Override
	public String toString()
	{
		return "Name:-"+name+"\tMarks:-"+marks;
	}
	@Deprecated
	public void warName()
	{
		System.out.println("Deprecated");
	}
}
class AnnotationTest
{
	@SuppressWarnings({"deprecation"})
	public static void main(String args[])
	{
		AnnotationDefault a= new AnnotationDefault();
		System.out.println(a);
		a.warName();
	}
}