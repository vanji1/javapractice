package javaPractice1;

import java.util.ArrayList;
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		
		int[] num= {3,6,1,7,4,8,5};
		
		int l = num[0];
		for(int i=0;i+1<num.length;i++) {
			
			if(l<num[i+1]) {
				 l=num[i];
			}
		}
		
		
		System.out.println("The greatest in the given numbers is "+l);
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		System.out.println("Enter the numbers, Enter Q to exit");
		
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextInt()) {
			ar.add(scanner.nextInt());
		
		}
		int large=ar.get(0);
		
		for(int it:ar) {
			if(it>large) {
				large=it;
			}
			System.out.print(it+"\t");
		}

		System.out.println();
		System.out.println("the greatest is:"+large);
	}

}
