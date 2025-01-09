package gf.practice04_;

public class LongestWord {
	
	public static void main(String[] args) {
		
		String str = "i love java programming";
		String split[] = str.split(" ");
		int max = 0;
		String maxWord = "";
		
		for(int i=0; i<split.length; i++) {
			if(split[i].length()>max) {
				max = split[i].length();
				maxWord = split[i];
			}
		}
		
		System.out.println(maxWord);
		
	}
}
