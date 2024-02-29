package stringprac;

import java.util.Scanner;

public class SubStringMethods {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String: ");
		String str = sc.nextLine();
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(0, 5));//endindex char will not be included
		
		
	}

}
