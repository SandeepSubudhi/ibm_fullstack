package com.inheritance_polymorphism;
class Account{
	private int accid;
	private String accname;
	private double bal;
	public Account(int accid,String accname,double bal)
	 {
		this.accid=accid;
		this.accname=accname;
		this.bal=bal;
	 }
	public double getBal()
	 {
		return this.bal;
	 }
	public String toString()
	 {
		 return "Account no.- "+this.accid + "\nAccount Holder Name:-" + this.accname + "\n Account Balance:-" + this.bal;
	 } 
}
class SavingAccount extends Account{
	private double fd; 
	public SavingAccount(int accid,String accname,double bal,double fd)
	 {
		super(accid,accname,bal);
		this.fd=fd;
	 }
	public double getBal()
	 {
		return super.getBal()+this.fd;
	 }
	 public String toString()
	 {
		 return super.toString()+ "\nFixed Deposit:-" + this.fd;
	 } 
	
}

class CurrentAccount extends Account{
	private double cc; 
	public CurrentAccount(int accid,String accname,double bal,double cc)
	 {
		super(accid,accname,bal);
		this.cc=cc;
	 }
	public double getBal()
	 {
		return super.getBal()+this.cc;
	 }
	 public String toString()
	 {
		 return super.toString()+ "\n Cash Credits:-" + this.cc;
	 }	  
}
class AccountTest{
	public static double totalBal(Account acc[])
	{
		double tb=0.0;
		for(int i=0;i<acc.length;i++)
		{
			tb=tb+acc[i].getBal();
		}
		return tb;
	}
    public static void main(String args[])
	{
		Account acc[]=new Account[4];
		acc[0]=new SavingAccount(1,"ABC",10000,2000);
		acc[1]=new SavingAccount(2,"IBM",23000,7000);
		acc[2]=new CurrentAccount(3,"TTEC",8000,800);
		acc[3]=new CurrentAccount(8,"ABC",9000,3000);
		System.out.println("Total Cash in BANK:- " +totalBal(acc));
		System.out.println(acc[1]);
	}
}