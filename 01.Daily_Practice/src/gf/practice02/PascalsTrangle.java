package gf.practice02;

import java.util.Scanner;

public class PascalsTrangle {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number of Rows for Pascal's Trianlge :: ");
		int rows = scn.nextInt();
		
		/*for(int i=0; i<rows; i++) {
			
			for(int j=0; j<rows-i; j++) {
				System.out.print(" ");
			}
			
			int num = 1;
			for(int j=0; j<=i; j++) {
				System.out.print(num+" ");
				num = num*(i-j) / (j+1);
			}
			System.out.println();
		}*/
		
		
		for(int i=0; i<rows; i++) {
			int num =1;
			for(int j=0;j<=i;j++) {
				if(j==0) {
					for(int k=0; k<rows-i-1; k++) {
						System.out.print(" ");
					}
				}
				System.out.print(num+" ");
				num = num*(i-j) / (j+1);
			}
			System.out.println();			
		}
		
	}
}	
