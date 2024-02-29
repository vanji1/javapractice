package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListLearn {

	public static void main(String[] args) {
		
		ArrayList<Object> aO=new ArrayList<Object>(); //empty arrayList
		aO.add("Hi");
		aO.add(1);
		aO.add(true);
		System.out.println(aO);
		
		ArrayList<Object> ao1=new ArrayList<Object>(5); //specified initial capacity-but if we add more it inceases
		ao1.add("Hi");
		ao1.add(1);
		ao1.add(2.0);
		ao1.add("X");
		ao1.add(123);
		ao1.add(123);
		ao1.add("Null");
		System.out.println(ao1);
		ao1.remove(2);
		System.out.println(ao1);
		
		ArrayList<String> as=	new ArrayList<String>(Arrays.asList("Tom","Henry","Philly")); // build an array list that is initialized with the elements of the collection c.
		System.out.println(as);
		
		ArrayList<Integer> aI=	new ArrayList<Integer>(Arrays.asList(4,6,7,5,8));
		System.out.println(aI);
		Collections.sort(aI);
		System.out.println(aI);
		Collections.reverse(aI);
		System.out.println(aI);
		
	}

}
