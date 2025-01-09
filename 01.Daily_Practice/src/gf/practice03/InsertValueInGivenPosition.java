package gf.practice03;

public class InsertValueInGivenPosition {
	
	private static int[] insertValue(int arr[], int index, int value) {
		int newArray[] = new int[arr.length+1];
		for(int i=0; i<index; i++) {
			newArray[i] = arr[i];	
		}
		
		newArray[index] = value;
		
		for(int i=index; i<arr.length; i++) {
			newArray[i+1] = arr[i];
		}
		 
		return newArray;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 4, 6, 5, 7, 8, 9};
		
		System.out.println("Array Elements :: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int index = 2;
		int value = 200;
		int[] result = insertValue(arr, index, value);
		
		System.out.println("After Inserting New Value Array is :: ");
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();
	}

	
}
