package gf.practice01;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		int count = 0;
		File f = new File("F:\\Study material\\Hyd-Study-Contents\\Durga sir Notes");
		String list[] = f.list();
		for(String l : list) {
			count++;
			System.out.println(l);
		}
		System.out.println();
		
		System.out.println("Total Files : "+ count);
	}
}
