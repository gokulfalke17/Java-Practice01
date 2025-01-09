package com.org.practice_;

/*
Q. WAP to create Vector and store 5 values in it and find the min and max value from Vector with using Collections class and without
using Collections class method?
*/

import java.util.Vector;

public class FindMinMaxInVector {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();
		list.add(5);
		list.add(8);
		list.add(0);
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(2);

		int min = list.get(0);
		int max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}

		System.out.println("Min :: " + min);
		System.out.println("Max :: " + max);
	}
}
