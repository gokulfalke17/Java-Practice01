package gf.pune.Practical.collection;

import java.util.ArrayList;
import java.util.Random;

public class Task14_CloneOneArrayListToAnother {
	public static void main(String[] args) {
		
		ArrayList<Object> al1 = new ArrayList<Object>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add("A");
		al1.add("B");
		al1.add("C");
		
//		ArrayList<Object> al2 = (ArrayList<Object>)al1.clone();
//		System.out.println("Origenal List :: "+ al1);
//		System.out.println("Cloned List :: "+ al2);
//		
							/*(  OR  )*/
		
		System.out.println("Original List is :: "+ al1);
		ArrayList<Object> al2 = new ArrayList<Object>(al1);
		System.out.println("Cloned List is :: "+ al2);
		

	}
}	
