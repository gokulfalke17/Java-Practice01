package gf.practice03;

public class SecondHeighest {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 3, 6, 2, 5, 9, 3};
		
		int heighest = arr[0];
		int second = 0;
		for(int i=0; i<arr.length; i++) {
			if(heighest < arr[i]) {
				second = heighest;
				heighest = arr[i];
				
			}else if(heighest < arr[i] && second > arr[i]) {
				second = arr[i];
			}
		}
		
		System.out.println("Heighest is :: "+ heighest);
		System.out.println("Second Heighest is :: "+ second);       
	}
}
