package javaPractice1;

public class PrimeNoGeneration {

	public static void main(String[] args) {
		int limit=10;
		String prime="";
		for(int i=1;i<=limit;i++) {
			int counter=0;
			
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					counter=counter+1;
				}
			}
			
			if(counter==2) {
				prime=prime+" "+i;
			}
			
		}

		System.out.println(prime);
	}

}
