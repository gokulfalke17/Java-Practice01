package gf.pune.Practical.JDK_8.LE;

//12. Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface SumAndMultiply {
	void displaySumAndMultipliction(List<Integer> list);
}
public class task12_SumAndMultiplicationOfList {
	static int sum = 0;
	static int mul = 1;
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 1, 6, 3, 6, 2));
		System.out.println("List is : "+ list);
		
		/*SumAndMultiply sm = new SumAndMultiply() {
			@Override
			public void displaySumAndMultipliction(List<Integer> list) {
				for(int i = 0; i<list.size(); i++) {
					sum = sum+list.get(i);
					mul = mul*list.get(i);
				}
				System.out.println("Addition : "		+sum);
				System.out.println("Multiplication : "	+ mul);
			}
		}; 
		sm.displaySumAndMultipliction(list);*/
		
		/*SumAndMultiply sm = (lst)->{ 
				for(int i = 0; i<list.size(); i++) {
					sum = sum+list.get(i);
					mul = mul*list.get(i);
				}
		};
		sm.displaySumAndMultipliction(list);
		System.out.println("Addition : "		+sum);
		System.out.println("Multiplication : "	+ mul);*/
		
		SumAndMultiply sm = lst -> { for(int num : lst){ sum = sum+num; mul = mul*num; } };
		sm.displaySumAndMultipliction(list);
		System.out.println("Addition : " + sum);
		System.out.println("Multiplication : " + mul);
	}
}
