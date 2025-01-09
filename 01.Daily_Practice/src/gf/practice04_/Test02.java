package gf.practice04_;

public class Test02 {

	public static void main(String[] args) {

		String str = "I love mumbai nagpur";

		String[] s = str.split(" ");

		String word = "";
		int max = 0;
		for (int i = 0; i < s.length; i++) {

			if(s[i].length() > max)  {
				max = s[i].length();
				word = s[i];
			}
		}
		
		System.out.println(word);


	}
}
