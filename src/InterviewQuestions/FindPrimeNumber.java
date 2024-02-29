package InterviewQuestions;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=104;
		int flag=0;
		for(int i=2; i<n/2;i++) {
			if((n%i)==0){
				flag=1;
				break;
			}
		}
			
			if(flag==1) {
			System.out.println(n + " is a not prime number");
			}
			else {
				System.out.println(n+" is a prime number");

			}
				
					
		}
	}

