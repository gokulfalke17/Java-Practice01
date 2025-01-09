package gf.pune.Practical.JDK_8.LE;

//4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface FilterEvenOdd {
	void filterEvenOddIntegers(List<Integer> list);
}

public class task04_FilterOutEvenOddNumbers {
	
	public static void main(String[] args) {
		
		
		/*FilterEvenOdd evenOdd = new FilterEvenOdd() {
			@Override
			public void filterEvenOddIntegers(List<Integer> list) {
				for(Integer num : list) {
					if(num%2==0)
						System.out.print(num+" ");
				}
				
				System.out.println();
				for(Integer num : list) {
					if(num%2!=0) 
						System.out.print(num+" ");
				}
			}
		};*/
		
		FilterEvenOdd evenOdd = (list)->{ 
				for(Integer num : list) {
					if(num%2==0)
						System.out.print(num+" ");
				}
				
				System.out.println();
				for(Integer num : list) {
					if(num%2!=0) 
						System.out.print(num+" ");
				}
			};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 3, 2, 5, 7, 15, 19, 17, 14, 20, 25, 29, 30, 24, 28, 50));
		evenOdd.filterEvenOddIntegers(list);
	}
}
