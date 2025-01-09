package company.programming.test;

import java.util.Scanner;

/*
case 1:
--------
input :: arr[7 2 12 13 17];
target 9
output ::  0, 1

case 2:
-------
input :: arr[1 2 8 3];
target 11
output ::  2, 3
  
*/

public class LeetCode01 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Array Size :: ");
		int size = scn.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array Elements :: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println("Enter Target Value :: ");
		int target = scn.nextInt();

		System.out.println();

		System.out.println("Pairs are :: ");
		int[] newArr = twoSum(arr, target);
		if (newArr != null) {
			System.out.println(newArr[0] + "  " + newArr[1]);
		}

	}

	public static int[] twoSum(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

}
