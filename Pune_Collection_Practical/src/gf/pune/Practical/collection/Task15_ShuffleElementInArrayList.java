package gf.pune.Practical.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task15_ShuffleElementInArrayList {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		System.out.println("Before Shuffling :: ");
		System.out.println( al);
		Collections.shuffle(al);
		System.out.println("After Shuffling :: ");
		System.out.println( al);
		
//		//using random class
//		Random random = new Random();
//		for(int i=al.size()-1; i>0; i--) {
//			int index = random.nextInt(i+1);
//			Object temp = al.get(i);
//			al.set(i, al.get(index));
//			al.set(index, temp);
//		}
//		System.out.println("Random Class Using Shuffling :: ");
//		System.out.println(al);
		
	}
}
