package InterviewQuestions;

public class SwapTwoIntegers {
	
	public static void main(String[] args) {
		//method 1
		int a=6;
		int b=7;
		System.out.println("Swapped a value is: " +( (a+b)-a));
		System.out.println("Swapped b value is: " + ((a+b)-b));
		
		//Method 2
		int x=a;
		a=b;
		b=x;
		System.out.println(a+""+b);
		
		//Method 3:
		
		int i=7;
		int j=9;
		i=i*j; // i=63
		j=i/j; // 63/9=7
		i=i/j; // 63/7=9
		
		System.out.println(i+""+j);
		
	}

}
