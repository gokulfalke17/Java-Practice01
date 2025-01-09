package com.org.practice_;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 d.Write a program to create LinkedHashMap and store Student data in given format and show the output in given fashion
*/

class Student01 {
	private int studeId;
	private String studName;
	private int studPer;

	public Student01() {
	}

	public Student01(int studeId, String studName, int studPer) {
		this.studeId = studeId;
		this.studName = studName;
		this.studPer = studPer;
	}

	@Override
	public String toString() {
		return studeId + "\t"+ studName + "\t" + studPer ;
	}
}

public class LinkedHashMapStoreStudentData {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, List<Student01>> map = new LinkedHashMap<String, List<Student01>>();
		
		List<Student01> feList = new ArrayList<Student01>();
		feList.add(new Student01(1, "Ram", 90));
		feList.add(new Student01(2, "Shyam", 80));
		map.put("FE", feList);
		
		List<Student01> seList = new ArrayList<Student01>();
		seList.add(new Student01(1, "Ganesh", 70));
		seList.add(new Student01(2, "Mangesh", 60));
		map.put("SE", seList);
		
		for(Map.Entry<String, List<Student01>> entry : map.entrySet()) {
			System.out.println("Class : "+entry.getKey());
			System.out.println("-------------------");
			System.out.println("Id\tName\tPer");
			for(Student01 stud : entry.getValue()) {
				System.out.println(stud);
			}	
			System.out.println();
		}
				
	}
}
