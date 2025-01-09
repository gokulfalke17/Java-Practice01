package gf.code_practice;

import java.util.Scanner;

public class NumberFactorial {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = scn.nextInt();
		
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial of "+ num+"-->"+ fact);

	}
}
