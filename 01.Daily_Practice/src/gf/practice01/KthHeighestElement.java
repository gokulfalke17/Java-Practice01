package gf.practice01;

public class KthHeighestElement {
	
	public static void main(String[] args) {
		
		int arr[] = {3, 5, 1, 5, 4, 5, 5, 3};
		
		int kth = 2;
		
		for(int i=0;i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array Elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

		System.out.println();
		int count = 1;
		for(int i=0;i<arr.length-1; i++) {
			
			if(arr[i] != arr[i+1]) {
				count++;
			}
			if(count==kth) {
				System.out.println("Kth Element is : "+ arr[i+1]);
				break;
			}
		}
	}
}
