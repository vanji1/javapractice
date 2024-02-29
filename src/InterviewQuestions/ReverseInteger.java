package InterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
	
		//using algorithm
		int n=78998;
		int r=0;
		while(n!=0) {
			r=r*10+n%10;
			n=n/10;
		}
		
		System.out.println(r);
		

		
		//using STring Buffer
		
		long num=67776876;
		
		StringBuffer s=new StringBuffer(String.valueOf(num));
		System.out.println(s.reverse());
	}

}

