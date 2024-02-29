package MethodChaining;


class MethodRepo{
	public MethodRepo printSomething(String name) {
		System.out.println("Name is:"+name);
		//return new MethodRepo();
		return this;
	}
	
	public MethodRepo printAge(int age) {
		System.out.println("Age is : "+age);
		//return new MethodRepo();
		return this;//instead of creting new obj everytime this will return the same obj
	}
	
}
public class Demo {
	public static void main(String[] args) {
		
		MethodRepo mr=new MethodRepo();
	//	mr.printSomething("vanji");
		//mr.printAge(30);
		mr.printAge(40).printSomething("vanji");//method chaining
	}
	


}
