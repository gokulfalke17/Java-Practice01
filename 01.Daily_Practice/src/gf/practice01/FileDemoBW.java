package gf.practice01;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemoBW {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("main.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char ch[] = {'g', 'o', 'o', 'd'};
		bw.write(ch);
		bw.newLine();
		bw.write("India is my Country...");
		bw.flush();
		System.out.println("Data Write Successfully...");
	}
}
