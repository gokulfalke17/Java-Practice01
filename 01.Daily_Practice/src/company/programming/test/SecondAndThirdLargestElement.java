package company.programming.test;

public class SecondAndThirdLargestElement {

	public static void main(String[] args) {

		int arr[] = { 1, 6, 4, 7, 8, 2, 7, 5, 1, 7 };

		int first = 0;
		int second = 0;
		int third = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else if (first < arr[i] && second > arr[i]) {
				third = second;
				second = arr[i];
			} else if (second < arr[i] && third > arr[i]) {
				third = arr[i];
			}
		}
		System.out.println("First Largest is :: " + first);
		System.out.println("Second Largest is :: " + second);
		System.out.println("Third Largest is :: " + third);
	}
}
