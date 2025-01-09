package gf.practice04_;

public class ReverseWordAsItIs {

	public static void main(String[] args) {

		String str = "Good Morning";
		//dooG gninroM
		
		char ch[] = str.toCharArray();

		int start = 0;
		int end=0;
		for (int i = 0; i <= str.length(); i++) {
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

		System.out.println(s);
	}
}
