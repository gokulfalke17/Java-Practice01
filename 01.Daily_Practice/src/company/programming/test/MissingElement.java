package company.programming.test;

public class MissingElement {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 6};
		
		int nums = 10;
		
		int total = nums*(nums+1)/2;
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
	
		int missing = total-sum;
		System.out.println(missing);
	}
}
