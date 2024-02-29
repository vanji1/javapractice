package InterviewQuestions;

public class FindIfDigitsPresentInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="There is no 7856566895";
		
			boolean result=findDigit(s);
			if(result) {
				System.out.println("there are digits");
			}
		
	
		}

		
	public static boolean findDigit(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>'0' && s.charAt(i)>'9') {
				return true;
			}
			else
				return false;
		
		}
		return false;
}
}