package gf.practice03;

import java.util.Scanner;

public class RotateArrayAtGivenPosition {
	
	public static void main(String[] args) {
		
		int arr[] = { 19, 48, 80, 10, 30, 59, 48, 78, 1, 76, 10 };

		System.out.println("Array Elements are :: ");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Position to Rotate Array :: ");
		int position = scn.nextInt();
		
		
		int j;
		for(int i=0; i<position; i++) {
			int temp = arr[0];
			for(j=0; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = temp;
		}
		
		System.out.println("After Rotating Array at Given Position :: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
	
}
