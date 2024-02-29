package abstractEx;

public class ADog extends AnimalP{
	
	public ADog() {
		super("dog");
		System.out.println("Inside child class constructor");
		
	}

	@Override
	public void sound() {
		System.out.println("Dog barks woof woof");
	}

	@Override
	public void animalType() {
		System.out.println("The dog is a Domestic Animal");
	}

}
