package gf.practice01;

public class RemoveDuplicatesInArray {
	
	public static void main(String[] args) {
		
		//int arr[] = {1, 2, 3, 2, 2, 4, 5, 5, 3};
		int arr[]={1,2,1,2,3,4,2,3,2,1,3,1,3,1};
		System.out.println("Array Elements are : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length-count; j++) {
				if(arr[i] == arr[j]) {
					for(int k=j; k<arr.length-count-1; k++) {
						arr[k] = arr[k+1];
					}
					count++;
					j--;
				}
			}
		}
		
		System.out.println("\nAfter Removing Duplicate Elements : ");
		for(int i=0; i<arr.length-count; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
}
