package encapsulation;

public class company {
	
	private String username;
	private String password;
	
	//here setter sets the 
	public String getUsername() {
		return username;
	}
	
	//here setter sets the class variable with the local variable 
	// we use this keyword for the class variable
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void login (String username, String password) {
		System.out.println("Login username is :" + username + ":" + password);
	}
	
	

}
