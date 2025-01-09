package gf.pune.Practical.map;

//11. Write a Java program to get a set view of the keys contained in this map

import java.util.HashMap;

public class task11_AllKeysInMap {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("abc", 1);
		hm.put("mno", 2);
		hm.put("pqr", 3);
		hm.put("stv", 4);
		hm.put("xyz", 5);
		System.out.println("Map Entries are : ");
		System.out.println(hm);
		System.out.println();
		
		Object keys = hm.keySet();
		System.out.println("Keys are : ");
		System.out.println(keys);
		
	}
}
