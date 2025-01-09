package gf.pune.Practical.map;

//7. Write a Java program to test if a map contains a mapping for the specified key

import java.util.HashMap;

public class task07_MapContainsKey {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("ram", 1);
		hm.put("shyam", 2);
		hm.put("ramesh", 3);
		hm.put("suresh", 4);
		System.out.println("HashMap Entries are :");
		System.out.println(hm);
		Object str = "suresh";
		System.out.println("Key is : "+ str);
		boolean key = hm.containsKey(str);
		if(key) {
			System.out.println("Key is Found. ");
		}else {
			System.out.println("Key is Not Found... ");
		}
	}
}
