package gf.practice04_;

public class DuplicateElementsInTwoArrays {
	
	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 3, 4, 5, 6, 7};
		int arr2[] = {4, 6, 7, 8, 9, 0, 9};
		
		System.out.println("Duplicate Elements are :: ");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					break;
				}
			}
		}
	}
}
