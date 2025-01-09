package gf.practice01;

public class CountLengthOfLastWord {

	public static void main(String[] args) {

		String str = "   India    is     my      Country      ";
		int count = 0; 
		boolean flag = false;
		for (int i=str.length()-1; i > 0; i--) {
			char ch = str.charAt(i);
			if (ch == ' ' && flag) {
				break;
			}else if(ch!=' ') {
				flag = true;
				count++;
			}
		}
		System.out.println(count);
	}
}
