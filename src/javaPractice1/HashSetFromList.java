package javaPractice1;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetFromList {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();

		list.add("Deer");
		list.add("Lion");
		list.add("Tiger");
		System.out.println("List is: "+list);
		  
		  HashSet<String> set1=new HashSet<String>(list);
		  set1.add("BEAR");
		  System.out.println("Set is: "+set1);
	}

}
