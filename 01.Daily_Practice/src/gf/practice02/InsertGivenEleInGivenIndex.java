package gf.practice02;

import java.util.List;
import java.util.Vector;

public class InsertGivenEleInGivenIndex {
	
	public static void main(String[] args) {
		
		int index = 100;
		Integer element = 100;
		
		List<Integer> flag = insertElement(index, element);
	
		if(flag!=null) {
			System.out.println("Element Inserted in Given Index...");
		}else {
			System.out.println("Element is Not Inserted.");
		}
		
		flag.forEach(ele->System.out.println(ele));
		
	}
	
	public static List<Integer> insertElement(int index, Integer element) {
		List<Integer> list = new Vector<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.add(index, element);
		
		return list;
	}
}
