package gf.practice02;

public class FindSecondMinAndMax {
	
	
	public static int getMax(int arr[]) {
		int max = arr[0];
		int second= 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				second = max;
				max = arr[i];
			}else if(max < arr[i] && second > arr[i]) {
				second = arr[i];
			}
		}
		return second;
	}
	
	public static int getMin(int arr[]) {
		int min = arr[0];
		int second= 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				second = min;
				min = arr[i];
			}else if(second > arr[i] && min < arr[i]) {
				second = arr[i];
			}
		}
		return second;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 3, 5, 7, 45, 21, 90, 0, 1, 4};
		int secondMin = getMin(arr);
		int secondMax = getMax(arr);
		System.out.println("Second Max is : "+ secondMax);
		System.out.println("Second Min is : "+ secondMin);
	}
}
