package com.org.practice_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
  Write a Program to Create HashMap and store student id as key and student name as value and display it?
*/

class Student {
	private Integer studId;
	private String studName;

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	@Override
	public String toString() {
		return "Student [ studId=" + studId + ", studName=" + studName + " ] ";
	}

}

public class IdAsKeyAndNameAsValue_StudentUsingHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		Student stud = new Student();
		
		stud.setStudId(101);
		stud.setStudName("Ramesh");
		hm.put(stud.getStudId(), stud.getStudName());
		
		stud.setStudId(102);
		stud.setStudName("Ganesh");
		hm.put(stud.getStudId(), stud.getStudName());
		
		System.out.println("Student Records :: ");
		for(Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+"   "+ entry.getValue());
		}
		
		

	}
}
