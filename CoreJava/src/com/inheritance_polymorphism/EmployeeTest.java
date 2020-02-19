package com.inheritance_polymorphism;
class Employee{
	 private int id;
	 private String name;
	 private double salary;
	 public Employee(int id,String name,double salary)
	 {
		this.id=id;
		this.name=name;
		this.salary=salary;
	 }
	 public double getSalary()
	 {
		return this.salary;
	 }
	 public String toString()
	 {
		 return this.id + "-" + this.name + "-" + this.salary ;
	 } 
}
class Manager extends Employee{
	private double incentive; 
	public Manager(int id,String name,double salary,double incentive)
	 {
		super(id,name,salary);
		this.incentive=incentive;
	 }
	public double getSalary()
	 {
		return super.getSalary()+this.incentive;
	 }
	 public String toString()
	 {
		 return super.toString()+ "-" + this.incentive ;
	 } 
	
}
class Labour extends Employee{
	private double overtime; 
	public Labour(int id,String name,double salary,double overtime)
	 {
		super(id,name,salary);
		this.overtime=overtime;
	 }
	public double getSalary()
	 {
		return super.getSalary()+this.overtime;
	 }
	 public String toString()
	 {
		 return super.toString()+ "-" + this.overtime ;
	 } 
	
}

class EmployeeTest{
	public static double totalSalary(Employee em[])
	{
		double totlsal=0.0;
		for(int i=0;i<em.length;i++)
		{
			totlsal=totlsal+em[i].getSalary();
		}
		return totlsal;
	}
    public static void main(String args[])
	{
		Employee emp[]=new Employee[4];
		emp[0]=new Manager(1,"ABC",10000,2000);
		emp[1]=new Manager(2,"IBM",23000,7000);
		emp[2]=new Labour(3,"TTEC",8000,800);
		emp[3]=new Labour(1,"ABC",9000,3000);
		System.out.println(totalSalary(emp));
		System.out.println(emp[1]);
	}
}