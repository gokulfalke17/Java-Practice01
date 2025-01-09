package company.programming.test;

public class MissingNumberWithSort {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 5, 6, 8, 2, 7, 3, 4, 10};
		int nums = 10; //total numbers in array
		
		int total = nums*(nums+1)/2;
				
//		System.out.println(total);
		
		int arraySum = 0;
		for(int i=0; i<arr.length; i++) {
			arraySum = arraySum+arr[i];
		}
		
//		System.out.println(arraySum);
		
		int missing = total - arraySum;
		
		System.out.println("Missing Number is :: "+ missing);
	}
}
