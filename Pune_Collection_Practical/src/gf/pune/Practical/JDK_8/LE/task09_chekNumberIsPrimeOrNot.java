package gf.pune.Practical.JDK_8.LE;

//9. Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.

interface checkPrime {
	boolean checkPrimeNumber(int num);
}
public class task09_chekNumberIsPrimeOrNot {
	
	public static void main(String[] args) {
		
		/*checkPrime prime = new checkPrime() {
			@Override
			public boolean checkPrimeNumber(int num) {
				if(num%2!=0)
					return true;
				return false;
			}
		};
		System.out.println(prime.checkPrimeNumber(7));*/
		
		checkPrime prime = (num)->num%2!=0 ? true : false;
		System.out.println(prime.checkPrimeNumber(11));
	}
}
