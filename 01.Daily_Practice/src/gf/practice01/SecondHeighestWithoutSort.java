package gf.practice01;

public class SecondHeighestWithoutSort {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 2, 3, 3, 5, 4, 3, 5, 3, 1, 2, 6};
		
		System.out.println("Array Elements are : ");
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int heighest = arr[0];
		int second = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(heighest < arr[i]) {
				second = heighest;
				heighest = arr[i];
			}else if(heighest < arr[i] && second > arr[i]) {
				second = arr[i];
			}
		}
		System.out.println("Heighest : "+ heighest);
		System.out.println("Second Heighest : "+ second);
	}
}
