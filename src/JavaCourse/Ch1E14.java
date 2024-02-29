package JavaCourse;

public class Ch1E14 {

	public static void main(String[] args) {
		int p=1000;
	
		int interest=5;
		int total=0;

 for(int i=1;i<=3;i++) {
	 
	 total=p+(p*interest/100);
	 System.out.println("Balance of the account after "+i+" year is : "+total);
	 p=total;
 }

	}

}
