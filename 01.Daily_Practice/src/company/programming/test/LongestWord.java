package company.programming.test;

public class LongestWord {
	
	public static void main(String[] args) {
		
		String str = "Good Morning nagapur India";
		
		String[] split = str.split(" ");
		String longest = "";
		
		for(String word : split) {
			if(word.length() > longest.length()) {
				longest = word;
			}
		}
		
		System.out.println("Longest Word is :: "+ longest);
	}
}
