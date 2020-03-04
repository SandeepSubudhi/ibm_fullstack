package com.junittest;


import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RandomNumberTest {
	RandomNumber randomNumber;
	public RandomNumberTest(){	
	}
	@Parameterized.Parameters
	public static Collection randomNumber() {
		System.out.println("Inside randomNumber collection");
		return Arrays.asList(new Object[][] { {} , {}, {} });
	}
	@Before
	public void initialize() {
		randomNumber = new RandomNumber();
		System.out.println("Inside initialize()");
	}
	@Test
	public void testgetRandom() {
		System.out.println("Inside testIsPrime()");
		assertTrue(randomNumber.getRandom()<100);
	}

}