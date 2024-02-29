package InterviewQuestions;

public class PrimeNumberGeneration {

	public static void main(String[] args) {
		
			
			int n=100;
			//int flag=0;
			
			String prime="";
			for(int num=1;num<=n;num++) {
				int counter=0;
				
			for(int i=1; i<=num;i++) {
				if(num%i==0){
					counter=counter+1;
				}
			}
				
				if(counter==2) {
					prime=prime+" "+num;
					
				}
										
			}
			
			
			System.out.println(prime);

	}

}
