package gf.practice02;



public class ReverseArray {

	public static void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {4, 2, 1, 7, 5, 8, 2, 0};
		
		System.out.println("Before Reverse : ");
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		reverseArray(arr);
		
		System.out.println("After Reverse : ");
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
	}
}
