package InterviewQuestions;

public class PrintPatternLoop {

	public static void main(String[] args) {
		
		
		for(int i=10;i>=1;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print("#");
		}
		System.out.println();	

	}
		//print tables using printf print format
		int n=50;
		for(int i=1;i<=10;i++) {
		System.out.printf("%d x %d = %d%n",n,i,n*i);
	}
}
}
