package gf.practice03;

public class FindMissingElements {

	public static void findMissing(int arr[]) {

		System.out.println("Missing Elements are :: ");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
				System.out.print(j + " ");
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 9 };

		System.out.println("Array Elements are :: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		findMissing(arr);

	}

}
