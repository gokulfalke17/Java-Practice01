package gf.pune.Practical.map;

//10. Write a Java program to get the value of a specified key in a map

import java.util.HashMap;

public class task10_getValueFromSpecificKeys {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put( 1, "suresh");
		hm.put(2 ,"sanket");
		hm.put(3, "rajesh");
		hm.put(4, "rahul");
		hm.put(5, "ramesh");
		
		System.out.println("Map Entries are :");
		System.out.println(hm);
		System.out.println();
		
		Object key = hm.get(3);
		System.out.println("Key is : "+key);
	}
}
