package gf.code_practice;

class VoterException extends Exception {
	
		public String getMsg() {
			return "MyException age must be < 18 Not Eligible........";
		}
}

class VerifyVoter {
	public void verifyAge(int age) throws VoterException {
		
		if(age < 18) {
			VoterException ve = new VoterException();
			throw ve;
		}else {
			System.out.println("You are Eligible for Voting");
		}
		
	}
 }

public class Test01_userException {
	public static void main(String[] args) {
		
		VerifyVoter voter = new VerifyVoter();
		try {
			voter.verifyAge(16);
		} catch (VoterException ve) {
				System.out.println(ve.getMsg());
		}
	}
}
