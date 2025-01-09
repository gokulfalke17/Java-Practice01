package gf.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test19_DiffWaysToCreatingCollectionAndMap {
	public static void main(String[] args) {
		
		//#1 : by using new keyword and constructor, 
				//then initialize it by using add() and put() methods
		List<Object> list = new ArrayList<>();
		list.add("a");
		list.add(5);
		list.add(null);
		list.add(new Ex(5,6));
		System.out.println("List :"+ list);
		
		Set<Object> set = new LinkedHashSet<>();
		set.add("a");
		set.add(5);
		set.add(null);
		set.add(new Ex(5,6));
		System.out.println("Set :"+set);
		
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("a", 1);
		map.put(5, 2);
		map.put(null, 3);
		map.put(new Ex(5,6), 4);
		System.out.println("Map :"+map);
		System.out.println();
		
		//#2 : by using Arrays.asList(E...e) method
		List<Object> list2 = Arrays.asList("a", 5, null, new Ex(5,6));
		System.out.println("List2 :"+list2);
		
		Set<Object> set2 = new LinkedHashSet<Object>(list2);
		System.out.println("Set2 :"+set2);
		System.out.println();
		
		//#3 : by using Java 9 
				//List.of(E...), Set.of(E....), Map.of(Map.Entry....)
//		List<Object> list3 = List.of("a", 5, null, new Ex(5,6));
//		Set<Object> set3 = Set.of("a", 5, null, new Ex(5,6));
//		Map<Object, Integer> map3 = Map.of("a",1 , 5,2 , null,3 , new Ex(5,6),4);
		
		List<Object> list3 = List.of("a", 5, "a", new Ex(5,6));
//		Set<Object> set3 = Set.of("a", 5, "a", new Ex(5,6));
		Set<Object> set3 = Set.of("a", 5, new Ex(5,6));
//		Map<Object, Integer> map3 = Map.of("a",1 , 5,2 , null,3 , new Ex(5,6),4);
//		Map<Object, Integer> map3 = Map.of("a",1 , 5,2, new Ex(5,6),4, "a",5);
		Map<Object, Integer> map3 = Map.of("a",1 , 5,2, new Ex(5,6),4);
		
		System.out.println("List3 :"+list3);
		System.out.println("Set3 :"+set3);
		System.out.println("Map3 :"+map3);
		System.out.println();
		
		//add and remove operations are allowed...
		list.add("x");
		set.add("x");
		map.put("x", 6);
		System.out.println(list);
		System.out.println(set);
		System.out.println(map);
		System.out.println();
		
		list.remove("a");
		set.remove("a");
		map.remove("a");
		System.out.println(list);
		System.out.println(set);
		System.out.println(map);
		System.out.println();
		
//		list2.add("x");		//RE : UnsupportedOperationException
		list2.remove("x");	//not exception "x" is not available 
//		list2.remove("a");	//RE : UnsupportedOperationException
		
//		list3.add("x");		//RE : UnsupportedOperationException
//		list3.remove("x");	//RE : UnsupportedOperationException	-> even through x is not available
		
		
		
		
		
		
	}
}
