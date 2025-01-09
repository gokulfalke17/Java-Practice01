package gf.practice03;

public class MargeArray {
	
	private static int[] margeArray(int[] arr, int[] brr) {
		
		//marge array logic
		int crr[] = new int[arr.length + brr.length];
		for(int i=0; i<crr.length; i++) {
			if(i<crr.length/2) {
				crr[i] = arr[i];
			}else {
				crr[i] = brr[i-5];
			}
		}
		return crr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println("First Array is :: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int brr[] = {5, 6, 7, 8, 9};
		System.out.println("Second Array is :: ");
		for(int i=0; i<brr.length; i++) {
			System.out.print(brr[i]+" ");
		}
		System.out.println();
		
		//calling method and get marge array elements.
		int[] margeArray = margeArray(arr, brr);
		
		System.out.println("Marge Array is :: ");
		for(int i=0; i<margeArray.length; i++) {
			System.out.print(margeArray[i]+" ");
		}
		System.out.println();
	}
}
