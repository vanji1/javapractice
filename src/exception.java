
public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		int i=9/0;
}catch(Exception e) {
	System.out.println("getMessage: "+e.getMessage());
	System.out.println("printStackTrace: ");
	e.printStackTrace();
	System.out.println("toSTring: ");

	e.toString();
}
	}

}
