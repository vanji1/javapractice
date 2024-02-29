package java;

public class ClassandObject {

	int i=20; //class variables aka global variables. to access this variable we need objects
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10; //local variable
		System.out.println(i); //this will print local variable
		
		ClassandObject obj = new ClassandObject();
		System.out.println(obj.i);
		
		//class is a template/blueprint/category for all objects
		//like humans, laptop, car, animals,employee, house, phone etc are all classes.
		//class will have properties that will be used to create an object
		//Object - physical entity - like iphone 13, emp 1, cat, me and you are all objects
		

	}

}
