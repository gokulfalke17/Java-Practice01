package gf.pune.Practical.collection;

import java.util.Scanner;
import java.util.Vector;

//Q1. WAP to create Vector and store 5 student object in it and arrange all students in ascending order by using its id 
//Note: without using comparable interface or comparator interface.

class Student02 {
	int id;
	String name;
	public Student02(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return " ( id=" + id + ", name=" + name + " ) ";
	}
	
}

public class Task05_ArrangeStudentInASC {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Vector<Student02> v = new Vector<Student02>();
		Student02 s[] = new Student02[4];
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter Student Id ");
			int id = scn.nextInt(); scn.nextLine();
			System.out.println("Enter Student Name ");
			String name = scn.nextLine();
			
			v.add(new Student02(id, name));
		}
		
		System.out.println("Before Sorting :: ");
		System.out.println(v);
		
		sortAscOrder(v);
		
	}
	
	//for sorting
	private static void sortAscOrder(Vector<Student02> v) {
		
		System.out.println("After Sorting by Id Wise ::");
	        for (int i = 0; i < v.size() - 1; i++) {
	            for (int j = 0; j < v.size() - i - 1; j++) {
	                if (v.get(j).id > v.get(j + 1).id) {
 
	                	Student02 temp = v.get(j);
	                    v.set(j, v.get(j + 1));
	                    v.set(j + 1, temp);
	                }
	            }
	        }
		
			System.out.println(v);
		
	}
}
