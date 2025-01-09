package gf.practice02;

public class StringOccurrence {

	public static void main(String[] args) {

		String str = "good morning";
		char ch[] = str.toCharArray();
		int len[] = new int[ch.length];

		for (int i = 0; i < ch.length; i++) {
			len[i] = '\0';
		}

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			if(ch[i]!='\0') {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
						len[j] = '\0';
					}
				}

				len[i] = count;
			}
		}

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '\0' && ch[i] != ' ') {
				System.out.println(ch[i] + " --> " + len[i]);
			}
		}
	}
}
