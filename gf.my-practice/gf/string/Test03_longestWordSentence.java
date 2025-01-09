package gf.string;

public class Test03_longestWordSentence {

    public static void main(String[] args) {
//        String str = "  welcome    to   girish   techhub   ";
//        String str = "  i    love   my   country   ";
//        String str = "  ab k  ";
        String str = "  Hello chintapandumdum ,  Good   Morning  ";
        
        String longWord = "";
        String s = "";

        
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)!=' ') {
        		s = s+str.charAt(i);
        	}else {
        		if(s.length() > longWord.length()) {
        			longWord = s;
        		}
        		s = "";
        	}
        }
        
       /* if(s.length() > longWord.length()) {
        	longWord = s;
        } */

        System.out.println("Longest Word :: "+longWord);
    }
}
