package java;

public class callbyref {
	
	
	String Bowser;
	double version;
	
	//here we are passing the object ref 
	
	public void getInfo(callbyref br) {
		System.out.println(br.Bowser + " " + br.version);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		callbyref b = new callbyref();
		
		b.getInfo(b);  // since the variables are not assigned any value, default values will be printed  - null 0.0
		
		b.Bowser = "chromw";
		b.version = 10.00;
		b.getInfo(b); //call by ref , here obj reference b is given to br , b=br;
		           //so now both b and br ref variables are pointing to the same object
					//calling a method by passing obj ref
		
	}

}
