package gf.practice01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CombineTwoFiles {
	 
	 public static void main(String[] args) throws IOException {
		
		 PrintWriter pw = new PrintWriter("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\file3.txt");
		 BufferedReader br = new BufferedReader(new FileReader("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\file1.txt"));
		 String line = br.readLine();
		 while(line!=null) {
			 pw.println(line);
			 line = br.readLine();
		 }
		 
		 br = new BufferedReader(new FileReader("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\file2.txt"));
		 line = br.readLine();
		 while(line!=null) {
			 pw.println(line);
			 line = br.readLine();
		 }
		 
		 System.out.println("...");
	}
}
