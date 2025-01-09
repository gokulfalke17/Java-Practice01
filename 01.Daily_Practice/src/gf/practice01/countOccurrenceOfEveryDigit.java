package gf.practice01;

public class countOccurrenceOfEveryDigit {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 2, 3, 3, 5, 4, 3, 5, 3, 1, 2, 6};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j] ) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sotred Array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			if(i<arr.length-1 &&  arr[i]== arr[i+1]) {
				count++;
			}else {
				System.out.println(arr[i]+" ---> "+count);
				count=1;
			}
		}
	}
}
