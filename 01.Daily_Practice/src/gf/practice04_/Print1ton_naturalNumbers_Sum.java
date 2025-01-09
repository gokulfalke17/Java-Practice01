package gf.practice04_;

import java.util.Scanner;

public class Print1ton_naturalNumbers_Sum {
	
	public static void print1toN(int limit) {
		System.out.println("Numbers are :: ");
		for(int i=1; i<=limit; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void printSum(int limit) {
		int sum =0;
		for(int i=1; i<=limit; i++) {
			sum = sum+i;
		}
		
		System.out.println("Sum of All Number is :: "+ sum);
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Limit :: ");
		int limit = scn.nextInt();
		print1toN(limit);
		printSum(limit);
		
	}
}
