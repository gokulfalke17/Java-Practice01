package gf.collection;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties class is a Legacy collection,
 * It is sub class of Hashtable 
 * 
 * It is used for storing Properties of an object
 * and further saving and loading those properties
 * in/from a file permanently
 * 
 * A property is a (name=value) pair
 * Each property must be placed in one line
 * 
 * For Example :
 * 	  SNO=101
 * 	  SNAME="HK"
 * 	  COURSE="CJ"
 * 	  FEE=3500
 * 
 * For storing above properties we must use Properties class object
 * 
 * This difference between Hashtable and Properties class is 
 * Hashtable accept all types of objects
 * Properties accepts only String type key and value only
 * because file can understand only text.
 * 
 * For storing and retrieving properties, Properties class has provided
 *  below 2 important methods
 *  	1. public String setProperty(String name, String value)
 *  	2. public String getProperty(String name)
 * 
 * 
 * */
public class Test17_Properties_Store {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		
		p.setProperty("SNO", "101");
		p.setProperty("SNAME", "HK");
		p.setProperty("COURSE", "CJ");
		p.setProperty("FEE", "3500");
		
		//System.out.println(p);
		p.store(new FileWriter("Student.properties"), "Student Info");
		System.out.println("Properties are Saved Successfully.....");
	}
}	
