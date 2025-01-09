package gf.pune.Practical.map;

//8. Write a Java program to test if a map contains a mapping for the specified value

import java.util.HashMap;

public class task08_MapContainsValue {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("suresh", 1);
		hm.put("ram", 2);
		hm.put(5, 3);
		hm.put("abc", 4);
		hm.put(39, 5);
		System.out.println("Map Entries are :");
		System.out.println(hm);
		System.out.println();
		
		Object obj = 4;
		System.out.println("Value is : "+obj);
		boolean value = hm.containsValue(obj); 
		if(value) {
			System.out.println("Value is Found...");
		}else {
			System.out.println("Value is Not Found...");
		}
	}
}
