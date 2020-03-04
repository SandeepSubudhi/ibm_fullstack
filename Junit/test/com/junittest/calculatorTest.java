package com.junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class calculatorTest {
	calculator c1;
	@Before
	public void before() {
		c1=new calculator();
		System.out.println("inside before");
	}
	
	@Test
	public void test() {
		assertEquals("Result",5,c1.Divide(10,2));
		System.out.println("inside test");
	}
	@Ignore
	@Test
	public void test2() {
		assertEquals("Result",0,c1.Divide(10,2));
		System.out.println("inside test2");
	}
	@Test(expected=ArithmeticException.class)
	public void test1() {
		assertEquals("Result",5,c1.Divide(10,0));
		System.out.println("inside test1");
	}
	@Test
	public void divideByZero(){
		assertThrows(ArithmeticException.class, ()->c1.Divide(10,0));
	}

}
