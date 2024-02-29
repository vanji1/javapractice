package InterviewQuestions;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Hello";
		String b="World";
		System.out.println("The value of a nd b is: " +a+"  "+b);
		//Step 1: concatenate and b
		a=a+b;
		//Step 2: get substring from 0 and ending index is a.length-b.length
		b=a.substring(0, a.length()-b.length());
		//Step 3: get the substring staring form b.length
		System.out.println(b.length());
		a=a.substring(b.length());
		
		System.out.println("The value of a nd b is: " +a+"  "+b);

	}

}
