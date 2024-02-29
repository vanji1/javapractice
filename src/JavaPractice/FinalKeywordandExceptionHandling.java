package JavaPractice;

public class FinalKeywordandExceptionHandling {
	
	public static void main(String[] args) {
		
		
		int a=5;
		final int b=6;
		System.out.println(a++);
	
		
		
		
		System.out.println("A");
		try {
		int i=9/0;
		}
		catch(Exception e) {
			System.out.println("some error occured");
			e.getMessage();
			e.printStackTrace();
		}
		System.out.println("B");
		
	}

}
