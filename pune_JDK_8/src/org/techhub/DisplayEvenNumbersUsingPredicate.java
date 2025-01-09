package org.techhub;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DisplayEvenNumbersUsingPredicate {
	
	public static void main(String[] args) {
		
		//List<Integer> list = Arrays.asList(5, 7, 2, 9, 6, 7, 9, 2, 16, 15, 12);
		/*Predicate<Integer> pred = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		Consumer<Integer> cons = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				if(pred.test(t))
					System.out.print(t+" ");
			}
		};
		list.forEach(cons);*/
		
		/*Predicate<Integer> pred = (t)-> t%2==0;
		Consumer<Integer> cons = (t)->{if(pred.test(t))
					System.out.print(t+" ");
			};
		list.forEach(cons);*/
		
		/*Predicate<Integer> pred = (t)-> t%2==0;
		list.forEach((Integer t)->{
			if(pred.test(t))
					System.out.print(t+" ");
			});*/
		
		/*list.forEach((t)->{
			if(((Predicate<Integer>)(t1)-> t%2==0).test(t))
					System.out.print(t+" ");
			});*/
		System.out.println("Even Integer Elements are : ");
		Arrays.asList(5, 7, 2, 9, 6, 7, 9, 2, 16, 15, 12).forEach((t)->System.out.print((((Predicate<Integer>)(t1)-> t%2==0).test(t))? "\n"+t :""));
	}
}


/*
 * 
 * hiding unneccessary details proving only neccessary details for end user is called abstraction....
 * */
