package org.techhub;

import java.util.function.Function;

public class InputNumberDisplayIsCube {
	
	public static void main(String[] args) {
		
		/*Function<Integer, Integer> fun = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t*t*t;
			}
		};
		int res = fun.apply(5);
		System.out.println(res);*/
		
		/*Function<Integer, Integer> fun = (Integer t)-> t*t*t;
		int res = fun.apply(5);
		System.out.println(res);*/
		
		/*int res = ((Function<Integer, Integer>)(Integer t)-> t*t*t).apply(5);
		System.out.println(res);*/
		
		System.out.println(((Function<Integer, Integer>)(t)-> t*t*t).apply(5)); 
	}
}	
