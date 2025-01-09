package gf.practice02;

import java.util.function.Predicate;

public class PredicateInterface {
	
	public static void main(String[] args) {
		/*
		Predicate<Integer> pred = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return t > 10;
			}
		};
		System.out.println("Is Greter : "+ pred.test(11));
		System.out.println("Is Greter : "+ pred.test(5));
		*/
		

		/*
		Predicate<Integer> pred = (Integer t)-> t > 10;
		System.out.println("Is Greter : "+ pred.test(11));
		System.out.println("Is Greter : "+ pred.test(5));
		*/
		
		Predicate<Integer> pred = (t)-> t > 10;
		System.out.println("Is Greter : "+ pred.test(11));
		System.out.println("Is Greter : "+ pred.test(5));
		
	}
}
