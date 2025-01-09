package gf.pune.Practical.map;

//6. Write a Java program to get a shallow copy of a HashMap instance

import java.util.HashMap;

public class task06_getShallowCopyOfHashMap {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("abc", 1);
		hm.put("ram", 2);
		hm.put("Shyam", 3);
		hm.put("Ramesh", 4);
		hm.put(12345, 5);
		
		System.out.println("Original hashMap Entries :\n"+ hm);
		System.out.println();
		HashMap<Object, Object> shallowCopy = new HashMap<Object, Object>(hm);
		System.out.println("Shallow Copy HashMap Entries :\n"+ shallowCopy);
	}
}
