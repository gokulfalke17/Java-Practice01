package com.org.practice_;

import java.io.BufferedReader;
import java.io.FileReader;

//Read the text file and find the vowels and consonant from file

public class ReadTxtFileFindVowelsAndConsonentFileIO {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("src\\com\\org\\practice_\\info.txt"));
		int data;
		int vCount = 0;
		int cCount = 0;
		int nCount = 0;

		while ((data = br.read()) != -1) {
		    char ch = (char) data;
		    
		    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
		        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
		        vCount++;
		    }else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
		        cCount++;
		    }else if (Character.isDigit(ch)) {
		        nCount++;
		    }
		}
		System.out.println("Vowels Count : " + vCount);
		System.out.println("Consonant Count : " + cCount);
		System.out.println("Number Count : " + nCount);
	}
}
