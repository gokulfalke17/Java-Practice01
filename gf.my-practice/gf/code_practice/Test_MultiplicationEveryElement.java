package gf.code_practice;

public class Test_MultiplicationEveryElement {
	public static void main(String[] args) {
		int arr[] = {1,3,1,3,5};
		int product = 1;
		for(int i=0; i<arr.length; i++) {
			product = product * arr[i];
		}
		System.out.println("Product Muliplication is :"+ product);
	}
}	
