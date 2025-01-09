package company.programming.test;

public class primeNumbers {

	public static void main(String[] args) {
		int num = 20;

		System.out.println("Prime Numbers are :: ");
		for (int i = 2; i <= num; i++) {
			boolean flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("--------------------------");
		

//======================================================================================================================		
		
		int n = 7;

		boolean flag = false;

		if (n > 2) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					flag = true;
					break;
				}
			}
		} else {
			flag = true;
		}
		System.out.println();

		if (!flag)
			System.out.println(n + " is Prime...");
		else
			System.out.println(n + " is Not Prime.");

	}
}
