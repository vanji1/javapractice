package javaPractice1;

public class OverLoadingMainEx {

	  
		public static void main(String[] args){
			System.out.println("main with String[]");
			main();
			main("hi");
			}  
		
		public static void main(String args){
			System.out.println("main with String");
			}  
		
		public static void main(){
			System.out.println("main without args");
			}  
		}

