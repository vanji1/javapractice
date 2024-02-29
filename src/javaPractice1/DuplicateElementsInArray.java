package javaPractice1;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String[] s = { "java","c","c++","java",".net"};
		
		HashSet<String> hs=new HashSet<String>();
		
//		for(int i=0;i<s.length;i++) {  //using the loop to check if the boolean value 
//			if(hs.add(s[i])==false) {
//				System.out.println("The duplicate element is: "+s[i]);
//				
//			}
//		}
		
		for(String str:s) {  //using for each loop to find duplicate element
			if(hs.add(str)==false) {
				System.out.println("The duplicate element is using for each loop: "+str);
			}
		}
		
		for(String ss:hs) { //using for each loop to print the hash set
			System.out.println(ss);
		}
		
		
	}

}
