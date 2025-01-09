package company.programming.test;

public class FindFrequencyOfEachCharacter {

	public static void main(String[] args) {

		String str = "Nimap Infotech, Mumbai".toLowerCase();

		char ch[] = str.toCharArray();

		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				continue;
			}
			
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = ' ';
				}
			}

			if (ch[i] != ' ') {
				System.out.println(ch[i] + "-->" + count);
			}
		}

	}
}
