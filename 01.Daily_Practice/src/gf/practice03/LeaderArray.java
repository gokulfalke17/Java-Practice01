package gf.practice03;

public class LeaderArray {
	
	private static void findLeaderArrays(int[] arr) {
		int max = arr[arr.length-1];	//get the last element in given array
		
		System.out.println("Leader Array Elements :: ");
		System.out.print(max+" ");
		
		
		for(int i=arr.length-2; i>0; i--) {
			if(max < arr[i]) {
				max = arr[i];
				System.out.print(max+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {16, 17, 4, 3, 5, 2};
		
		findLeaderArrays(arr);
	}
}
