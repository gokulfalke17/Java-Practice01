package gf.pune.Practical.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task30_GenericReverseListStoreInNewList {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("A");
		list.add(5);
		list.add(10);
		list.add("c");
		list.add(20);
		list.add(15);
		list.add("B");
		System.out.println("List is :: ");
		System.out.println(list);
		
		Collections.reverse(list);
		List<Object> newList = new ArrayList<>(list);
		System.out.println("Reverse List is :: ");
		System.out.println(newList);
	}
}
