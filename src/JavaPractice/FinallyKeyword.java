package JavaPractice;

public class FinallyKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 //		catch(Throwable e) {
//			e.printStackTrace();
//		}
		
//		finally {
//			System.out.println("finally block");
//		}
		
		
		int p=50;
		
		try {
			int div=p/50;
		}
		catch(Exception e)
		{
		}
		//System.out.println("hello");
		finally {
			System.out.println("finally block");
		}
		System.out.println("going to run after finally block");
		
		}
		


		
	}

