package com.exceptionhandling;
class InsufficientBalanceException extends Exception
{
	private String message;
	public InsufficientBalanceException() 
	{ 
		this.message= ""; 
	}
	public InsufficientBalanceException(String message) 
	{ 
		this.message= message;
	}
	public String toString() 
	{
		return "Withdraw amount must be less than account balance." + this.message;
	}
}
class Account
{
	private static int acc_bal=5500;
	public static void withdraw(int withdraw_amount) throws InsufficientBalanceException
	{
		if(acc_bal<withdraw_amount)
		{
			throw new InsufficientBalanceException();
		}
		else
		{
			System.out.println("Ammount Withdrawed");
		}
	}
}
public class CustomExceptionTest {

	public static void main(String[] args)  {
	 try {
		Account.withdraw(8000);
	} catch (InsufficientBalanceException e) {
		e.printStackTrace();
	}

	}

}
