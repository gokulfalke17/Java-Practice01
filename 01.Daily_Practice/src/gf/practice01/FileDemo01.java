package gf.practice01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo01 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileWriter fw = new FileWriter("demo.txt", true);
		
		System.out.println("Data Write Successfully....");
		
		FileReader fr = new FileReader("demo.txt");
		int i= fr.read();
		while(i!=-1) {
			Thread.sleep(100);
			System.out.print((char)i+"");
			i = fr.read();
		}
		
	}
}
