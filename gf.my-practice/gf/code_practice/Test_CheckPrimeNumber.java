package gf.code_practice;

import java.util.Scanner;

public class Test_CheckPrimeNumber {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = scn.nextInt();
		boolean flag = false;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag = true;
			}
		}
		if(!flag) {
			System.out.println(num+" Is Prime Number ");
		}else {			
			System.out.println(num+" Is Not Prime Number...");
		}
	}
}
