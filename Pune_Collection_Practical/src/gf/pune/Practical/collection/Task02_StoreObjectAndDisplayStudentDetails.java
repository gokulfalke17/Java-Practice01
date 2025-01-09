package gf.pune.Practical.collection;

import java.util.Vector;

public class Task02_StoreObjectAndDisplayStudentDetails {
	public static void main(String[] args) {
		
		Vector<Student> v1 = new Vector<>();
		
		Student s1 = new Student(101, "ABC", "10th", 90.20);
		v1.add(s1);
		
		System.out.println(v1);
		
		Vector<Student> v2 = new Vector<Student>();
		Student s2  = new Student(1011, "ABC", "12th", 78.90);
		v2.add(s2);
		
		System.out.println(v2);
	}
}


class Student {
	private int id;
	private String name;
	private String std;
	private double percentage;

	
	public Student(int id, String name, String std, double percentage) {
		this.id = id;
		this.name = name;
		this.std = std;
		this.percentage = percentage;
	}


	@Override
	public String toString() {
		return " ( "+ id + ", " + name + ", " + std + ",  " + percentage + " ) ";
	}
	
	
}
