package InterviewQuestions;

public class ArmsrtongNumber {

	public static void main(String[] args) {
		int number=123;
		int n=number;
		int n1=0;
		int num=0;
		while(n!=0) {
			n1=n%10;
			 num=num+n1*n1*n1;
			n=n/10;
			}
		
		System.out.println(number);
		System.out.println(num);
		
		if (num==number)
		{
			System.out.println(num+ " the no is a armstrong number");
		}
		else
			System.out.println(num + " is not a armstrong number");
	}

}
