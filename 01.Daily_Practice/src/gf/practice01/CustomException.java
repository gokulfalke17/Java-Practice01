package gf.practice01;

class YoungException extends RuntimeException {
	public YoungException(String s) {
		super(s);
	}
}

class OldException extends RuntimeException {
	public OldException(String s) {
		super(s);
	}
}

public class CustomException {
	
	public static void main(String[] args) {
		
		int age = Integer.parseInt(args[0]);
		if(age > 60) {
			throw new YoungException("please wait some more time.... you will get best match ");
		}else if(age < 18) {
			throw new OldException("You are age already crossed... no chance to getting married ");
		}else {
			System.out.println("let you know... you will get details on your mail id...");
		}
		
	}
}
