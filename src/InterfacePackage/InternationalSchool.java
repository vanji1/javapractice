package InterfacePackage;

public class InternationalSchool implements Indiaschools, USSchools, UkSchools{

	@Override
	public void pSATScore() {
		
		System.out.println("UK pSAT Score");
	}

	@Override
	public int satScore() {
	System.out.println("US satScore");
	return 0;
		
	}

	@Override
	public void entranceScrore() {
	
		System.out.println("Indian schools entrance score");
	}

	public void admissionCriretia() {
		System.out.println("Admission Criteria for International School");
	}
}
