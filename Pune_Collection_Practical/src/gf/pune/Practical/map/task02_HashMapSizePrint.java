package gf.pune.Practical.map;

import java.util.HashMap;
import java.util.Map;

//2. Write a Java program to count the number of key-value (size) mappings in a map

public class task02_HashMapSizePrint {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put("c", 3);
		hm.put(3, 4);
		hm.put(null, 5);
		hm.put('p', 6);
		
		System.out.println("Hash Map Entries are :");
		for(Map.Entry<Object, Object> entry : hm.entrySet()) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+" "+value);
		}
		System.out.println();
		System.out.println("Size of Hash Map :"+hm.size());
	} 
}
