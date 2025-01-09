package gf.pune.Practical.JDK_8.LE;

//8. Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.

interface CalcFact {
	int clculateFactorial(int num);
}
public class task08_CalculateFactorialNumber {
	
	public static void main(String[] args) {
		
		//5!= 5*4*3*2*1
		
		/*CalcFact fact = new CalcFact() {
			
			@Override
			public int clculateFactorial(int num) {
				int fact = 1;
				for(int i=1; i<= num; i++) {
					fact = fact*i;
				}
				return fact;
			}
		};
		int factorial = fact.clculateFactorial(5);
		System.out.println("Factorial of Given Number is : "+ factorial);*/
		
		
		CalcFact fact = (num)->{
				int result = 1;
				for(int i=1;i<=num;i++) result = result * i;
				return result;
			};
		
		System.out.println(fact.clculateFactorial(5));
		
		
	}
}
