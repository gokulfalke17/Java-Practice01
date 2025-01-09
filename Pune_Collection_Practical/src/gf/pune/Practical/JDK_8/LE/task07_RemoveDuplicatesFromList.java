package gf.pune.Practical.JDK_8.LE;

//7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class task07_RemoveDuplicatesFromList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 3, 1, 5, 6, 7, 5, 3, 1, 7, 8, 11, 22, 34, 2, 4, 5, 6, 7));
		System.out.println("List is : "+ list);
		
		/*List<Integer> newList = new ArrayList<Integer>();
		Consumer<Integer> cons = new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				if(!newList.contains(i)) {
					newList.add(i);
				}
			}
			
		};
		list.forEach(cons);
		Collections.sort(newList);
		System.out.println("new List is : "+ newList);*/
		
		List<Integer> newList = new ArrayList<Integer>();
		Consumer<Integer> cons = (i)->{
				if(!newList.contains(i))
					newList.add(i);
			};
		list.forEach(cons);
		System.out.println(newList);
		
	}
}
