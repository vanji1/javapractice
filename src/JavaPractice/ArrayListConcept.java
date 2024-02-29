package JavaPractice;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		ar.add(100); //to add values to array list
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		ar.add("Vanji");
		ar.add("100.00");
		
		System.out.println(ar);
		System.out.println("Size is: "+ar.size());
		//System.out.println(ar.get(0)+ " " +ar.get(1));
		
		//ar.remove(4);
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i)+" ");
		}
		
		
		System.out.println();
		
		//Array List String
		ArrayList<String> names=new ArrayList<String>();
		names.add("Vanji");
		names.add("Aga");
		names.add("Agi");
String name=names.get(2);
System.out.println(name);
	names.set(1, "sami");
	names.add(3,"XXXX");
	names.add(4,"XXX");
	
	
	System.out.println("----------------");
				System.out.println(names.size()); //size
		for(String s:names) {
			System.out.print(s+" ");
		}
		
		
		ArrayList<Integer> empAge = new ArrayList<Integer>();
		empAge.add(10);
		empAge.add(3);
		for(Integer s:empAge) {
			System.out.println(s);
		}

	}

}
