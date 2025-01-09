package com.org.practice_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//Write a program to Read the text file using a BufferedReader and reverse the every line of file and store in another file

public class ReadFileUsingBufferedReaderAndReverseLines {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("src\\com\\org\\practice_\\file.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("src\\com\\org\\practice_\\file01.txt"));

		String data;
		while ((data = br.readLine()) != null) {

			String reverse = new StringBuilder(data).reverse().toString();

			bw.write(reverse);
			bw.newLine();
		}
		
		br.close();
		bw.close();		
		System.out.println("Data Reversed Successfully...");
	}
}
