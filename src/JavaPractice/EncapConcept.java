package JavaPractice;

public class EncapConcept {
	public String familyName;
	public String address;
	public int noOfMembers;
	private int income;
	
	
	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNoOfMembers() {
		return noOfMembers;
	}

	public void setNoOfMembers(int noOfMembers) {
		this.noOfMembers = noOfMembers;
	}


	
	public int getIncome() {
	return income;
	}
	
	public void setIncome(int income) {
		this.income = income;
	}
	
	public EncapConcept(String familyName, String address, int noOfMembers, int income) {
		//super();
		this.familyName = familyName;
		this.address = address;
		this.noOfMembers = noOfMembers;
		this.income = income;
	}
	
    public void display() {
    	System.out.println("FamilyName: "+ familyName);
    	System.out.println("Address: "+ address);
    	System.out.println("noOfMembers: "+ noOfMembers);
    	System.out.println("Income: "+ income);
    	
    }

	
}
