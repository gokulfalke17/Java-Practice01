package gf.pune.Practical.collection;

import java.util.Vector;

//Q3. WAP to store the 10 string values in Vector and find the string those ends with sh 

public class Task07_StringFindEndsWithSH {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("Ramesh");
		v.add("Suresh");
		v.add("Ram");
		v.add("Avi");
		v.add("Rahul");
		v.add("Mangesh");
		v.add("Jayesh");
		v.add("karan");
		v.add("Gokul");
		v.add("Arun");
		
		System.out.println(v);
		
		endsWithSH(v);

	}

	private static void endsWithSH(Vector<String> v) {
		System.out.println();
		System.out.println("String Ends With 'SH' :: ");
		for(String str : v) {
			if(str.toLowerCase().endsWith("sh")) {
				System.out.println(str);
			}
		}
	}

}
