package gf.pune.Practical.JDK_8.StreamAPI;

//1.  Write a Java program to calculate the average of a list of integers using streams.

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class task01_CalculateAverageOfList {
	
	static double sum = 0;
	public static void main(String[] args) {
		
		//List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 9);
		
		
	/*	
		int sum = 0;
		int avg = 1;
		for(Integer i : list) {
			sum = sum+i;
			
		}
		
		avg = sum/list.size();
		System.out.println("sum :: "+ sum);
		System.out.println("avg :: "+ avg);
		
		*/
		
		
		
		/*Stream<Integer> stream = list.stream();
		Consumer<Integer> cons = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				count++;
				sum = sum+t;
			} 
		};
		stream.forEach(cons);
		System.out.println("Average is :: "+ sum/count);*/
		
		
		
		/*Stream<Integer> stream = list.stream();
		Consumer<Integer> cons = (Integer t)->sum = sum+t;
		stream.forEach(cons);
		System.out.println("Average is :: "+ sum/list.size());*/
		
		
		
		/*Stream<Integer> stream = list.stream();
		stream.forEach((Integer t)->sum = sum+t);
		System.out.println("Average is :: "+ sum/list.size());*/
		
		
		
		/*list.stream().forEach((Integer t)->sum = sum+t);
		System.out.println("Average is :: "+ sum/list.size());*/
		
		/*
		Arrays.asList(4, 5, 6, 7, 8, 9).stream().forEach((Integer t)->sum = sum+t);
		System.out.println("Average is :: "+ sum/Arrays.asList(4, 5, 6, 7, 8, 9).size());
		*/
		

		Arrays.asList(4, 5, 6, 7, 8, 9)
			.stream().forEach((Integer t)->sum = sum+t);
		System.out.println("Average is :: \n"+ sum/Arrays.asList(4, 5, 6, 7, 8, 9).size());
		
		
	}
}
