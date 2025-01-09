package gf.practice03;

public class DeleteGivenValue {
	
	private static void deleteElement(int[] arr, int element) {
		
		System.out.println("After Deleting Element in Array :: ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=element) {
				System.out.print(arr[i]+" ");
			}
		}		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 100, 6};
		int element = 100;
		
		System.out.println("Array Elements are :: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		deleteElement(arr, element);
	}

}
