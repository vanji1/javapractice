 package JavaPractice;

public class ExceptionHandling {

	public String name="tom";

	public static void main(String[] args) {
		ExceptionHandling e1=new ExceptionHandling();
		
		
		System.out.println("A");
		System.out.println("B");
		try {
			e1=null;
			System.out.println(e1.name);
		
		}
		catch(Exception e) {
			e.printStackTrace();
			 System.out.println(e.getMessage());	
			 }
		
		System.out.println("C");
		System.out.println("D");
		System.out.println("E");
	}

}
