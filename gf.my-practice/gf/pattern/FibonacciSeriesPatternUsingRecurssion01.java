package gf.pattern;

import java.util.Scanner;

public class FibonacciSeriesPatternUsingRecurssion01 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Limit :: ");
		int limit = scn.nextInt();
		System.out.println();
		for (int i = 0; i <= limit; i++) {
			int result = fiboPattern(i);
			System.out.print(result);
			for(int j=0; j<result; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static int fiboPattern(int num) {
		if (num <= 1) {
			return num;
		}
		
		return fiboPattern(num-1)+fiboPattern(num-2);
	}
	
}
