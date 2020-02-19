package com.exceptionhandling;

public class ExceptionTest {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try {
			int division = x / y;
			}
			/*catch(ArithmeticException e) {
			e.printStackTrace();
			}*/
		finally
		{
			System.out.println("Done");
		}
	}

}
