package company.programming.test;

public class SmallestWord {
	
	public static void main(String[] args) {
		
		String str = "Good Morning goa India go";

		String[] split = str.split(" ");
		String smallest = split[0];
		
		for(String word : split) {
			if(word.length() < smallest.length()) {
				smallest = word;
			}
		}
		
		System.out.println(smallest);
	}
}
