package encapsulation;

public class comapanylogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		company c1 = new company();
		c1.setUsername("admin");
		c1.setPassword("admin123");
		
		c1.login(c1.getUsername(), c1.getPassword());
      
		company c2 = new company();
		c2.login(c2.getUsername(), c2.getPassword()); //this will print null as we did not set the values for this object properties
		
		c2.setUsername("admin1");
		c2.setPassword("admin123");
  		c2.login(c2.getUsername(), c2.getPassword());
	}

}
