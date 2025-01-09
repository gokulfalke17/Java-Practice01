package gf.code_practice;

public class Test_ThirdSmallestElements {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,50,20,40,10,60,60,30,30};
		
		System.out.println("Elements Are :: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int smallest = arr[0];
		int second = Integer.MAX_VALUE;
		int third = Integer.MAX_VALUE;
		

	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] < smallest) {
	        third = second;
	        second = smallest;
	        smallest = arr[i];
	      } else if (smallest < arr[i] && second > arr[i]) {
	        third = second;
	        second = arr[i];
	      } else if (second < arr[i] && third > arr[i]) {
	        third = arr[i];
	      }
	    }


		
		System.out.println();
		System.out.println("Smallest Element :: "+ smallest);
		System.out.println("Second Smallest Element :: "+ second);
		System.out.println("Third Smallest Element :: "+ third);
	}
}
