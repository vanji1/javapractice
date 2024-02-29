package javaPractice1;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		int number=300;
		int number1=number;
		int n=0;
		int r=0;
		while(number!=0) {
			
			r=number%10;
			number=number/10;
			n=n+(r*r*r);
		}
		System.out.println(number1);
System.out.println(n);

if(n==number1) {
	System.out.println(n+" is a armstrong no");
}
else {
	System.out.println(n+" is not a armstrong no");
}


for(int i=1;i<10;i++) {
	if (i>0 && i<=9) {
		    number=i;
		    int rr=0;
			while(i!=0) {
				rr=number%10;
				number=number/10;
				n=n+(rr*1);
		}
		if (i==n) {
			System.out.println(n);
		}
	}
	
	if (i>10 && i<=99) {
	    number=i;
	    int rr=0;
		while(i!=0) {
			rr=number%10;
			number=number/10;
			n=n+(rr*rr);
	}
	if (i==n) {
		System.out.println(n);
	}
}

	
}


	}
	}
