package com.org.practice_;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

//WAP to create List collection and store 10 integer values in it and display it using stream API

public class DisplayListUsingStreamAPI {
	
	public static void main(String[] args) {
		/*List<Integer> list = Arrays.asList(14, 52, 21, 11, 33, 59, 22);
		System.out.println("List is :: ");
		Stream<Integer> stream = list.stream();*/
		/*stream.forEach(new Consumer<Integer>() {
		
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});*/
		
		/*stream.forEach((t)-> System.out.println(t));*/
		
		/*list.stream().forEach((t)-> System.out.println(t));*/
		
		System.out.println("List is :: ");
		Arrays.asList(14, 52, 21, 11, 33, 59, 22).stream().forEach((t)-> System.out.println(t));
	}
}
