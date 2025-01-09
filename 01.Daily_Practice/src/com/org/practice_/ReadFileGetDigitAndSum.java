package com.org.practice_;

import java.io.BufferedReader;
import java.io.FileReader;

//Write a program to read the text file using a BufferedReader and extract the digit from it and calculate its sum

public class ReadFileGetDigitAndSum {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("src\\com\\org\\practice_\\info.txt"));
		int data;
		int sum = 0;
		while((data=br.read())!=-1) {
			
			if(data>='0' && data<='9') {
				sum = sum+data-'0';
			}
		}
		System.out.println("Sum of Digit is :: "+ sum);
	}
}
