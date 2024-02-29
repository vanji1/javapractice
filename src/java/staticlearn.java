package java;

public class staticlearn {
	
	
	
	//static variables will be created as class variables not in main
	//common value of a property should be created a static variables
	//only common methods should be written as static
	//like wheels every car will have 4 wheels
	
	//static class is not allowed
	
	//static variables will be called using class name
	//static method and variable are stored in CMA Common memory allocation or metaspace
	
	//When JVM starts executing. it loads the class into the memory, it starts reading top to bottom and left to right
	
		
	static int wheels=7;
	String name;
	String color;
		
	
	public static void getInfo() {
		System.out.println(".......get ifno"); 
	}
	
	// static block - this block gets executed before main method
	
	static {
		System.out.println("this is statuc block in java and this statuc block gets executed before main method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    staticlearn s1 = new staticlearn();
    s1.name = "toyota";
    s1.color = "black";
    
    staticlearn s2 = new staticlearn();
    s2.name = "Honda";
    s2.color = "blue";
    
    System.out.println(s1.name + ":"+ s1.color); 
    System.out.println(s2.name + ":"+ s2.color); 
    
    System.out.println(staticlearn.wheels);
    
  //how to call static methods
    getInfo(); // or
    staticlearn.getInfo();
    s1.getInfo(); //we can call static methods using obj ref also but it will give warning not a proper way and it should be avoided
    
	}

}
