package JavaPractice;

public class Demo {

	      int  value1;
	      int  value2;
	      
public Demo(){
	         value1 = 10;
	         value2 = 20;
	         System.out.println("Inside Constructor");
	     }

public Demo(int a, int b) {
	value1=a;
	value2=b;
	System.out.println("Inside int int constructor");
}

public Demo(int a) {
	value1=a;
	System.out.println("Inside int constructor");
}
	 
public void display(){
	        System.out.println("Value1 === "+value1);
	        System.out.println("Value2 === "+value2);
	    }
	 
 public static void main(String args[]){
	    Demo d1 = new Demo();
	      d1.display();
	      
	      Demo d2=new Demo(3);
	      d2.display();
	      
	      Demo d3=new Demo(40,50);
	      d3.display();
	  }
	}

