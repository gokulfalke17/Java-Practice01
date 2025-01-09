package gf.practice01;

public class CountEachWordLengthAndStoredInArray {
	
	public static void main(String[] args) {
		
		String str = "India is my country";
		System.out.println("String is : ");
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+"");
		}
		System.out.println();
		
		System.out.println();
		int count = 0;
		int wordLength = 0;
		int arr[] = new int[str.length()];
		for(int i=0; i<str.length(); i++) {
			if(i!=str.length() && str.charAt(i)!=' ') {
				count++;
			}else if(count > 0) {
				arr[wordLength++] = count;
				count = 0; 
			}
		}
		if(count > 0) {
			arr[wordLength++] = count;
		}
		
		System.out.println("Every Word Length is : ");
		for(int i=0; i<wordLength; i++) { 
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		
 	}
}
