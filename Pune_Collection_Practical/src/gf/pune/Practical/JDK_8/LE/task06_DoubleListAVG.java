package gf.pune.Practical.JDK_8.LE;

//6. Write a Java program to implement a lambda expression to find the average of a list of doubles.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class task06_DoubleListAVG{
	
	static Double  sum = 0.0d;
	public static void main(String[] args) {
		
		List<Double> list = new ArrayList<Double>(Arrays.asList(5.3, 10.5, 5.0, 15.20, 40.5, 20.5, 1.1)); 
		System.out.println("List is : "+ list);
		System.out.println();
		
		/*Consumer<Double> cons = new Consumer<Double>() {
			@Override
			public void accept(Double d) {
				sum = sum + d;	
			}
		};
		list.forEach(cons); 
		double avg = sum/list.size();
		System.out.println("Average : "+ avg);*/
		
		list.forEach((d)-> sum = sum + d);
		System.out.println("Avegare is : "+ sum/list.size());
        

	}
}
