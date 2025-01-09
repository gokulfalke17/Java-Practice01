package gf.practice04_;

public class PrintPrimeNumbers {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        System.out.println("Prime Numbers are:");

        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i); 
            }
        }
    }
}
