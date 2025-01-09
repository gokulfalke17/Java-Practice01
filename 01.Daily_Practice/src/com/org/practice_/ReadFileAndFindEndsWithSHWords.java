package com.org.practice_;

import java.io.BufferedReader;
import java.io.FileReader;

//Write a program to read the text file using a BufferedReader class and Find the words ends with sh

public class ReadFileAndFindEndsWithSHWords {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("src\\com\\org\\practice_\\info.txt"));
		String data;
		System.out.println("Ends With SH :: ");
		while((data=br.readLine())!=null) {
			String[] word = data.toLowerCase().split(" ");
			
			for(String words : word) {
				if(!words.isEmpty() && words.endsWith("sh")) {
					System.out.println(words);
				}
			}
		}
		
		br.close();
	}
}
