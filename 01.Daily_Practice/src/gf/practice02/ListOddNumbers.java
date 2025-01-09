package gf.practice02;

import java.util.Arrays;
import java.util.List;

public class ListOddNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 5, 2, 6, 3, 4, 9, 5);
		
		System.out.println("List is : ");
		for(Integer num : list) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		System.out.println("Odd Numbers : ");
		for(Integer odd : list) {
			if(odd%2!=0) {
				System.out.print(odd+" ");
			}
		}
	}
}
