package javaPractice1;

public class Reverse_String {

	public static void main(String[] args) {
		
	/*
	 * Reverse String uses tocharArray method to store in char array and print the string in reverse order
	 */
		
	String s ="test";
	
	char[] c=s.toCharArray();
	System.out.println(c);
	
	
	System.out.println(c.length);
	
	String reverse="";
	for(int i=c.length-1;i>=0;i--) {
		System.out.println(c[i]);
		reverse=reverse+c[i];
		
	}
	System.out.println(reverse);
	}

}
