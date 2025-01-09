package org.techhub;

import java.util.function.Function;

public class DivideBy5AndMultiply10UsingCompose {
	
	public static void main(String[] args) {
		
		/*Function<Integer, Integer> fun = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t/5;
			}
		};
		Function<Integer, Integer> fun2 = fun.compose(t->t*10);
		int result = fun2.apply(5);
		System.out.println("Result is : "+result);*/
		
		/*Function<Integer, Integer> fun = (Integer t)-> t/5;
		Function<Integer, Integer> fun2 = fun.compose(t->t*10);
		int result = fun2.apply(5);
		System.out.println("Result is : "+result);*/
		
		/*Function<Integer, Integer> fun2 = ((Function<Integer, Integer>)(t)-> t/5).compose(t->t*10);
		int result = fun2.apply(5);
		System.out.println("Result is : "+result);*/
		
		/*int result = (((Function<Integer, Integer>)(t)-> t/5)).compose((Function<Integer, Integer>)t->t*10).apply(5);
		System.out.println("Result is : "+result);*/
		
		System.out.println("Result is : "+(((Function<Integer, Integer>)(t)-> t/5)).compose((Function<Integer, Integer>)t->t*10).apply(5));
		
		
	}
}
