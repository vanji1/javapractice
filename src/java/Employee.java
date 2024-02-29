package java;

public class Employee {
	
	// below class variables and methods  are class properties or class data members
	String name;
	int age;
	double salary;
	char gender;
	
	
	 public int add (int a, int b) {  //int a, int b are called parameters
		 
		 int z=a+b;
		 return z;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee e1 = new Employee();
		e1.name = "tom";
		e1.age = 40;
		e1.salary = 12.44;
		e1.gender = 'F';
		System.out.println(e1.name+ " " + e1.age);
		
		Employee e2 = new Employee();
		System.out.println(e2.name+ " " + e2.age+ " " + e2.salary+" " + e2.gender);
		//if we dont assign value default values will be printed
		//default value for String is null, int is 0, double is 0.0, char is space

		e2=e1;//object ref can be assigned
		
		System.out.println(e1.name+ " " + e1.age);

		//Obj ref note
		//now e2 is not referenced anymore.
		//both e1 and e2 are pointing to e1
		//there can be more than one ref to obj
		//there can be no reference to object
		
		int z= e2.add(10, 20);  //10,20 are called arguments
		System.out.println(z);
		
	}

}
