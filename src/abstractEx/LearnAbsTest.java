package abstractEx;

import Inheritence.LearnInterface;

public class LearnAbsTest extends LearnAbs implements LearnInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void foo() {
		System.out.println("foo");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("foo");
	}

}
