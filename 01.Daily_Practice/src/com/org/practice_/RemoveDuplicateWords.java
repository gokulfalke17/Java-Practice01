package com.org.practice_;
/*
Q5.Java Program to Remove Duplicate Words from String
 Example:
  Original String: Java is great and Java is fun and Java is powerful
  String after removing duplicates: Java is great and fun powerful

*/
public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
        String str = "Java is great and Java is fun and Java is powerful";
        String words[] = str.toLowerCase().split(" ");
        System.out.println("String is :: " + str);
        System.out.println();

        boolean[] flag = new boolean[words.length];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (!flag[i]) { 
                result.append(words[i]).append(" ");
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        flag[j] = true;
                    }
                }
            } 
        }
        System.out.println("Removing Duplicate Words :: "+result.toString());
    }
}
