package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {

	public static void main(String[] args) {
		
		
		//ArraytoArrayList - Arrays.asList
		//ArrayListtoArray - toArray
		
		ArrayList<Integer> aI=new ArrayList<Integer>();
		aI.add(10);
		aI.add(20);
		aI.add(30);
		aI.add(40);
		System.out.println(aI);
		
		Object[] n1=aI.toArray();
		
		System.out.println(Arrays.toString(n1));
		
		int[] n= {1,4,3,2};
		
	List<Integer> an=new ArrayList<Integer>(Arrays.asList(1,4,5,6,7));
		
		System.out.println(an);
	}

}
