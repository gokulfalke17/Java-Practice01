package gf.practice03;

public class MissingNumber {
	
	private static int findMissingElement(int[] arr, int num) {
		int totalSum = num*(num+1)/2;
		int arrSum = 0;
		
		for(int array : arr) {
			arrSum = arrSum + array;
		}
		return totalSum - arrSum;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 5, 7, 4, 8, 9};
		int num = 9;
		int missing = findMissingElement(arr, num);
		System.out.println("Missing Number is :: "+ missing);
		
	}

	
}
