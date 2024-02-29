package stringprac;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		//Method 1 using charAt
		
	//	String s1="Refer";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = scanner.nextLine();
		System.out.println("S is: "+s1);

		int len = s1.length();
		String s2 = "";
		
		for(int i=0;i<len;i++) {
			s2 = s2+s1.charAt(len-i-1);
		}
		System.out.println("S2 is: "+ s2);

		if(s1.trim().equalsIgnoreCase(s2)) 
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
				
		System.out.println("==================================");
		
		//Method 2 using charaRRAY

		char[] s1Array = s1.toCharArray();
		System.out.println(s1Array);
		char[] s2Array = new char[len];
		for(int i=0;i<len;++i) {
			s2Array[i] =  s1Array[len-i-1] ;
		}
		
		System.out.println(s2Array);
		

		String s3= new String(s1Array);
		System.out.println(s3);
		
		String s4= new String(s2Array);
		System.out.println(s4);
		
		if(s3.trim().equalsIgnoreCase(s4)) 
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
				
		System.out.println("==================================");
		
		//Method 3 using reverse()
		
		StringBuffer str = new StringBuffer(s1);
		str.reverse();
		System.out.println("StringBuffer reverse method is: " + str);
	}
	
	}


