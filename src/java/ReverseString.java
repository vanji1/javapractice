package java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
	
	public static void reverseStringToCharArry() {
		//converting STring to Char Array
		
		String s="HELLOLLJJ";
		String s1 = "";
		char[] c = s.toCharArray();
		//System.out.println(c);
		//System.out.println(s);
		
		for(int i=c.length-1;i>=0;i--) {
		
			s1 = s1+c[i];
			System.out.println(s1);
		}
		
		System.out.println("the reverse String is ; " + s1);
		}
	
	public static void reverseStringReadFromEnd() {
		String s="HELLOLLJJ";
		String s1 = "";
		
		for(int i=0;i<s.length();i++) {
			
			s1=s1+s.charAt(s.length()-i-1);
		}
		
		System.out.println("the reverse String is ; " + s1);

	}
	
	public static void reverseUsingByteArray() {
		String s="Hfddddddddd";
		byte[] b=s.getBytes();
		System.out.println(new String(b));  // to convert to String using new String Object
		byte[] b1 = new byte[b.length];
		for(int i=0;i<b.length;i++) {
			b1[i] = b[b.length-i-1]; //read reverse
		}
		System.out.println(new String(b1));
	}

	
	public static void reverseUsingArrayList() {

	        String input = "Geeks For Geeks";
	        char[] hello = input.toCharArray();
	        List<Character> trial1 = new ArrayList<>();
	 
	        for (char c : hello)
	            trial1.add(c);
	 
	        Collections.reverse(trial1);
//	        ListIterator li = trial1.listIterator();
//	        while (li.hasNext())
//	            System.out.print(li.next());
	        System.out.println(trial1);
	        for (char c : trial1)
	        	System.out.print(c);
	            
	    }
	
	public static void reverseUsingStringBuffer() {
		//StringBuilder
        String str = "Geeks";
 
        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);
    }
	

	public static void main(String[] args) {

		 reverseStringToCharArry();
		 System.out.println("--------------");
		 reverseStringReadFromEnd();
		 System.out.println("--------------");
		 reverseUsingByteArray();
		 System.out.println("--------------");
		 reverseUsingArrayList();
		
			}
		
		}
