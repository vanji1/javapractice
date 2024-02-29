import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hi how are you";		
		StringBuffer sF=new StringBuffer(s);
		sF.reverse();
		System.out.println(s);
		System.out.println(sF);
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(s);
		System.out.println(sb);
		
		int size=s.length();
		System.out.println("Size is: "+size); 
		System.out.println("Using charAT function");
		for(int i=size-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	
	
	String s1="Hi how are you";		
	char[] ca=s1.toCharArray();
	System.out.println(ca);
	for(int ii=ca.length-1;ii>=0;ii--) {
		System.out.print(ca[ii]);
	}
	
	
	ArrayList<Character> cArray=new ArrayList<Character>();
	for(char c:ca) {
		cArray.add(c);
	}
	System.out.println(cArray);
Collections.sort(cArray);
System.out.println(cArray);

	}
}
