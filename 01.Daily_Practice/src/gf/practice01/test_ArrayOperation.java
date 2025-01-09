package gf.practice01;

public class test_ArrayOperation {

	int arr[];

	public void setArray(int arr[]) {
		this.arr = arr;
	}

	public void sortArrayASC() {
		
	}

	public void sumOfArrayElemenets() {

		System.out.println();
		System.out.println("Particular Number Sum is : ");
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int temp = arr[i];
			while (temp != 0) {
				int rem = temp % 10;
				sum = sum + rem;
				temp = temp / 10;
			}

			System.out.print(sum + " ");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 5732, 8659, 2534, 9625, 7354, 1325 };

		System.out.println("Array Elements Are :: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		test_ArrayOperation operation = new test_ArrayOperation();
		operation.setArray(arr);
		operation.sortArrayASC();
		operation.sumOfArrayElemenets();

	}
}
