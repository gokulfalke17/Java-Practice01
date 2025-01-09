package gf.practice04_;

public class HeighestAndSecondHeighestElement {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 4, 8, 2, 6, 9, 5, 0};
		
		int max = 0;
		int second = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				second = max;
				max = arr[i];
			}else if(max<arr[i] && second > arr[i]) {
				second = arr[i];
			}
		}
		System.out.println("Heighest Element is :: "+ max);
		System.out.println("Second Heighest Element is :: "+ second);
	}
}
