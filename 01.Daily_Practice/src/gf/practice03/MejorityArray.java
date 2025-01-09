package gf.practice03;

public class MejorityArray {
	
	private static boolean isMejorityArray(int[] arr) {
		
		int count =0;
		for(int i=0; i<arr.length;i++) {
			count = 1;
			for(int j=0; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		
		if(count>=arr.length/2) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 2, 2, 3, 2, 2};
		
		System.out.println("Array Elements are :: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//calling method to find is mejority array or not.
		boolean flag = isMejorityArray(arr);
		
		if(flag) {
			System.out.println("Is Mejority Array...");
		}else {
			System.out.println("Is Not Mejority Array.");
		}
	}

}
