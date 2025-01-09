package gf.pune.Practical.map;

import java.util.HashMap;
import java.util.Map;

//1. Write a Java program to associate the specified value with the specified key in a HashMap

public class task01_AssociatedValueSpecifiedKey_HashMap {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("a", 1);
		hm.put(5, 2);
		hm.put("b", 3);
		hm.put(6, 4);
		hm.put("c", 5);
		hm.put(7, 6);
		
		//System.out.println(hm);
		System.out.println("HashMap Entries are :");
		for(Map.Entry<Object, Object> entry : hm.entrySet()) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+" "+value);
		}
	}
}
