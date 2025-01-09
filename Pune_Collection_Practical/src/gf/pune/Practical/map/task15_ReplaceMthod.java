package gf.pune.Practical.map;

//15. Write a Java program to how to use replace() method in HashMap

import java.util.HashMap;

public class task15_ReplaceMthod {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put(2, "Rahul");
		hm.put(1, "Suresh");
		hm.put(4, "Ram");
		hm.put(3, "Ramesh");
		hm.put(5, "Shyam");
		System.out.println("Map Entries are : "+ hm);
		
		//#1 : 
		hm.replace(4, "Raju");
		System.out.println("Replacing Operation : "+ hm);
		
		//#2 : 
		hm.replace(1, "Suresh", "Sanket");
		System.out.println("Replacing Opeation : "+ hm);
		
		
	}
}
