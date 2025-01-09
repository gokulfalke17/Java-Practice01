package gf.code_practice;

import java.util.ArrayList;
import java.util.List;

public class Test_SumOfOddNumbers {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(8);
		list.add(12);
		list.add(4);
		System.out.println("List is :");
		System.out.println(list);
		int sum = 0;

		// sum of Odd numbers
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 != 0) {
				sum = sum + list.get(i);
				System.out.println(list.get(i));
			}
		}
		System.out.println("Sum of Odd Elements :" + sum);
	}
}
