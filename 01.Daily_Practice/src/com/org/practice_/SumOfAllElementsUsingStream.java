package com.org.practice_;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

//WAP to create List collection and store 10 values in it and find the sum of all values using Stream API

public class SumOfAllElementsUsingStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4, 6, 2, 8, 9, 1, 0, 3, 5, 7);
		
		Stream<Integer> stream = list.stream();
		int sum = stream.mapToInt(Integer::intValue)
		.sum();
		
		System.out.println("Sum of All Elements is :: "+ sum);
	}
}
