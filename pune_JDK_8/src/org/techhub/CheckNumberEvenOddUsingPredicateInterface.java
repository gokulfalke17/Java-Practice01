package org.techhub;

import java.util.function.Predicate;

public class CheckNumberEvenOddUsingPredicateInterface {
	
	public static void main(String[] args) {
		
		/*Predicate<Integer> pred = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		
		boolean result = pred.test(10);
		if(result) 
			System.out.println("EVEN");
		else 
			System.out.println("ODD");*/
		
		/*Predicate<Integer> pred = (Integer t)->{
				return t%2==0;
			};
		
		boolean result = pred.test(24);
		if(result)
			System.out.println("EVEN");
		else
			System.out.println("ODD");*/
		
		/*Predicate<Integer> pred = t-> t%2==0;
			boolean result = pred.test(24);
			if(result)
				System.out.println("EVEN");
			else
				System.out.println("ODD");*/
		
		/*boolean result = ((Predicate<Integer>)(t)-> t%2==0).test(24);
		if(result)
			System.out.println("EVEN");
		else
			System.out.println("ODD");*/
		
		
		/*String s = (((Predicate<Integer>)(t)-> t%2==0).test(24))?"EVEN":"ODD";
		System.out.println(s);*/
		
		System.out.println((((Predicate<Integer>)(t)-> t%2==0).test(35))?"EVEN":"ODD");
	}
}	

