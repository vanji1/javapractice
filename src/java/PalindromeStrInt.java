package java;

import java.util.Scanner;

public class PalindromeStrInt {
	
	public int palindromeNo (int number) {
		int n=number,n1;
		int sum=0;
		
		while(n>0) {
			
			n1=n%10;
			sum=(sum*10)+n1;
			n=n/10;
		}
		 return sum;
	}
	
	
	public void palindromeStr (String s) {
		
		String str =s;
		String s1="";
		for(int i=str.length()-1; i>=0;i--) {
			s1=s1+str.charAt(i);
		}
		if(s1.equals(str))
			System.out.println(str + "is Palindrme");
		else
			System.out.println(str+" is not Plaindrome");
	}
	

	public static void main(String[] args) {

		PalindromeStrInt p = new PalindromeStrInt();
		Scanner s = new Scanner(System.in);
		System.out.print("Please Enter the No: ");
		int input = s.nextInt();
		int sum1 = p.palindromeNo(input);
		if(sum1==input) 
			System.out.println(sum1 + "  is Palindrome");
		else
			System.out.println(sum1 + "  is not a Palindrome");
		System.out.print("Please Enter the String: ");
		
		p.palindromeStr(s.next());
		s.close();
		
}
}
