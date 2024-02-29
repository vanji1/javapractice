package Inheritence;

public class LearnInterfaceTest implements LearnInterface {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnInterface lI=new LearnInterfaceTest();
		lI.fly();
		lI.run();
		lI.walk();
		lI.walk1();
		
		LearnInterface.sit();
		LearnInterface.sit1();
		LearnInterface.sit2();
		
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Override fly method");
	}

}
