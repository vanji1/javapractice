package JavaPractice;

import java.util.Scanner;

public class Agiwhileloop {

	public static void main(String[] args) {
	
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your Choice: ");
		int choice=s.nextInt();
	
		double price=0;
		
		while(choice<5) {
			
			if(choice==1) {
				price=price+1.40;
			}
			else if(choice==2) {
				price=price+1.29;
			}
			else if(choice==3) {
				price=price+0.99;
			}
			else if(choice==4) {
				price=price+1.89;
			}	
			System.out.print("Enter your choice: ");
			choice=s.nextInt();
		}
		
	System.out.println("The total cost of the purchase is : "+ String.format("%.2f", price));
	System.out.format("The total cost of the purchase is : %.2f",price);
	
	System.out.printf("%n%.1f", price);
	}

}
