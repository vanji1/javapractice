package ArraysConcept;

import java.util.Scanner;

public class ArraySplit {

	public static void main(String[] args) {
		
		String str="Iam learning Java and APi";
		
		Scanner s=new Scanner(str);
		
		while(s.hasNext()) {
			
			String token=s.next();  //next() It splits the string into tokens by whitespace delimiter
			
			System.out.println(token);
			
			
		}
		
		String str1="Automation,testing. It's not that easy";
		//String[] s1=str1.split("[',. ]+");  //split is used to split the str
		String[] s1 = str1.split("[',. ]"); //"[',. ]"splits the string based on , . space  and [] we can include all in one
		
		for(String ss1:s1) {
			System.out.println(ss1);
		}
		
		
	}

}
