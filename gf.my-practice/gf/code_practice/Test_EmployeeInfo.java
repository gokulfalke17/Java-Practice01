package gf.code_practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test_EmployeeInfo {
	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		p.setProperty("EID", "1011");
		p.setProperty("ENAME", "RAM");
		p.setProperty("COMPANY", "INFOSYS");
		p.setProperty("SALARY", "120000");
		p.store(new FileWriter("EmpInfo.properties"), "This is Employee Details...");
		System.out.println("Data Save Successfully...");
		
/*	=======================================================================================================================	*/		
		
		p.load(new FileReader("EmpInfo.properties"));
		int empId = Integer.parseInt(p.getProperty("EID"));
		String eName = p.getProperty("ENAME");
		String companyName = p.getProperty("COMPANY");
		double empSalary = Double.parseDouble(p.getProperty("SALARY"));
		
		System.out.println("---Employee Information---");
		System.out.println("EMPLOYEE ID :"+empId);
		System.out.println("EMPLOYEE NAME :"+eName);
		System.out.println("COMPANY NAME :"+companyName);
		System.out.println("EMPLOYEE SALARY :"+empSalary);
	}
}
