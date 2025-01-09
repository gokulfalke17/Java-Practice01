package gf.pune.Practical.map;

//5. Write a Java program to check whether a map contains key-value mappings (empty) or not

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class task05_checkContainsKeyEmptyOrNot {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("abc", 1);
		hm.put("mno", 2);
		hm.put("pqr", 3);
		hm.put("xyz", 4);
		hm.put("stv", 5);
		
		System.out.println("HashMap Entries are :");
		for(Map.Entry<Object, Object> entry : hm.entrySet()) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+" "+value);
		}
		System.out.println();
		
		System.out.println("Is Map Empty :"+hm.isEmpty());	//false
		
		//after removing all map entries
		Iterator<Object> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			itr.next();
			itr.remove();
		}
		System.out.println();
		
		
		System.out.println("Is Mao Empty :"+hm.isEmpty());	//true
		System.out.println(hm);
	}
}
