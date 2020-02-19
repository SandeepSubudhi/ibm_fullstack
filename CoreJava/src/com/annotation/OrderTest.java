package com.annotation;
import java.lang.annotation.*;
import java.lang.reflect.*; 
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface Getter
{
	int price=50;
}
class Order
{
	private int price=10;
	//private int quantity;
	@Getter
	public int getPrice()
	{
		return this.price;
	}
	@Getter
	public int totalPrice()
	{
		//int tp=0;
		//tp=price*quantity;
		return 5;
	}
}
class OrderTest
{
	public static void main(String args[])throws Exception
	{
		
		Class c=Class.forName("Order");
		//Class c=AnnotationTestMain.class;
		Method m[]=c.getDeclaredMethods();
		String s="";
		int flag=0,flag1=0;
		for(Method allMethods:m)
		{
			 if (allMethods.isAnnotationPresent(Getter.class)) 
			 {
				 s=allMethods.getName();
				 if(s.startsWith("get"))
				 {
					 String s1=s.substring(3);
					 if(!Character.isUpperCase(s1.charAt(0)))
					 {
						 flag1=1;
						 System.out.println(s+" is not a getterMethod");
					 }
					 else
					 {
						s1=s1.toLowerCase();
						Field[] fields = c.getDeclaredFields();
						for(Field field:fields)
						{
							if(field.getName().equals(s1))
							{
								flag=1;
								break;
							}
						}
							if(flag==0)
							{	flag1=1;
								System.out.println(s+" is not a getterMethod");
							}
						
						
						}
				 }
						else
						{    
							flag1=1;
							System.out.println(s+" is not a getterMethod");
						}
					 
					
				 
				}
		}
				if(flag1==0)
				{
					System.out.println("Everything is fine");
				}
			 
			 
		}
	}

	


