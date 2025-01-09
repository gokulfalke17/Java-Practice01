package gf.practice03;

public class FindKthHeighest {
	
	public static void kthHeighest(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Elements are :: ");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		
		
		int kth = 3;
		int count = 1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				count++;
			}
			if(count==kth) {
				System.out.println(kth+" Heighest Element is :: "+ arr[i+1]);
				break;
			}
		}
		
		
	}
	public static void main(String[] args) {
	
		int arr[] = { 19, 48, 80, 10, 30, 59, 48, 78, 1, 76, 10 };

		System.out.println("Array Elements are :: ");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		kthHeighest(arr);
	}
	
}
