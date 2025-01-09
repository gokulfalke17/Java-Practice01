package com.org.practice_;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

//WAP to create List collection and store the 10 string values in it and filter string whose name ends with sh

public class FindSquateOfEveryElementAndDisplyUsingStreaAPI {

	public static void main(String[] args) {

//		List<Integer> list = Arrays.asList(4, 6, 8, 9, 5);
//		Stream<Integer> stream = list.stream();

		/*Stream<Integer> squareList = stream.map(new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		});
		
		squareList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});*/

		/*Stream<Integer> squareList = stream.map((Integer t)->{
				return t*t;
		});
		
		squareList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});*/

		/*	Stream<Integer> squareList = stream.map((t) -> t * t);
		
			squareList.forEach(new Consumer<Integer>() {
				@Override
				public void accept(Integer t) {
					System.out.println(t);
				}
			});*/
		
		/*Stream<Integer> squareList = stream.map((t) -> t * t);
		System.out.println("Square of Each Element :: ");
		squareList.forEach((Integer t)->System.out.println(t));*/
		/*	
			Stream<Integer> squareList = list.stream().map((t) -> t * t);
			squareList.forEach((Integer t)->System.out.println(t));*/
		
		
		/*Stream<Integer> squareList = Arrays.asList(4, 6, 8, 9, 5).stream().map((t) -> t * t);
		squareList.forEach((t)->System.out.println(t));*/
		
		System.out.println("Square of Each Element is :: ");
		Arrays.asList(4, 6, 8, 9, 5).stream().map((t) -> t * t).forEach((t)->System.out.println(t));
	}
	

}
