package gf.practice04_;

public class PrintLongestWord {

	public static void main(String[] args) {

		String str = "i love dogs";
		// love

		String s = "";
		String word = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				s = s + str.charAt(i);
			} else {
				if (s.length() > word.length()) {
					word = s;
				}
				s = "";
			}
		}
		System.out.println("Longest Word is :: \n"+ word);

	}
}
