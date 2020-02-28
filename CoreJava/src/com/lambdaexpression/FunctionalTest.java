package com.lambdaexpression;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class FunctionalTest {

	public static void main(String[] args) {
		Predicate<Integer> oddnumber=(n)->!(n%2==0);
		System.out.println("Number is Odd "+oddnumber.test(5));
		Consumer<Integer> elements=(x)->System.out.println(x+"\t");
		int arr[]= {12,32,45,65,78,98};
		for(int i=0;i<arr.length;i++)
		{
			elements.accept(arr[i]);
		}
		Random random = new Random();
		Supplier<Integer> mark=()->random.nextInt(100);
		int m=mark.get();
		if(m>40)
			System.out.println("PASS");
		else
			System.out.println("Fail");
		Function<Integer,String>result=(mark1)->mark1>33 ? "Pass":"Fail";
		System.out.println("Result = " + result.apply(34));
		System.out.println("Result = " + result.apply(22));
	}

}
