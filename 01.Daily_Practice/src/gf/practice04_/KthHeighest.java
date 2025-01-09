package gf.practice04_;

public class KthHeighest {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 5, 9, 7, 8, 4, 2, 0};
		int Kth = 3;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int count = 1;
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]!=arr[i+1]) {
				count++;
			}
			if(count==Kth) {
				System.out.println("Kth Heighest is :: "+ arr[i+1]);
				break;
			}
		}
	}
}
