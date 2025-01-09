package gf.code_practice;

public class Test_ConvertLwrToUprAndUprToLwr {
	public static void main(String[] args) {
		
		String str = "@AviPawar0808@Gmail.Com";
		
		char ch[] = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i] = (char) (ch[i]-32);
			}else if(ch[i]>='A' && ch[i]<='Z'){
				ch[i] = (char) (ch[i]+32);
			}
		}
		
		for(int i=0;i<ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
