package org.techhub;

import java.util.function.Function;

public class DivideBy2AndMultiply5UsingAndThen {
	
	public static void main(String[] args) {
		
		/*Function<Integer, Integer> fun = new Function<Integer, Integer>() {	
			@Override
			public Integer apply(Integer t) {
				return t/2;
			}
		};
		Function<Integer, Integer> fun2 = fun.andThen(t->t*5);
		int res = fun2.apply(10);
		System.out.println(res);*/
		
		/*Function<Integer, Integer> fun = (Integer t)->t/2;
		Function<Integer, Integer> fun2 = fun.andThen(t->t*5);
		int res = fun2.apply(10);
		System.out.println(res);*/
		
		/*Function<Integer, Integer> fun2 = ((Function<Integer, Integer>)(Integer t)->t/2).andThen(t->t*5);
		int res = fun2.apply(10);
		System.out.println(res);*/
		
		/*int res = ((Function<Integer, Integer>)(Integer t)->t/2).andThen(t->t*5).apply(10);
		System.out.println(res);*/
		
		System.out.println("Result is : "+((Function<Integer, Integer>)(t)->t/2).andThen(t->t*5).apply(10)); 
	}
}
