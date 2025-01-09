package gf.practice03;

public class sortArray {
	
	public static void main(String[] args) {
		
		int arr[] = {19, 48, 80, 10, 30, 59, 48, 78, 1, 76, 10};
		
		System.out.println("Array Elements are :: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Sorted Array :: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
}
