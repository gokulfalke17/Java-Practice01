package com.org.practice_;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

//WAP to create list collection and store the 5 employee data  in it and display the employee whose salary is greater than 10000 and display it using Stream API

class Employee {

	int id;
	String name;
	int salary;

	public Employee() {

	}

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [ id=" + id + ", name=" + name + ", salary=" + salary + " ] ";
	}

}

public class FindGretherEmployeeSalaryUsingStreamAPI {
	public static void main(String[] args) {

		/*List<Employee> list = Arrays.asList(new Employee(101, "abc", 10000), new Employee(102, "mno", 80000),
				new Employee(103, "xyz", 5000), new Employee(104, "pqr", 14000), new Employee(105, "stv", 20000));
		*/

//		Stream<Employee> stream = list.stream();

		/*
		Stream<Employee> filter = stream.filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getSalary()>10000;
			}
		});
		
		filter.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee t) {
				System.out.println(t);
				
			}
		});
		*/

		/*Stream<Employee> filter = stream.filter((t)->t.getSalary()>10000);
			
		
		filter.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee t) {
				System.out.println(t);
				
			}
		});*/
		/*
		Stream<Employee> filter = stream.filter((t) -> t.getSalary() > 10000);
			
		filter.forEach((t) -> System.out.println(t));
		*/

		/*
		stream.filter((t) -> t.getSalary() > 10000).forEach((t) -> System.out.println(t));
		*/

		Arrays.asList(new Employee(101, "abc", 9000), new Employee(102, "mno", 80000), new Employee(103, "xyz", 5000),
				new Employee(104, "pqr", 14000), new Employee(105, "stv", 20000)).stream()
				.filter((t) -> t.getSalary() > 10000).forEach((t) -> System.out.println(t));

	}
}
