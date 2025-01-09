package gf.practice01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbersFromList {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fos = new FileOutputStream("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\number.bat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<Integer> list = Arrays.asList(13, 33, 12, 19, 5, 20, 23, 52, 43, 57, 64);

		oos.writeObject(list);

		System.out.println("List Stored in File...");
		System.out.println();

		FileInputStream fis = new FileInputStream("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\number.bat");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();
		if (obj instanceof List<?>) {
			List<Integer> num = (List<Integer>) obj;
			List<Integer> prime = new ArrayList<Integer>();
			
			for(int number : num) {
				boolean flag = true; 
				if(number < 2) {
					flag = false;
				}else {
					for(int i=2; i*i <= number; i++) {
						if(number%i==0) {
							flag = false;
							break;
						}
					}
				}
				
				if(flag) {
					prime.add(number);
				}
			}
			
			System.out.println("prime Numbers : ");
			System.out.print(prime + " ");
			System.out.println();
		}
	}
}
