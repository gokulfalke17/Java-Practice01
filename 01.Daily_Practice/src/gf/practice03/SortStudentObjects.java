package gf.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student {
	private int sid;
	private String sname;
	private String saddress;
}

public class SortStudentObjects {
	
	public static void main(String[] args) {
			
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "sanket", "beed"));
		list.add(new Student(103, "yashraj", "kolhapur"));
		list.add(new Student(104, "karan", "bulthana"));
		list.add(new Student(102, "akash", "beed"));
		list.add(new Student(105, "ganesh", "nanded"));
		
		System.out.println("Student Sort Using SId :: ");
		list.sort((o1, o2)->o1.getSid()-o2.getSid());
		list.forEach(stud -> System.out.println(stud));
		System.out.println();
		
		System.out.println("Student Sort Using SName :: ");
		Collections.sort(list,  new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getSname().compareTo(o2.getSname());
			}
		});
		
		list.forEach(stud -> System.out.println(stud));
		System.out.println();
		
		System.out.println("Student Sort Using SAddress :: ");
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getSaddress().compareTo(o2.getSaddress());
			}
		});
		list.forEach(stud -> System.out.println(stud));
	}
}
