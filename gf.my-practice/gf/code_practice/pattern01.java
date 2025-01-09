package gf.code_practice;

class pattern01 {
	
	public static void main(String[] args) {
		
		boolean flag = true;
		for(int i=1; i<=7; i++) {
			int k=i;
			for(int j=1; j<=13; j++) {
				if(j>=8-i && j<=6+i && flag) {
					System.out.print(k++);
					flag = false;
				}else {
					System.out.print(" ");
					flag = true;
				}
			}
			System.out.println();
		}
	}
}

