package Inheritence;

public interface LearnInterface {

	public void fly();
	
	 default void run() {
		 System.out.println("run");
	 }
	 default void walk() {
		 System.out.println("walk");
	 }
	 
	 default void walk1() {
		 System.out.println("walk1");
	 }
	 default void walk2() {
		 System.out.println("walk1");
	 }
	 
	 static void sit() {
		 System.out.println("sit");
	 }
	 static void sit1() {
		 System.out.println("sit1");
	 }
	 static void sit2() {
		 System.out.println("sit2");
	 }
}

