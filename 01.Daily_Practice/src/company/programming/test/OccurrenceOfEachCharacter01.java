package company.programming.test;

public class OccurrenceOfEachCharacter01 {

	public static void main(String[] args) {

		/*		String str = "Engineering".toLowerCase();
				int count[] = new int[26];
				
				for(int i=0; i<str.length(); i++) {
					char ch = str.charAt(i);
					if(ch>='a' && ch<='z') {
						count[ch-'a']++;
					}
				}
				
				for(int i=0; i<count.length;i++) {
					if(count[i]>0) {
						System.out.print((char)(i+'a')+""+count[i]);
					}
				}
		*/

		String str = "Engineering".toLowerCase();
		
		boolean[] flag = new boolean[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if (!flag[i]) {
				char ch = str.charAt(i);
				int count = 1;

				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(j) == ch) {
						count++;
						flag[j] = true;
					}
				}

				System.out.print(ch + "" + count);
			}
		}

	}
}
