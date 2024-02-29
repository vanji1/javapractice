package stringprac;

import java.util.Scanner;

public class ReplaceMethods {

	public static void main(String[] args) {

		String s = "THis is Winter season";
		String s1=s.replace("i", "$");
		System.out.println(s);
		System.out.println(s1);

		String s2 = s.replace("s","XXX");
		System.out.println(s2);
		
		String s3 = s.replaceAll("\\s", "");
		System.out.println(s3);
		
		String s4 = s.replace("\\s", "");
		System.out.println(s4);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the String: ");
		String firstString = sc.nextLine();
		System.out.println("ENter the char 1: ");
		char toReplace = sc.next().charAt(0);
		System.out.println("ENter the char 2: ");

		char toReplaceTo = sc.next().charAt(0);
		String replaceStr = firstString.replace(toReplace, toReplaceTo);
		System.out.println("replace String is: "+ replaceStr);

		
	}

}
