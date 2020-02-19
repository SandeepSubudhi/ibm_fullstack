package com.inferface;
interface Sortable
{
	boolean comp(Sortable s);
}
class Employee1 implements Sortable
{
	public String name;
	Employee1(String name)
	{
		this.name=name;
	}
	public boolean comp(Sortable s)
	{
		if((this.name.compareTo(((Employee1)s).name))>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return this.name;
	}
}
class Circle1 implements Sortable
{
	public int radius;
	public Circle1(int radius)
	{
		this.radius=radius;
	}
	public boolean comp(Sortable s)
	{
		if(this.radius>(((Circle1)s).radius))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return this.radius+"";
	}
}
class SortMain
{
		public static void sortAll(Sortable arr[])
		{
			int n = arr.length; 
			for (int i = 0; i < n-1; i++) 
			{	for (int j = 0; j < n-i-1; j++)
				{					
					if (arr[j].comp(arr[j+1])) 
					{	 
						Sortable temp = arr[j]; 
						arr[j] = arr[j+1]; 
						arr[j+1] = temp; 
					}
				}   
			}
		}
		public static void main(String args[])
		{
			Sortable s[]=new Sortable[4];
			Sortable s1[]=new Sortable[4];
			s[0] =new Employee1("Sandeep");
			s[1] =new Employee1("kalpanta");
			s[2] =new Employee1("Dipu");
			s[3]=new Employee1("Sourav");
			s1[0]=new Circle1(11);
			s1[1]= new  Circle1(10);
			s1[2]=new Circle1(5);
			s1[3]=new Circle1(1);
			SortMain.sortAll(s);
			SortMain.sortAll(s1);
			for (int i = 0; i < s.length; i++)
			{
					System.out.println(s[i]);
			}
			for (int i = 0; i < s.length; i++)
			{
					System.out.println(s1[i]);
			}
		}
}