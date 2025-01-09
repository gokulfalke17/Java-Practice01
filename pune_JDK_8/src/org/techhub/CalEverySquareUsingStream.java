package org.techhub;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalEverySquareUsingStream {
	
	public static void main(String[] args) {
		
		/*List<Integer> list =  Arrays.asList(5, 6, 3, 8, 9, 13, 16, 17, 19, 18);
		Stream<Integer> strm = list.stream();
		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
			return t*t;  
			}
		};
		Stream<Integer> s = strm.map(fun);
		List<Integer> newList = s.collect(Collectors.toList());
		Consumer<Integer> cons = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		newList.forEach(cons);*/
		
		
		/*List<Integer> list =  Arrays.asList(5, 6, 3, 8, 9, 13, 16, 17, 19, 18);
		Stream<Integer> strm = list.stream();
		Function<Integer, Integer> fun = (Integer t)->t*t;
		Stream<Integer> s = strm.map(fun);
		List<Integer> newList = s.collect(Collectors.toList());
		Consumer<Integer> cons = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		newList.forEach(cons);*/
		
		/*List<Integer> list =  Arrays.asList(5, 6, 3, 8, 9, 13, 16, 17, 19, 18);
		Function<Integer, Integer> fun = (Integer t)->t*t;
		Stream<Integer> s = list.stream().map(fun);
		List<Integer> newList = s.collect(Collectors.toList());
		Consumer<Integer> cons = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		newList.forEach(cons);*/
		
		/*List<Integer> list =  Arrays.asList(5, 6, 3, 8, 9, 13, 16, 17, 19, 18);
		Function<Integer, Integer> fun = (Integer t)->t*t;
		Stream<Integer> s = list.stream().map(fun);
		List<Integer> newList = s.collect(Collectors.toList());
		Consumer<Integer> cons = (Integer t) -> System.out.println(t);
		newList.forEach(cons);*/
		
		/*List<Integer> list =  Arrays.asList(5, 6, 3, 8, 9, 13, 16, 17, 19, 18);
		Stream<Integer> s = list.stream().map((Integer t)->t*t);
		List<Integer> newList = s.collect(Collectors.toList());
		Consumer<Integer> cons = (Integer t) -> System.out.println(t);
		newList.forEach(cons);*/
		
		
		/*Stream<Integer> s = Arrays.asList(5, 6, 3, 8, 9, 13, 16, 17, 19, 18).stream().map((Integer t)->t*t);
		List<Integer> newList = s.collect(Collectors.toList());
		Consumer<Integer> cons = (Integer t) -> System.out.println(t);
		newList.forEach(cons);*/
		
		/*List<Integer> newList = Arrays.asList(5, 6, 3, 8, 9, 13, 16, 17, 19, 18).stream().map((Integer t)->t*t).collect(Collectors.toList());
		Consumer<Integer> cons = (Integer t) -> System.out.println(t);
		newList.forEach(cons);*/
		
		/*List<Integer> newList = Arrays.asList(5, 6, 3, 8, 9, 13, 16, 17, 19, 18).stream().map((Integer t)->t*t).collect(Collectors.toList());
		newList.forEach((Integer t) -> System.out.println(t));*/
		
		Arrays.asList(5, 6, 3, 8, 9, 13, 16, 17, 19, 18).stream()
			.map((Integer t)->t*t).collect(Collectors.toList())
			.forEach((Integer t) -> System.out.println(t));
		
	}
}
