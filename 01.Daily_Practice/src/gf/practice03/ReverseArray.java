package gf.practice03;

public class ReverseArray {
	
	public static void reverseArray(int[] arr) {
		int end = arr.length-1;
		int start = 0;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		System.out.println("Reverse Array is ::" );
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 4, 7, 6, 4, 9, 3};
		
		System.out.println("Array is :: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		reverseArray(arr);
	}

}
