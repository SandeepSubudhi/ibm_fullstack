package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class StreamAssignmentTest {
	
	public static void main(String[] args) {
	//Assignment-1
		System.out.println("Assignments-1");
		TestData.getAllFruits().stream()
		.filter(f->f.getCalories()<100)
		.sorted(Comparator.comparing(Fruit::getCalories).reversed())
		.forEach(System.out::println);
	//Assignment-2
		System.out.println("Assignments-2");
		Map<String, List<Fruit>> FruitByColor=TestData.getAllFruits().stream()
				.collect(Collectors.groupingBy(Fruit::getColor));
		System.out.println(FruitByColor);
	//Assignment-3
		System.out.println("Assignments-3");
		TestData.getAllFruits().stream()
		.filter(f->f.getColor().equalsIgnoreCase("Red"))
		.sorted(Comparator.comparing(Fruit::getPrice))
		.forEach(System.out::println);
	//Assignment-4
		System.out.println("Assignments-4");
		Map<Integer,List<News>> c11;
		c11=  TestData.getAllNews().stream().collect(Collectors.groupingBy(News::getNewsId ));
		Integer maxValuesString = c11.entrySet().stream()
	            .max(Comparator.comparingInt(entry -> entry.getValue().size()))
	            .map(Map.Entry::getKey).orElse(null);
		System.out.println(maxValuesString);
	//Assignment-5
		System.out.println("Assignments-5");
		long c=TestData.getAllNews().stream()
				.filter((News n)->n.getComment().contains("budget"))
				.count();
				System.out.println(c);
	//Assignment-6
			System.out.println("Assignments-6");	
			Map<String,Long> commentByUser =TestData.getAllNews().stream()
					.collect(Collectors.groupingBy(News::getCommentByUser,counting()));
			System.out.println(commentByUser );
	//Assignments-7
			System.out.println("Assignments-7");
			TestData.getAllTransactions().stream()
			.filter(t->t.getYear()==2011)
			.sorted(Comparator.comparing(Transaction::getValue))
			.forEach(System.out::println);
	//Assignments-8
			System.out.println("Assignments-8");
			Map<Object, List<Transaction>> t1=TestData.getAllTransactions().stream()
					 .collect(Collectors.groupingBy(t->t.getTrader().getCity()));
					 System.out.println(t1.keySet());
	//Assignment-9
			System.out.println("Assignments-9");
			TestData.getAllTransactions().stream()
			.filter(f->f.getTrader().getCity().equals("Pune"))
			.sorted(Comparator.comparing(t->t.getTrader().getName()))
			.forEach(System.out::println);
	//Assignment-10
			System.out.println("Assignments-10");
			TestData.getAllTransactions().stream()
			.sorted(Comparator.comparing(t->t.getTrader().getName()))
		//	.collect(joining(","))
			.forEach(System.out::println);
			

	}

}