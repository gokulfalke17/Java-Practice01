package gf.practice04_;

public class Test01 {

	public static void main(String[] args) {

		Integer arr1[] = { 9, 4, 6, 2, 10, 10 };
		Integer arr2[] = { 14, 3, 6, 9, 10, 15, 17, 9 };
		// 6, 9, 10,

		//Arrays.sort(arr1);

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					arr2[j] = -1;
					break;
				}
			}

		}

//		System.out.println(count);

	}
}
