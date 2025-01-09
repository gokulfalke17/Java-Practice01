package gf.code_practice;

class SecondHeighest {
	private int[] arr;

	public void setArray(int arr[]) {
		this.arr = arr;
	}

	public int getSecondHeighest() {
		int heighest = arr[0];
		int second = 0;

		for (int i = 0; i < arr.length; i++) {
			if (heighest < arr[i]) {
				second = heighest;
				heighest = arr[i];
			} else if (heighest > arr[i] && second < arr[i]) {
				second = arr[i];
			}
		}
		System.out.println();
		System.out.println("Heighest is :"+heighest);
		return second;
	}
}

public class Test_SecondHeighestWittTwoMethods {
	public static void main(String[] args) {
		SecondHeighest sh = new SecondHeighest();
		int arr[] = { 1, 4, 7, 16, 18, 12, 13, 9 };

		System.out.println("Array Elements are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		sh.setArray(arr);
		int result = sh.getSecondHeighest();
		System.out.println("Second Heighest is :" + result);
	}

}
