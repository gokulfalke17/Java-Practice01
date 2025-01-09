package gf.pune.Practical.map;

//18. Write a Java program to get keys from a HashMap collection

import java.util.HashMap;

public class task18_ {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put(2, "abc");
		hm.put(1, "mno");
		hm.put(5, "pqr");
		hm.put(4, "stv");
		hm.put(3, "xyz");
		
		System.out.println("Map Entries are : "+ hm);
		
		
	}
}
