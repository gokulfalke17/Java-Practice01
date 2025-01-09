package gf.practice01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader fr = new FileReader("main.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null) {
			Thread.sleep(100);
			System.out.print(line+"");
			line = br.readLine();
		}
	}
}

