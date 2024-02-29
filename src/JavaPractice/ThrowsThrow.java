package JavaPractice;

public class ThrowsThrow {

	public static void main(String[] args) throws Exception {
		
	Demo();
	}
	
	public static void Demo()  {// throws ArithmeticException, NullPointerException{
		System.out.println("inside demo method");
		try {
		//int i=9/0;
		throw new Exception("Error Occured");
	}catch(Exception e) {
		
		e.printStackTrace();
		System.out.println(e.getLocalizedMessage()+"error in catch blcok");
	}
		finally {
			System.out.println("executing finally block..");
		}
	}
}
