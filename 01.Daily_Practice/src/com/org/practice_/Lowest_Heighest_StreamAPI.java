package com.org.practice_;

import java.util.Comparator;
import java.util.stream.Stream;

public class Lowest_Heighest_StreamAPI {
	
	public static void main(String[] args) {
		
		Integer heighest = Stream.of(3, 2, 1, 77, 6, 5)
							.max(Comparator.comparing(Integer::valueOf))
							.get();
		System.out.println("Heighest Element is :: "+ heighest);
		
		System.out.println("__________________________");
		System.out.println();
		
		Integer smallest = Stream.of(3, 2, 1, 77, 6, 5)
							.min(Comparator.comparing(Integer::valueOf))
							.get();
		System.out.println("Smallest Element is :: "+ smallest);
	}
}
