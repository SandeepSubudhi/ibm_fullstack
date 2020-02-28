package com.lambdaexpression;
import java.util.function.*;
public class Arithmatic_Lambda  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	BiFunction<Integer,Integer,Integer> add=( x , y) -> x+y ;
	System.out.println("Result of Addition="+add.apply(2,3));
	BiFunction<Integer,Integer,Integer> sub=( x , y) -> x-y ;
	System.out.println("Result of Substraction="+sub.apply(8,3));
	BiFunction<Integer,Integer,Integer> mult=( x , y) -> x*y ;
	System.out.println("Result of Multiplication="+mult.apply(8,3));
	BiFunction<Integer,Integer,Integer> div=( x , y) -> x/y ;
	System.out.println("Result of Division="+div.apply(9,3));
	}
}
