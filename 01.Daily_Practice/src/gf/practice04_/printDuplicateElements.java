package gf.practice04_;

public class printDuplicateElements {
	
	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {3, 4, 5, 6, 7, 8};
		
		System.out.println("Repeated Elements are :: ");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
}
