package company.programming.test;

/*
Input : Hello World
Output : World Hello
*/

public class ReverseSentences {

	public static void main(String[] args) {

		String str = "Hello World";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev); // dlroW olleH

		char[] ch = rev.toCharArray();

		int start = 0;
		int end = 0;
		for (int i = 0; i <= rev.length(); i++) {
			if (i == ch.length || ch[i] == ' ') {
				end = i - 1;
				while (start < end) {
					char temp = ch[start];
					ch[start] = ch[end];
					ch[end] = temp;
					start++;
					end--;
				}
				start = i + 1;
			}
		}

		String s = new String(ch);
		System.out.println("After Reversing String :: " + s); // Word Hello

	}
}
