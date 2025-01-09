package gf.practice01;

import java.util.Scanner;

class CheckEligible extends Exception{
	
	public String ErrorMessage() {
		return "UserDefinedException";
	}
}

class CheckAge {
	public void checkAge(int age) throws CheckEligible  {
		if(age < 18) {
			CheckEligible check = new CheckEligible(); 
			throw check;
		}else {
			System.out.println("Bast of Luck...");
		}
	}
}

public class userDefineException {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Enter Age : ");
			int age = scn.nextInt();
			
			CheckAge check = new CheckAge();
			check.checkAge(age);
		}catch(CheckEligible e){
			System.out.println(e.ErrorMessage());
		}
	}
}
