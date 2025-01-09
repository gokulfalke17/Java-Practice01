package company.programming.test;

import java.util.ArrayList;
import java.util.List;

/*
Input "Wow, this is a radar and level test. Madam!"
Output: ['wow', 'radar', 'level', 'madam']
*/

public class PalindromeArrayList {

    public static void main(String[] args) {

        String str = "Wow, this is a radar and level test. Madam!".toLowerCase();


        String[] split = str.split(" ");


        List<String> palindromeString = new ArrayList<String>();


        for (String word : split) {

            StringBuilder newWord = new StringBuilder();


            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                

                if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                    newWord.append(ch); 

                }
            }


            String s = newWord.toString();
            int start = 0;
            int end = s.length() - 1;
            boolean flag = true;


            while (start < end) {
                if (s.charAt(start) != s.charAt(end)) {
                    flag = false; 
                    break;
                }
                start++;
                end--;
            }

            if (flag && s.length() > 1) {
                palindromeString.add(s);
            }
        }


        System.out.println(palindromeString);
    }
}
