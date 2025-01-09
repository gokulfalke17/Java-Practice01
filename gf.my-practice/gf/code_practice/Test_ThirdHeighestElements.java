package gf.code_practice;

public class Test_ThirdHeighestElements {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,50,20,40,10,60,60,30,30};
		
		System.out.println("Elements Are :: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int heighest = arr[0];
		int second = 0;
		int third = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > heighest) {
				third = second;
				second = heighest;
				heighest = arr[i];
			}else if(heighest > arr[i] && second < arr[i]) {
				third = second;
				second = arr[i];
			}else if(second > arr[i] && third < arr[i]) {
				third = arr[i];
			}
		}
		
		System.out.println();
		System.out.println("Heighest Element :: "+ heighest);
		System.out.println("Second Heighest Element :: "+ second);
		System.out.println("Third Heighest Element :: "+ third);
	}
}
