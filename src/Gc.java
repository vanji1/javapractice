
		import java.util.*;
		import java.security.*;
		
		public class Gc {
			
		
		 public static void main(String[] args) {

		  Gc solution=new Gc();
		  solution=null;
		   System.out.println("Hello World");
		  
		 System.gc();
		 }
		 
		 @Override
		 protected void finalize() {
			 System.out.println("objct garbaged: "+this);
		 }
		 
}
		
