package gf.pune.Practical.map;

//3. Write a Java program to copy all of the mappings from the specified map to another map

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class task03_CopyAllMappingIntoAnotherMap {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("a", 1);
		hm.put(5, 2);
		hm.put("c", 3);
		hm.put('p', 4);
		hm.put("a", 5);
		System.out.println("Before Copying :");
		System.out.println(hm);
		System.out.println();
		
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<Object, Object>(hm);
		
		System.out.println("Coyping HashMap to LinkedHashMap :");
		for(Map.Entry<Object, Object> entry : lhm.entrySet()) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println(key+" "+value);
		}
	}
}
