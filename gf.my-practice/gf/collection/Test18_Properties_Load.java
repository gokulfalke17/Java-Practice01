package gf.collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test18_Properties_Load {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileReader("Student.properties"));
		//System.out.println(p);
		
		int sno = Integer.parseInt(p.getProperty("SNO"));
		String sname = p.getProperty("SNAME");
		String course = p.getProperty("COURSE");
		double fee = Double.parseDouble(p.getProperty("FEE")); 
		
		System.out.println("This is Student Info.");
		System.out.println("SNO 	:"+sno);
		System.out.println("SNAME 	:"+sname);
		System.out.println("COURSE 	:"+course);
		System.out.println("FEE 	:"+fee);
	}
}
