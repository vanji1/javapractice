package stringprac;

import java.util.Arrays;

public class CharArrayLearn {

	public static void main(String[] args) {
		char[] char1 = {'a','b','c','d','e','f'};
		char[] char2 = {'a','b','c','d','e','f'};
		if(Arrays.equals(char1, char2))
			System.out.println(true);
		else
			System.out.println(false);
		
		char[] char3= new char[10];
		char3[0] = 'a';
		char3[1] = 'b';
		char3[2] = 'c';
		
		for(int i=0;i<char3.length;i++) {
			System.out.print(char3[i]);
		}
		
		for(char c: char3) {
			System.out.println(c);
		}
		
		//string to char Array
		
		String s="Helo How are you";
		char[] stringchar = s.toCharArray();
		System.out.println(stringchar);
		
		//charArray to String
		
		String ss = new String(stringchar);
		System.out.println(ss);
	
}

			
	}


