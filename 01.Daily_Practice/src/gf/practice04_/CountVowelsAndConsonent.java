package gf.practice04_;

public class CountVowelsAndConsonent {

	public static void main(String[] args) {

		String str = "programming";
		int cCount = 0;
		int vCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' && str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vCount++;

			} else {
				cCount++;
			}
		}
		
		System.out.println("Vowels are :: "+ vCount);
		System.out.println("Consonent are :: "+ cCount);
	}
}
