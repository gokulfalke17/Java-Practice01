package gf.pattern;

import java.util.Iterator;

public class Test07_pattern {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=13;i++) {
			for(int j=1;j<=7;j++) {
				if(j>=8-i && j>=i-6) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
//		for(int i=1;i<=13;i++) {
//			char ch = 'A';
//			for(int j=1;j<=7;j++) {
//				if(j>=8-i && j>=i-6) {
//					System.out.print(ch++);
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
	}
}
