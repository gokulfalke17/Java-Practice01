package gf.practice01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	String name;
	int age;
	String dob;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}

public class SerializationApp {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//write data in bat file
		FileOutputStream fos = new FileOutputStream("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\ser.bat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s = new Student();
		s.setId(101);
		s.setName("sanket");
		s.setAge(23);
		s.setDob("24-06-2002");

		s.setId(102);
		s.setName("Avishkar");
		s.setAge(23);
		s.setDob("08-10-2002");
		
		oos.writeObject(s);
		
		System.out.println("Data Write Successfuly...");
		System.out.println();
		
		
		//read data from bat file
		FileInputStream fis = new FileInputStream("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\ser.bat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		
		System.out.println("ID\t"+"NAME\t"+"AGE\t"+"DOB");
		if(obj!=null) {
			Student s1 = (Student)obj;
			System.out.println(s1.getId()+"\t"+s1.getName()+"\t"+s1.getAge()+"\t"+s1.getDob());
		}else {
			System.out.println("Threre is No Data...");
		}
		
	}
}
