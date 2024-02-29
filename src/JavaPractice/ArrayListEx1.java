package JavaPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx1 {

	public static void main(String[] args) {
		/**
		 * This program takes input and finds the largest no and prints them on the console
		 */
		ArrayList<Integer> arrlist=new ArrayList<Integer>();

		//Read Input
		System.out.println("Enter the values Q to quit: ");
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			arrlist.add(scanner.nextInt());
			}
		
		int largest=arrlist.get(0);
		for(int j=0;j<arrlist.size();j++) {
			if(arrlist.get(j)>largest) {
				largest=arrlist.get(j);
			}
		}
			
		System.out.println("----------Old For Method-----");
		
		for(int i=0;i<arrlist.size();i++) {
			System.out.print(arrlist.get(i));
			if(arrlist.get(i)==largest) {
				System.out.print("<--- Largest no in the array");
			}
			System.out.println();
		}
		
		System.out.println("----------New For Method-----");
		for(Integer i:arrlist) {
			System.out.println(i);
		}

	}

}
