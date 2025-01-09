package com.org.practice_;

import java.util.Vector;

//Q. WAP to create Vector and store 5 values in it and calculate sum of all values.

public class CalculateSumOfAllElementsOfVector {

	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<Integer>();
		list.add(5);
		list.add(1);
		list.add(9);
		list.add(8);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(7);
		
		int sum = 0;
		for(Integer num : list) {
			sum = sum+num;
		}
		
		System.out.println("Sum of All Elements :: "+ sum);
	}
}
