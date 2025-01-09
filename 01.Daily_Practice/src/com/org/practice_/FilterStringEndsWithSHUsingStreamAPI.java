package com.org.practice_;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

//WAP to create List collection and store the 10 string values in it and filter string whose name ends with sh

public class FilterStringEndsWithSHUsingStreamAPI {

	public static void main(String[] args) {

		/*	List<String> list = Arrays.asList("ram", "ramesh", "sanket", "yash", "karan", "avishkar", "akash", "umesh",
					"gokul", "suresh", "rajesh", "ganesh");
			System.out.println("Ends With SH String are :: ");
			Stream<String> stream = list.stream();*/

		/*Stream<String> filter = stream.filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.endsWith("sh");
			}
		});
		
		filter.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});*/

		/*Stream<String> filter = stream.filter((String t) -> t.endsWith("sh"));
		
		
		filter.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});*/

		/*Stream<String> filter = stream.filter((t) -> t.endsWith("sh"));
		
		filter.forEach((t)->System.out.println(t));*/
		
		/*
		stream.filter((t) -> t.endsWith("sh")).forEach((t) -> System.out.println(t));
		*/
		
		/*		list.stream().filter((t) -> t.endsWith("sh")).forEach((t) -> System.out.println(t));
		*/
		System.out.println("Ends with SH :: ");
		Arrays.asList("ram", "ramesh", "sanket", "yash", "karan", "avishkar", "akash", "umesh", "gokul", "suresh", "rajesh", "ganesh").stream().filter((t) -> t.endsWith("sh")).forEach((t) -> System.out.println(t));
		
	}
}
