package javaPractice1;

public class FindDigitPresentInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1Hi how are you 8976";
		
		int counter=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>'0'&& s.charAt(i)<'9'){
				counter=counter+1;
				}
		}
		
		if(counter>0) {
			System.out.println("There are digits present");
		}
		else {
			System.out.println("There are no digits present");
		}

	}

}
