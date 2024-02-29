package AGijava;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 methodA(21);
	}
	static void methodA(int nbr){ 
		   if (nbr > 10){ 
		   methodA(nbr-3); 
		   nbr ++; 
		   System.out.print(nbr + " "); 
		} 
		} 

}