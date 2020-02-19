package com.abstractclass;
abstract class DessertItem
{
	abstract int getCost(int n);
}
class Candy extends DessertItem
{
	private int tcost;
	
	public int getCost(int n)
	{
	 tcost=n*60;
	 return tcost;
	}
}
class Cookie extends DessertItem
{
	private int tcost;
	public int getCost(int n1)
	{
	 tcost=n1*70;
	 return tcost;
	}
}
class IceCream extends DessertItem
{
	private int tcost;
	public int getCost(int n2)
	{
	 tcost=n2*1;
	 return tcost;
	}
}

class DessertItemTest
{

public static double totalCost(DessertItem d[])
	{
		int totcost=0;
		for(int i=0;i<d.length;i++)
		{
			totcost=totcost+d[i].getCost(5);
		}
		return totcost;
	}
    public static void main(String args[])
	{
	DessertItem d[]=new DessertItem[3];
	d[0]= new Candy();
	d[1]= new Cookie();
	d[2]= new IceCream();
	System.out.println("Total Cost:- " +totalCost(d));
	}
}

