package javaPractice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListToLinkedHashSet {

	public static void main(String[] args) {
		
		List<Integer> il=new ArrayList<Integer>();
		il.add(20);
		il.add(30);
		il.add(40);
		il.add(20);
		il.add(60);
		il.add(10);
		System.out.println(il);
		
		Collections.sort(il); //sorts the elements 
		System.out.println("List after Sort"+il);
		
		Set<Integer> set=new LinkedHashSet<Integer>(il);	//LinkedhashSet maintains order as opposed to Hashset	
		System.out.println(set);
		il.clear(); //empty prime ArrayList. clear removes all elements in AL
		System.out.println(il);
		il.addAll(set); //to addall elements back to AL
		System.out.println(set);
		
	
	}

}
