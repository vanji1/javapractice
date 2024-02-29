package java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//generic Array List	
		//virtual capacity is 10
		//after phy capacity is reaches 10, VC 10/2 = 5 will get added
		//after pc reaches 15, virtual capacity 15/2= 7 VC is added.
		
		//Array list Types - Integer, DOuble, String, Objects - it can contain any data type in AL etc
	ArrayList<Integer> ai = new ArrayList<Integer>();
	ai.add(12);
	ai.add(67);
	ai.add(90);
	ai.add(68);
	ai.add(67);
	ai.remove(3);//to remove value from AL
	
	System.out.println("The numbers in Array List is:"+ai.get(1));
	
	for (int i=0;i<ai.size();i++) {
		System.out.println(ai.get(i));
	}
	
	System.out.println("----For each loop output----- : ");
	
	for (Integer e: ai) {
		System.out.println(e);
	}
	
	//we can also use int as Integer wrapper class is built on top of int
	
	for (int e: ai) {
		System.out.println(e);
	}
	System.out.println("--------------");
	
	//ArrayList - another way to create AL with values
	ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,02,30,40,50,60));
	System.out.println("Numbers:"+numbers); // we can print array list like this, but not static arrays
	//String AL
	ArrayList<String> weekdays = new ArrayList<String>(Arrays.asList("Mon", "Tue","Wed","Thur","Fir"));
	System.out.println("weekdays:"+weekdays);
	
	
	ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B","C","D","E"));
	ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("B", "A","C","D","E"));
	ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A", "B","C","E","D"));
	
System.out.println(l3);
//to Sort AL
	Collections.sort(l3);
	System.out.println(l3);
	
	//To compare
	System.out.println(l1.equals(l2));
	
	l1.removeAll(l2);//removes all the values from l1 that are common with l2.
	l1.retainAll(l2); // retail only the common elements in l1 with l2
	
	//clone
//	ArrayList<Object> clone = (Arraylist<Object>) l3.clone();
	//System.out.println(clone);
	
	//add values to AL using index
	
	ArrayList<String> all1 = new ArrayList<String> (Arrays.asList("cat","dog","mouse","cow"));
	all1.add(0,"crow"); //it will add to 0th index
	
//	all1.add(10,"donkey");
	System.out.println(all1); //this will throw Index out of bound exception as we cannot values randomly. AL doesnt allow us to add by skipping empty rows
	
	
	
	
	
	
	
}
}
