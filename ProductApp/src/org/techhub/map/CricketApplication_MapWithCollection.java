package org.techhub.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CricketApplication_MapWithCollection {
	public static void main(String[] args) {
		LinkedHashMap<String , ArrayList<String>> cricket = new LinkedHashMap<String, ArrayList<String>>();
		
		ArrayList<String> indiaPlayer = new ArrayList<String>();
		indiaPlayer.add("Rohit Sharma");
		indiaPlayer.add("MS Dhoni");
		indiaPlayer.add("Virat Kolhi");
		
		ArrayList<String> ausPlayer = new ArrayList<String>();
		ausPlayer.add("MaxWell");
		ausPlayer.add("Head");
		ausPlayer.add("Warnar");
		
		
		cricket.put("India", indiaPlayer);
		cricket.put("Australia", ausPlayer);
		
		Set<Map.Entry<String, ArrayList<String>>> set = cricket.entrySet();
		for(Map.Entry<String, ArrayList<String>> m:set) {
			String key = m.getKey();
			ArrayList<String> value = m.getValue();
			System.out.println("Team Name :"+ key);
			System.out.println("-------------------");
			for (String val : value) {
				System.out.println(val);
			}
			System.out.println();
		}
	}
}
