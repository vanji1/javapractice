package javaPractice1;

import java.util.Arrays;

public class FindDuplicateWordsinString {

	public static void main(String[] args) {
	
		
		String st="I am am not the one who is thinking I one thing at time";
		String[] ar = st.split("\\s");// s stands for "whitespace character".
										//	\\s*,\\s* It says zero or more occurrence of whitespace characters, 
										//	followed by a comma and then followed by zero or more occurrence of whitespace characters.
		System.out.println(Arrays.toString(ar));
		
		
	}

}
