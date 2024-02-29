package abstractEx;

public abstract class AnimalP {
	
	public abstract void sound();
	public abstract void animalType();
	
	public AnimalP(String s) {
		String str=s;
		
		System.out.println("Inside Abstract Parent class constructor"+s);
	}
	public void belong() {
		System.out.println("This Animal belongs to forest");
	}
	
	public static void leg() {
		System.out.println("They have 4 legs");
	}
}
