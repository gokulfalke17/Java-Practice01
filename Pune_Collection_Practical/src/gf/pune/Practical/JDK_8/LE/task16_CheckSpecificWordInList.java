package gf.pune.Practical.JDK_8.LE;

//16. Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface CheckSpecificWord {
	
	void containsSpecificWord(List<String> list);
}
public class task16_CheckSpecificWordInList {
	static boolean flag = false;
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(Arrays.asList("abc", "mno", "pqr", "stv", "xyz"));
		System.out.println("List is : "+ list);
		String word = "mno";
		
		/*CheckSpecificWord check = new CheckSpecificWord() {
			@Override
			public void containsSpecificWord(List<String> list) {
				
				for(String str : list) {
					if(str == word) {
						System.out.println("Word Found...");
						flag = true;
					}
					if(flag)
						break;
				}
			}
		};
		check.containsSpecificWord(list);*/
		
		CheckSpecificWord check = lst->{
				for(String str : list) {
					if(str.contains(word)) {
						System.out.println("Word Found...");
						flag = true;
					}
					if(flag) 
						break;
				}
			};
		check.containsSpecificWord(list);
		
	}
}
