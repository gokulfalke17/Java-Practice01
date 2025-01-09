package com.org.practice_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Write a program to Read file using BufferedReader and find the number words from file

public class FindnumberOfWordsInFile {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("src\\com\\org\\practice_\\file.txt"));
		int count = 0;
		String data;
		while((data=br.readLine())!=null) {
			String[] word = data.split(" ");
			count = count+word.length;
		}
		
		System.out.println("Number of Words are :: "+ count);
	}
}
