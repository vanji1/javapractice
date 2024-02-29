package Inheritence;

import java.util.ArrayList;

public class TestInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Animal a =new Animal();
//		a.animalSound();
		
		Cat c=new Cat();
		c.animalSound();
		c.animalName();
	c.isAnimal();
		
		Dog d=new Dog();
		d.animalSound();
		d.animalName();
		
		ArrayList name = new ArrayList();
		name.add("1");
		name.add("2");
		name.addAll(name);
		System.out.println(name);
		
	}

}
