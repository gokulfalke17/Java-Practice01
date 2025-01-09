package company.programming.test;

//Hello Word

public class ReverseSentence {

	public static void main(String[] args) {

		String str = "Hello Word";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		char ch[] = rev.toCharArray();
		int start = 0;
		for (int i = 0; i < ch.length; i++) {
			if (i == ch.length || ch[i] == ' ') {
				int end = i - 1;
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
		System.out.println(s);
	}

}
