package gf.pune.Practical.collection;

import java.util.Vector;

//Q2. WAP to create Vector and store 10 integer values in it and find the duplicated values from Vector

public class Task06_DuplicateIntegerFind {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(50);
		v.add(10);
		v.add(30);
		v.add(60);
		v.add(70);
		v.add(20);
		v.add(40);
		v.add(30);
		System.out.println(v);
		
		System.out.println("Duplicate Integers :: ");
		for(int i=0; i<v.size() ;i++) {
			for(int j=i+1; j<v.size(); j++) {
				
				if(v.get(i) == v.get(j)) {
					System.out.println(v.get(i));
				}
			}
		}
	
	}
}	
