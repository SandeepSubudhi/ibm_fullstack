package com.junittest;

import java.util.Random;

public class RandomNumber {
	public int getRandom() {
		Random r=new Random();
		return r.nextInt(100);
	}
}