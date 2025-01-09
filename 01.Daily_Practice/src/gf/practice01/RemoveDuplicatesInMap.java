package gf.practice01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesInMap {
	public static void main(String[] args) { 
		 
		Map<Integer, Integer> m = Map.of(1, 1, 2, 2, 3, 3, 4, 2, 5, 2, 6,4, 7, 5, 8, 5, 9, 3);
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(m); 
		System.out.println("Map Entries are : ");
		System.out.println(map);
		System.out.println();
		
		
		System.out.println("After Removing Duplicate Values From Map : ");
		Set<Integer> set = new HashSet<Integer>(); 
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
			if(!set.add(entry.getValue())) {
				map.remove(entry.getKey());
			}
		}
		
		System.out.println(map);
	}
}
