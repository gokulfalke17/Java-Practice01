package gf.practice01;

import java.util.Scanner;

public class print1toNPrimeNumberAndSum {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Limit : ");
		int sum = 0;
		int limit = scn.nextInt();
		
		for(int i=0; i<=limit; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==2) {
				System.out.println(i);
				sum = sum+i;
			}
		}
		System.out.println("Sum of All Prime Numbers is : "+ sum);
		
	}
}



