package com.org.practice_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

//Write a program to read the text file using BufferedReader and find the repetitive word from file and use the LinkedHashMap ?

public class FindRepetativeWordInFileUsingLinkedHashMap {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("src\\com\\org\\practice_\\info.txt"));
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		String data;
		while((data=br.readLine())!=null) {
			String[] word = data.toLowerCase().split(" ");
			
			for(String words : word) {
				if(!words.isEmpty()) {
					if(lhm.containsKey(words)) {
						lhm.put(words, lhm.get(words)+1);
					}else {
						lhm.put(words, 1);
					}
				}
			}
		}
		br.close();
		
		System.out.println("Repetetive Word Count is :: ");
		for(Map.Entry<String, Integer> entry : lhm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" --> "+ entry.getValue());
			}
		}
		
	}
}
