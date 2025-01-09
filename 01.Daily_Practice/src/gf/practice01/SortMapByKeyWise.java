package gf.practice01;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKeyWise {
	
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("suresh", 21);
        map.put("avishkar", 4);
        map.put("yashraj", 9); 

        Map<String, Integer> sort = new TreeMap<>(map);

        System.out.println("Sorted map by Key  :");
        for (Map.Entry<String, Integer> entry : sort.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
