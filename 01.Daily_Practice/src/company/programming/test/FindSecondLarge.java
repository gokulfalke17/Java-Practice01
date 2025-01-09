package company.programming.test;

public class FindSecondLarge {
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,44,2,12};
		
		int largest = 0;
		int second = 0;
		for(int i=0; i<arr.length; i++) {
			if(largest < arr[i]) {
				second = largest;
				largest = arr[i];
			}else if(largest>arr[i] && second<arr[i]) {
				second = arr[i];
			}
		}
		System.out.println("Largest is :: "+ largest);
		if(second ==-1) {
			System.out.println("Second Large Not Found...");
		}else {
			System.out.println("Second Large Element is :: "+ second);
		}
	}
}
