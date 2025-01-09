package gf.code_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOcc {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer num : list) {
			Integer count = map.get(num);
			System.out.println(count);
			if (count == null) { 
				count = 0;
			}
			count++;
			map.put(num, count);
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
	}
}
