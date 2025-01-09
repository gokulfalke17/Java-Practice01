package gf.practice02;

public class SecondThirdHeighestUsingOneForLoop {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 4, 7, 5, 3, 4, 2, 7, 6, 5, 9};
		
		
		int heighest = arr[0];
		int second = 0;
		int third = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> heighest) {
				third = second;
				second = heighest;
				heighest = arr[i];
			}else if(heighest > arr[i] && second < arr[i]) {
				third = second;
				second = arr[i];
			}else if(second > arr[i] && third < arr[i]) {
				third = arr[i];
			}
		}
		
		System.out.println("Heighest : "+ heighest);
		System.out.println("Second : "+ second);
		System.out.println("Third : "+ third);
	}
}
