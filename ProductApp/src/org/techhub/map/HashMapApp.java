package org.techhub.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapApp {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(12, "ABC");
		hm.put(23, "GENESH");
		hm.put(3, "SURESH");
		hm.put(42, "SANDEEP");
		hm.put(50, "RAJU");
		hm.put(67, "SHYAM");
		hm.put(7, "MNO");
		hm.put(88, "PQR");
		
		Set<Integer> k = hm.keySet();
		
		System.out.println("Map List is :");
		for (Integer key : k) {
			String value = hm.get(key);
			System.out.println(key+"-->"+value);
		}
	}
}
