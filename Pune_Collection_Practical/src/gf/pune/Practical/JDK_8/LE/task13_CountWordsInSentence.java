package gf.pune.Practical.JDK_8.LE;

//13. Write a Java program to implement a lambda expression to count words in a sentence.
interface CountWord {
	void count(String str);
}
public class task13_CountWordsInSentence {
	static int count=0;
	public static void main(String[] args) {
		
		/*CountWord cw = new CountWord() {
			@Override
			public void count(String str) {
				
				for(int i=0; i<str.length(); i++) {
					if(i==str.length()-1 || str.charAt(i)==' ')
						count++;
				}
			}
		};
		
		cw.count("Welcome to giris tech hub");
		System.out.println("Word in sentence is : "+ count);*/
		
		/*CountWord cw = (String str)->{
				for(int i=0; i<str.length(); i++) {
					if(i==str.length()-1 || str.charAt(i)==' ')
						count++;
				}
			};
		cw.count("Welcome to giris tech hub");
		System.out.println("Word in sentence is : "+ count);*/
		
		CountWord cw = str->System.out.println("Number of Words in Sentence : "+str.split(" ").length);
		cw.count("Welcome to giris tech hub");

		
		
	}
}
