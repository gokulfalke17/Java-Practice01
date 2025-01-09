package com.org.practice_;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 Write a Program to Create POJO class name as Employee with id,name and sal and store in Set collection and display it?
*/

class Employee02 {
	private int empId;
	private String empName;
	private int empSalary;

	public Employee02() {
	}

	public Employee02(int empId, String empName, int empSalary) {

		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee02 [ empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + " ] ";
	}

}

public class DisplayEmployeeDataUsingSetCollection {

	public static void main(String[] args) {

		Set<Employee02> set = new LinkedHashSet<Employee02>();
		set.add(new Employee02(101, "Ram", 2000));
		set.add(new Employee02(102, "Suresh", 3000));
		set.add(new Employee02(104, "Ramesh", 4000));
		set.add(new Employee02(105, "Karan", 1000));
		set.add(new Employee02(103, "Ganesh", 2000));

		System.out.println("Employee Records are :: ");
		for (Employee02 emp : set) {
			System.out.println(emp.getEmpId() + "  " + emp.getEmpName() + "  " + emp.getEmpSalary());
		}

	}
}
