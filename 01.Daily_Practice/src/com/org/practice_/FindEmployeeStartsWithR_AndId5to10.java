package com.org.practice_;

import java.util.ArrayList;
import java.util.List;

//Q. WAP to create ArrayList and store 5 employee object and find the employee whose name start with r and id greater than 5 and less than 10?

class Employee01 {
	
	private int id;
	private String name;
	private int salary;
	
	public Employee01() {
		
	}

	public Employee01(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee01 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class FindEmployeeStartsWithR_AndId5to10 {
	
	public static void main(String[] args) {
		
		List<Employee01> list = new ArrayList<Employee01>();
		list.add(new Employee01(1, "suresh", 50000));
		list.add(new Employee01(2, "karan", 10000));
		list.add(new Employee01(3, "sanket", 20000));
		list.add(new Employee01(4, "rajesh", 40000));
		list.add(new Employee01(5, "mno", 30000));
		list.add(new Employee01(6, "ram", 15000));
		list.add(new Employee01(7, "rahul", 50000));
		list.add(new Employee01(8, "ramu", 30000));
		list.add(new Employee01(9, "raju", 80000));
		list.add(new Employee01(10, "yashraj",50000));
		
		int count=0;
		for(Employee01 emp : list) {
			if(emp.getName().startsWith("r") && (emp.getId()>5 && emp.getId()<10)) {
				System.out.println(emp);
				count++;
			}
		}
		
		System.out.println();
		System.out.println("Start With 'r' and id is id>5 & id<10 :: \n"+count);
		
		
		
	}
}
