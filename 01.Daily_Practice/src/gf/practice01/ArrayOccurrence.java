package gf.practice01;

public class ArrayOccurrence {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 4, 3, 5, 6, 7, 6, 6, 7, 7, 5};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp  = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array Elements are :: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("Array Each Element Occurrence :: ");
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			if(i<arr.length-1 && arr[i] == arr[i+1]) {
				count++;
			}else {
				System.out.println(arr[i]+" --> "+count);
				count = 1;
			}
		}
	}
}
