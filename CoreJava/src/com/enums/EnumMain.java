package com.enums;
enum Status
{
	NEW(5), REJECTED(9), ACCEPTED(6), COMPLETED(8);
	int value;
	Status(int value) 
	{
		//System.out.println("Inside constructor: " + value);
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String toString() {
		switch(this) {
			case NEW: return " New " + value;
			case REJECTED: return "Rejected " + value;
			case ACCEPTED: return "Accepted " + value;
			case COMPLETED: return "Completed " + value;
			default: return "Invalid";
		}
	}
};
class Order
{
	private int id,quantity;
	private String name;
	private Status status;
	public Order(String name,int id,int quantity,Status status)
	{
		this.id=id;
		this.quantity=quantity;
		this.name=name;
		this.status=status;
	}
	
public int getOrderStatus()
	{
	return status.getValue();
	}
}

public class EnumMain {

	public static void main(String[] args) {
	Order o=new Order("PUBG",123,1,Status.COMPLETED);
	System.out.println(o.getOrderStatus());
	}

}
