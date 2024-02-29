package InterfacePackage;

public interface USSchools {

	public static final int score = 0;
	public int satScore();
	
	static void noOfSchools() {
		System.out.println("no of schools");
	}
	
	default void admisionRate() {
		System.out.println("admission acceptance criteria");
	}
	
	default void racialPercentage() {
		System.out.println("percentage of race");
	}
	
	
}

