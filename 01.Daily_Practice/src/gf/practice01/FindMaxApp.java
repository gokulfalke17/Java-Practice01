package gf.practice01;

class FindMax {
	int arr[];
	public void setArray(int ...arr) {
		this.arr = arr;
	}
	
	public void showArray() {
		System.out.println("Array Elements are : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public int getMax() {
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
public class FindMaxApp {
	public static void main(String[] args) {
		int arr[] = {2, 6, 3, 9, 7, 4, 1, 8, 0};
		FindMax max = new FindMax();
		max.setArray(arr);
		max.showArray();
		System.out.println();
		int maxResult = max.getMax();
		System.out.println("Max Value is : "+ maxResult);
	}

}
