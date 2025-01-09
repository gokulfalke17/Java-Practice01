package com.org.practice_;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 Write a Program to Create POJO class name as Employee with id,name and sal and store in Set collection 
 and display it and sort employee by its id or run?
*/

public class SortemployeeWithItsIdAndRun {
	
	
	public static void sortById(Set<Employee02> set) {
		List<Employee02> list = new ArrayList<Employee02>(set);
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).getEmpId() > list.get(j).getEmpId()) {
					Employee02 temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		System.out.println("Employee Sorting By Id Wise :: ");
		for(Employee02 emp : list) {
			System.out.println(emp.getEmpId()+"  "+emp.getEmpName()+"  "+emp.getEmpSalary());
		}
		
	}
	
	public static void SortBySalary(Set<Employee02> set) {
		List<Employee02> list = new ArrayList<Employee02>(set);
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).getEmpSalary() > list.get(j).getEmpSalary()) {
					Employee02 temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		System.out.println("Employee Sorting By Salary Wise :: ");
		for(Employee02 emp : list) {
			System.out.println(emp.getEmpId()+"  "+emp.getEmpName()+"  "+emp.getEmpSalary());
		}
			
	}
	
	public static void main(String[] args) {
		
		Set<Employee02> set = new LinkedHashSet<Employee02>();
		set.add(new Employee02(101, "Rajesh", 2000));
		set.add(new Employee02(105, "Suresh", 3000));
		set.add(new Employee02(104, "Ramesh", 4000));
		set.add(new Employee02(102, "Karan", 1000));
		set.add(new Employee02(103, "Ganesh", 2000));

		System.out.println("Employee Records are :: ");
		for (Employee02 emp : set) {
			System.out.println(emp.getEmpId() + "  " + emp.getEmpName() + "  " + emp.getEmpSalary());
		}
		System.out.println();
		
		sortById(set);
		System.out.println();
		
		SortBySalary(set);
	}
}
