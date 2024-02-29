package JavaPractice;

public class DemoChild extends Demo{
int value3;
int value4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoChild d1=new DemoChild();
		d1.display();
	}
	public DemoChild() {
		super(20,30);
		value3=3;
		value4=4;
		System.out.println("Inside Child constructor");
	}
	
	public void display() {
		System.out.println("value1 is: "+value1);
		System.out.println("value2 is: "+value2);
		System.out.println("value3 is: "+value3);
		System.out.println("value4 is: "+value4);
		
	}

}
