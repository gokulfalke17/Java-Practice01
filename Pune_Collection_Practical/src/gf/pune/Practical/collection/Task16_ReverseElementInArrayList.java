package gf.pune.Practical.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Task16_ReverseElementInArrayList {
	public static void main(String[] args) {
		System.out.println("===Using Collections Class Method===");
		ArrayList<Object> al1 = new ArrayList<Object>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add("A");
		al1.add("B");
		al1.add("C");
		System.out.println("Before Reverse :: ");
		System.out.println(al1);
		
		Collections.reverse(al1);
		System.out.println("After Reverse :: ");
		System.out.println(al1);
		System.out.println();
		
//======================================================================================
		
//		System.out.println("===Using ListIterator===");
//		ArrayList<Object> al2 = new ArrayList<Object>();
//		al2.add(10);
//		al2.add(20);
//		al2.add(30);
//		al2.add("A");
//		al2.add("B");
//		al2.add("C");
//		System.out.println("Before Reverse :: ");
//		System.out.println(al2);
//		ListIterator<Object> li = al2.listIterator(al2.size());
//		System.out.println("After Reverse :: ");
//		while(li.hasPrevious()) {
//			System.out.print(li.previous()+" ");
//		}
//		System.out.println();
//		System.out.println();
		
//======================================================================================		
		
		System.out.println("===Without Using Any Thing===");
		ArrayList<Object> al3 = new ArrayList<Object>();
		al3.add(10);
		al3.add(20);
		al3.add(30);
		al3.add("A");
		al3.add("B");
		al3.add("C");
		System.out.println("Before Reverse :: ");
		System.out.println(al3);
		
		int start = 0;
		int end = al3.size()-1;
		while(start < end) {
			Object temp = al3.get(start);
			al3.set(start, al3.get(end));
			al3.set(end, temp);
			start++;
			end--;
			
		}
		System.out.println("After Reverse :: ");
		System.out.println(al3);
		
	}
}
