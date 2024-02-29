package InterviewQuestions;

public class Factorial {

	public static void main(String[] args) {

		// 3! = 3*2*1
		int num=7;
		int f=1;
		for (int i=1;i<=num;i++) {
			f=f*i;
		}
		System.out.println(f);
	}

}
