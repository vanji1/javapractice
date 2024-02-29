package JavaPractice;

public class StaticNonStaticMember {

	// Static variable
		public static String name = "Selenium";
		public static int number=10;
		
		// Non static variable
		public int version = 3;
		
		// Static method
		public static void printName()
		{
			System.out.println("Name is :"+name);
			number=number+2;
			System.out.println("Number is :"+ number);
			
		}
	 
		// Non static method
		public void printVersion()
		{
			version=version+1;
			System.out.println("Version is : "+version);
			number=number+2;
			System.out.println("Number is :"+ number);
		}
		
		
		public static void main(String[] args) {
			
			// Can call static members with class name
			//System.out.println(StaticNonStaticMember.name);
			StaticNonStaticMember.printName();
			
					
			// Creating an object of class. We can call members using object name
			StaticNonStaticMember sm = new StaticNonStaticMember();
			StaticNonStaticMember sm1 = new StaticNonStaticMember();
						
			// Object name should be used to call non static members of class
			System.out.println(sm.version);
			sm.printVersion();
			sm1.printVersion();
			sm.printVersion();
			StaticNonStaticMember.printName();
			
		}
	
		
		
		
		
	}


