package InterviewQuestions;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=78998;
		int r=0;
		while(n!=0) {
			r=r*10+n%10;
			n=n/10;
		}
		
		System.out.println(r);
		
		if(r==n) {
			System.out.println("palindrome");
		
		}
		else
			System.out.println("not palindrome");

		
		

	}

}
