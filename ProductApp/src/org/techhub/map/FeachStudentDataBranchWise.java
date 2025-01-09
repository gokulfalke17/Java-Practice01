package org.techhub.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FeachStudentDataBranchWise {
	public static void main(String[] args) {
		LinkedHashMap<String, LinkedHashMap<Integer, String>> list = new LinkedHashMap<String, LinkedHashMap<Integer,String>>();
		LinkedHashMap<Integer, String> CSE = new LinkedHashMap<Integer, String>();
		CSE.put(1, "Suresh");
		CSE.put(2, "Ramesh");
		CSE.put(3, "Raj");
		
		LinkedHashMap<Integer, String> MECH = new LinkedHashMap<Integer, String>();
		MECH.put(1, "Ram");
		MECH.put(2, "Dinesh");
		MECH.put(3, "Shyam");
		
		list.put("CSE", CSE);
		list.put("MECH", MECH);
		
		//using et
		
//		Set<Map.Entry<String, LinkedHashMap<Integer, String>>> set = list.entrySet();
//		for(Map.Entry<String, LinkedHashMap<Integer, String>> m : set) {
//			
//			String key = m.getKey();
//			LinkedHashMap<Integer, String> val = m.getValue();
//			System.out.println("Branch :"+key);
//			System.out.println("--------------");
//			
//			System.out.println("ID\tNAME");
//			Set<Map.Entry<Integer, String>> setVal = val.entrySet();
//			for(Map.Entry<Integer, String> value : setVal) {
//				
//				System.out.println(value.getKey()+"\t"+value.getValue());
//			}
//			System.out.println();
//		}
		
		//using Iterator
		
		Iterator<Map.Entry<String, LinkedHashMap<Integer, String>>> set = list.entrySet().iterator();
		while(set.hasNext()) {
			Map.Entry<String, LinkedHashMap<Integer, String>> bEntry = set.next();
			
			String branch = bEntry.getKey();
			LinkedHashMap<Integer, String> student =  bEntry.getValue();
			System.out.println("Branch :"+ branch);
			System.out.println("--------------------");
			
			System.out.println("ID\tNAME");
			Iterator<Map.Entry<Integer, String>> setVal = student.entrySet().iterator();
			while(setVal.hasNext()) {
				Map.Entry<Integer, String> sEntry = setVal.next();
				System.out.println(sEntry.getKey()+"\t"+sEntry.getValue());
			}
			System.out.println();
		}
	}
}
