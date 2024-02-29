 package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Hello World";
		int len=s.length();
		
		 String s1="";
		for(int i=len-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		

		//2.String StringBuffer
		
		//Scanner in =new Scanner(System.in);
	//	System.out.println("Enter the input: ");
	//	String input=in.nextLine();

		 String value="Hello World";
		 StringBuffer sf=new StringBuffer(value);
		 System.out.println(sf.reverse());
		 
		 
			//3.convert to char Array and print
			
			char[] c=s.toCharArray();
					System.out.println(c);
					
					System.out.println(c.length);
					
					for(int i=c.length-1;i>=0;i--) {
						System.out.print(c[i]);
					}
					System.out.println();
					
					
		//	4.Convert to char Array and insert to ArrayList and reverse the string		
					
					char[] c1=s.toCharArray();
					List<Character> lc=new ArrayList<>();
					
					for(char cc: c1) {
						lc.add(cc);
					}
					
					System.out.println(lc);
					
					Collections.reverse(lc);
				//	System.out.println(lc);
				System.out.println("------using listiterator loop----");
					
				ListIterator<Character> it=	lc.listIterator();
				while(it.hasNext()) {
					System.out.print(it.next());
				}
				
				System.out.println();
				System.out.println("------using for loop----");
				for(char ccc: lc) {
					System.out.print(ccc);
				}
	}
	

 
}


