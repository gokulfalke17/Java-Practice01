package gf.pune.Practical.JDK_8.LE;

//17. Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface CountWordLength {
	void findLongestSmallestWord(List<String> list);
}

public class task17_WordLengthCountLongestSmallest {

	static List<String> list = new ArrayList<String>(Arrays.asList("sanket", "yeshraj", "giris tech hub", "ganesh", "rahul", "Avi", "gokul"));

	static String longWord = "";
	static String smallWord = list.get(0);

	public static void main(String[] args) {


		/*CountWordLength cwl = new CountWordLength() {
			@Override
			public void findLongestSmallestWord(List<String> list) {
				
				for(String str : list) {
					if(longWord.length() < str.length()) {
						longWord = str;
					}
					
					if(smallWord.length() > str.length()) {
						smallWord = str;
					}
				}
				
				System.out.println("Longest Word is : "+ longWord);
				System.out.println("Smallest Word is : "+ smallWord);
			}
		};
		cwl.findLongestSmallestWord(list);*/

		/*CountWordLength cwl = (lst)->{
				
				
				for(String str : list) {
					if(longWord.length() < str.length()) {
						longWord = str;
					}
					
					if(smallWord.length() > str.length()) {
						smallWord = str;
					}
				}
				
				System.out.println("Longest Word is : "+ longWord);
				System.out.println("Smallest Word is : "+ smallWord);
			};
		cwl.findLongestSmallestWord(list);*/

		/*CountWordLength cwl = (lst)->{
			for(String str : list) {
				if(longWord.length() < str.length()) {
					longWord = str;
				}
				
				if(smallWord.length() > str.length()) {
					smallWord = str;
				}
			}
			
			System.out.println("Longest Word is : "+ longWord);
			System.out.println("Smallest Word is : "+ smallWord);
		};
		cwl.findLongestSmallestWord(list);*/

		/*CountWordLength cwl = (lst)->{
			for(String str : list) {
				longWord = (longWord.length() < str.length()) ? str : longWord;
				smallWord = (smallWord.length() > str.length()) ? str : smallWord; 
					
			}
			System.out.println("Longest Word is : "+ longWord);
			System.out.println("Smallest Word is : "+ smallWord);
		};
		cwl.findLongestSmallestWord(list);*/ 


		/*CountWordLength cwl = (lst) -> {
			for (String str : list) {
				longWord = (longWord.length() < str.length()) ? str : longWord;
				smallWord = (smallWord.length() > str.length()) ? str : smallWord;
		
			}
			
		};
		cwl.findLongestSmallestWord(list);
		System.out.println("Longest Word is : " + longWord);
		System.out.println("Smallest Word is : " + smallWord);*/
		
		
		CountWordLength cwl = (lst) -> {
			for (String str : list) {
				longWord = (longWord.length() < str.length()) ? str : longWord;
				smallWord = (smallWord.length() > str.length()) ? str : smallWord;
		
			}
		};
		cwl.findLongestSmallestWord(list);
		System.out.println("Longest Word is : " + longWord+"\nLong Word Length is : "+longWord.length());
		System.out.println();
		System.out.println("Smallest Word is : " + smallWord+"\nSmall Word Length is : "+smallWord.length());

	}
}
