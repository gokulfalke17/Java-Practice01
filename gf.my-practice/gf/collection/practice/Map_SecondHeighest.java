package gf.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_SecondHeighest {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ABC", 10);
		map.put("MNO", 10);
		map.put("PQR", 50);
		map.put("STV", 40);
		map.put("XYZ", 20);
		System.out.println("Map Entries :"+map);
		
		List<Integer> values = new ArrayList<Integer>(map.values());
		Collections.sort(values, Collections.reverseOrder());
		
		int valueHeighest = values.get(0); 
		int valueSecond = values.get(1);
		
		System.out.println("Heighest :"+valueHeighest);
		System.out.println("Second Heighest :"+valueSecond); 
		System.out.println();
		
		int max = 0;
		int second_max = 0;
		for(int val : map.values()) {
			if(max < val) {
				second_max = max;
				max = val;
			}else if(second_max < val) {
				second_max = val;
			}
		}
		
		System.out.println("Heighest :"+ max);
		System.out.println("Second Heighest :"+second_max);
		
	}
}
