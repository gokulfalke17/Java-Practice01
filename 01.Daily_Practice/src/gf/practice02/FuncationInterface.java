package gf.practice02;

import java.util.function.Function;

public class FuncationInterface {

	public static void main(String[] args) {
		/*
		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		};
		
		Integer result = fun.apply(5);
		System.out.println("Square is : "+ result);
		*/
		
		/*
		Function<Integer, Integer> fun = (t) -> t * t;
		
		Integer result = fun.apply(5);
		System.out.println("Square is : " + result);
		*/
		
		/*
		int result = ((Function<Integer, Integer>) (t) -> t * t).apply(5);
		
		System.out.println("Square is : " + result);
		*/
		

		System.out.println("Square is : " + ((Function<Integer, Integer>) (t) -> t * t).apply(5));
		
	}
}
