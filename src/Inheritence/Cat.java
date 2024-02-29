package Inheritence;


public class Cat extends Animal implements AnimalInterface{

		   public void animalSound(){
			System.out.println("Meaw");
		   }

		@Override
		public void animalName() {
			// TODO Auto-generated method stub
			System.out.println("Animal Nameis "+"cat");
		}

		@Override
		public void isAnimal() {
			// TODO Auto-generated method stub
			System.out.println("true");
			
		}
}
