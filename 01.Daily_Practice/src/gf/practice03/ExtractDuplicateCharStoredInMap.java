package gf.practice03;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExtractDuplicateCharStoredInMap {
	
	public static void main(String[] args) {
		
		String str = "Enginnering"; // e n g i
		
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] ch = str.toLowerCase().toCharArray();
		
		System.out.println("Character Are :: ");
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		
		
		System.out.println();
		for(char character : ch) {
			
			if(map.containsKey(character)) {
				
				map.put(character, map.get(character)+1); //e->2  n->4
				
			}else {
				map.put(character, 1);
			}
		}
		
		System.out.println("Duplicate Characters :: ");
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>=1) {
				System.out.println(entry.getKey()+"--->"+ entry.getValue());
			}
		}
		
		
		/*for(int i=0; i<ch.length; i++) {
			if(!(map.containsKey(ch[i]))) {
				map.put(ch[i], i);
			}
		}
		
		System.out.println(map);*/
		
	}
	
}
