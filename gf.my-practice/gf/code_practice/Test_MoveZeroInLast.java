package gf.code_practice;

public class Test_MoveZeroInLast {
	public static void main(String[] args) {
		
		int arr[] = {4, 0, 0, 1,3,12};
		
		int j = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		} 
		
		System.out.println("after moving zeros in last ::");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
