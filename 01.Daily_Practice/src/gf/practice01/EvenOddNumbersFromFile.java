package gf.practice01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOddNumbersFromFile {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\number.bat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<Integer> list = Arrays.asList(34, 33, 12, 19, 5, 2, 23, 55, 43, 42, 70);
		
		oos.writeObject(list); 
		
		System.out.println("List Stored in File...");
		
		FileInputStream fis = new FileInputStream("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\number.bat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		if(obj instanceof List<?>) {
			List<Integer> num = (List<Integer>)obj;
			List<Integer> evenNum = new ArrayList<Integer>();
			List<Integer> oddNum = new ArrayList<Integer>();
			
			for(int number : num) {
				if(number%2==0) {
					evenNum.add(number);
				}else {
					oddNum.add(number);
				}
				
			}
			
			System.out.println("Even Numbers : ");
			System.out.print(evenNum+" ");
			System.out.println();
			
			System.out.println("\nOdd Numbers : ");
			System.out.print(oddNum+" ");
			
		}
		
	}
}
