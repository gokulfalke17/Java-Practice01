package gf.practice03;

import java.util.HashSet;
import java.util.Set;

interface ArrayOperations {
	void acceptArray(int arr[], int brr[]);

	int[] getResult();
}

class MargeTwoArray implements ArrayOperations {

	int arr[];
	int brr[];

	@Override
	public void acceptArray(int[] arr, int[] brr) {
		this.arr = arr;
		this.brr = brr;
	}

	@Override
	public int[] getResult() {

		int crr[] = new int[arr.length + brr.length];

		for (int i = 0; i < crr.length; i++) {
			if (i < crr.length / 2) {
				crr[i] = arr[i];
			} else {
				crr[i] = brr[i - 5];
			}
		}

		return crr;
	}

}

class UnionOfArray implements ArrayOperations {

	int arr[];
	int brr[];

	@Override
	public void acceptArray(int[] arr, int[] brr) {
		this.arr = arr;
		this.brr = brr;
	}

	@Override
	public int[] getResult() {
		Set<Integer> set = new HashSet<Integer>();
		for (int value : arr) {
			set.add(value);
		}
		for (int value : brr) {
			set.add(value);
		}
		int[] unionArray = new int[set.size()];
		int index = 0;
		for (int value : set) {
			unionArray[index++] = value;
		}
		return unionArray;
	}

}

public class DynamicPolymorphism_ArrayOperations {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int brr[] = { 4, 5, 6, 7, 8 };

		ArrayOperations margeOpearions = new MargeTwoArray();
		margeOpearions.acceptArray(arr, brr);
		int[] crr = margeOpearions.getResult();

		System.out.println("Marge Array is :: ");
		for (int i = 0; i < crr.length; i++) {
			System.out.print(crr[i] + " ");
		}
		System.out.println("\n");

		ArrayOperations unionOperation = new UnionOfArray();
		unionOperation.acceptArray(arr, brr);
		int[] unionArray = unionOperation.getResult();

		System.out.println("Union Array is :: ");
		for (int i = 0; i < unionArray.length; i++) {
			System.out.print(unionArray[i] + " ");
		}
		System.out.println();

	}
}
