
package InterviewQuestions;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="the rain is heavy in my place ";
		String s1="the rain is heavy in my place";
		 System.out.println("*********************************");
		System.out.println(s.length()); //to find the length
		System.out.println(s.indexOf("r"));//to find the index of r char
		System.out.println(s.indexOf("a", s.indexOf("a")+1));//to find 2nd occurence of a
		System.out.println(s.charAt(1));//to find char at index
		System.out.println(s.indexOf("heavy"));//index of srting
		System.out.println(s.indexOf("hi"));//will return -1 if str is not present
		 System.out.println("*********************************");
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		 System.out.println("*********************************");
		System.out.println(s.substring(5)); //prints the substring starting from 5th index
		System.out.println(s.substring(5, 10));
		System.out.println(s.subSequence(5, 10));
		 System.out.println("*********************************");
		System.out.println(s.trim());//trims the space between before and after string
		 System.out.println("*********************************");
		System.out.println(s.replace("a", "$")); //replace a char with different char
		System.out.println(s.replace("the", "The"));//replaces a string with new string
		System.out.println(s.replaceAll("[a]", "A"));//replaceall takes reg ex, it is written in []
		
		 System.out.println("*********************************");
	 	String date="12-10-2000";
	 	System.out.println(date.replace("-", "/")); //replace - with /
	 	//String[] date1 = date.split("-");
        System.out.println(Arrays.toString(date.split("-")));//split return String array. we have to print arrays using toString method
		
        System.out.println("*********************************");	
        
        String[] splitString=s.split(" ");
        
        for(int i=0;i<splitString.length;i++) {
		System.out.println(splitString[i]);
        System.out.println("*********************************");	

		for(String ss:splitString)
			System.out.println(ss);
		
		String c1="Agaly";
		String c2="Agalya";
		int a=100;
		int b=200;
		
		System.out.println(c1.compareTo(c2)); //0 if c1==c2; 1 if c1>c2;-1 if c1<c2;
		
		System.out.println(c1.concat(c2));//add two strings
		
		System.out.println(c1+c2);//concats two string
		
		System.out.println(a+b); //adds two numbers
		System.out.println(c1+c2+a+b); //AgalyaAgalya100200 
		System.out.println(a+b+c1+c2); //300AgalyaAgalya
		System.out.println(c1+c2+(a+b));//AgalyaAgalya300
		
		
		
	}
	}

}
