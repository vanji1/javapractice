 package InterviewQuestions;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		
		
	int a[]= {1,2,3,4,5,6,7};
	
	int sum=0;
	
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println("Sum is: "+sum);
	

	int sum1=0;
	for (int j=1;j<=8;j++) {
		sum1=sum1+j;
	}
	
	System.out.println("Sum1 is: "+sum1);
	System.out.println("Missing Number is: " + (sum1-sum));
}
}
