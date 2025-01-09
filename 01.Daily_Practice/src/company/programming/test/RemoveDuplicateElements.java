package company.programming.test;

/*
Input: arr[]={1,2,1,2,3,4,2,3,2,1,3,1,3,1};
Output: arr[]={1,2,3,4};
*/

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 3, 1, 3, 1 };
		// 1, 2, 3, 4

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length - count; j++) {

				if (arr[i] == arr[j]) {
					for (int k = j; k < arr.length - count - 1; k++) {
						arr[k] = arr[k + 1];
					}
					count++;
					j--;
				}
			}
		}
		
		System.out.println("After Removing Duplicate Elements :: ");
		for (int i = 0; i < arr.length - count; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
