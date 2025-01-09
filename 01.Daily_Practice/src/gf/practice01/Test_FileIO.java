package gf.practice01;

import java.io.File;
import java.io.IOException;

public class Test_FileIO {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("cricketer.txt");
		System.out.println(f.exists());		//false			//true
		f.createNewFile();
		f.mkdir();
		System.out.println(f.exists());		//true			//true
	}
}
