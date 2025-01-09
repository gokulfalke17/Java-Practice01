package gf.pune.Practical.collection;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
	public static void main(String[] args) {
		int[] arr = new int[] { 73, 97, 81, 200, 8, 81, 73, 200, 8 };
		remove(arr);
	}

	private static void remove(int[] arr) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Your Array: " + Arrays.toString(arr));
		int len = arr.length;
		
		System.out.println("Enter the element that you want to delete: ");
		int elem = scn.nextInt();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elem) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[arr.length - 1] = '\0';
				flag = true;
				len--;
				break;
			}
		}
		
		if (!flag) {
			System.out.println("Element not found...");
		}else {
			System.out.println("After Removing Elemenet ::");
			for (int i = 0; i < len; i++) {
				System.out.print(arr[i] + "\t");
			}
		}
		
		System.out.println();

	}
}
