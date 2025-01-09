package com.org.practice_;

import java.util.Comparator;
import java.util.stream.Stream;

/*Find Min & Max in Using Stream...*/

public class FindMaxMinInStreamAPI {
	
	public static void main(String[] args) {
		
		Integer max = Stream.of(1, 1, 2, 5, 3, 63, 13, 54, 87, 8)
				.max(Comparator.comparing(Integer::valueOf))
				.get();
		
		Integer min = Stream.of(1, 1, 2, 5, 3, 63, 13, 54, 87, 8)
				.min(Comparator.comparing(Integer::valueOf))
				.get();
		
		System.out.println("Max is : "+ max);
		System.out.println("Min is : "+ min);
	}
}
