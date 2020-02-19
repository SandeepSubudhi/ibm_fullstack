package com.exceptionhandling;
 class MyAutoCloseable implements AutoCloseable
 {
	@Override
	public void close() throws Exception
	{
		System.out.println("MyAutoClosable closed!");
	}
}
public class AutoCloseableTest {

	public static void main(String[] args) throws Exception {
		int x=10;
		int y=2;
		try(MyAutoCloseable c=new MyAutoCloseable()){
			int division = x / y;
			}
			catch(ArithmeticException e) 
			{
			e.printStackTrace();
			}

	}

}
