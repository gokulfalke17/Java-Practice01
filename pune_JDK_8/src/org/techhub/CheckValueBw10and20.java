package org.techhub;

import java.util.function.Predicate;

public class CheckValueBw10and20 {
	
	public static void main(String[] args) {
		
		/*Predicate<Integer> pred1 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t>10;
			}
		};
		Predicate<Integer> pred2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t<20;
			}
		};
		Predicate<Integer> pred3 = pred1.and(pred2);
		boolean result = pred3.test(11);
		if(result)
			System.out.println("Condition True");
		else 
			System.out.println("Condition False");*/
		
		
		/*Predicate<Integer> pred1 = (Integer t)->{
				return t>10;
			};
		Predicate<Integer> pred2 = (Integer t)->{
				return t<20;
			};
		Predicate<Integer> pred3 = pred1.and(pred2);
		boolean result = pred3.test(11);
		if(result)
			System.out.println("Condition True");
		else 
			System.out.println("Condition False");*/
		
		/*Predicate<Integer> pred1 = (Integer t)->t>10;
		Predicate<Integer> pred2 = (Integer t)->t<20;
		
		Predicate<Integer> pred3 = pred1.and(pred2);
		boolean result = pred3.test(11);
		if(result)
			System.out.println("Condition True");
		else 
			System.out.println("Condition False");*/
		
		
		/*Predicate<Integer> pred3 = ((Predicate<Integer>)(t)->t>10).and((Predicate<Integer>)(t)->t<20); 
		boolean result = pred3.test(11);
		if(result)
			System.out.println("Condition True");
		else 
			System.out.println("Condition False");*/
		
		
		/*boolean result = ((Predicate<Integer>)(t)->t>10).and((Predicate<Integer>)(t)->t<20).test(11);
		if(result)
			System.out.println("Condition True");
		else 
			System.out.println("Condition False");*/
		
		/*if(((Predicate<Integer>)(t)->t>10).and((Predicate<Integer>)(t)->t<20).test(11))
			System.out.println("Condition True");
		else 
			System.out.println("Condition False");*/
		
		
		/*String s = (((Predicate<Integer>)(t)->t>10).and((Predicate<Integer>)(t)->t<20).test(11)?"Condition True":"Condition False");
		System.out.println(s);*/
		
		
		
		System.out.println((((Predicate<Integer>)(t)->t>10).and((Predicate<Integer>)(t)->t<20).test(11)?"Condition True":"Condition False"));
	}
}
