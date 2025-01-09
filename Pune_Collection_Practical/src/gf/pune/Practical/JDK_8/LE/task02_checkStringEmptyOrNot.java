package gf.pune.Practical.JDK_8.LE;

//2. Write a Java program to implement a lambda expression to check if a given string is empty.

interface Check {
	void checkStringEmptyOrNot(String s);
}

public class task02_checkStringEmptyOrNot {

	public static void main(String[] args) {

		/*		Check ch = new Check(){
		
					@Override
					public void checkStringEmptyOrNot(String s) {
						if(!s.isEmpty()) {					
							System.out.println("String is Not Empty....");
						}else {					
							System.out.println("Yes, String is Empty !");
						}	
					}
					
				};*/

		Check ch = (String s) -> {
			if (!s.isEmpty())
				System.out.println("String is Not Empty....");
			else
				System.out.println("Yes, String is Empty !");
		};
		ch.checkStringEmptyOrNot("abc");
	}
}
