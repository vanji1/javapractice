import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListLearn {

	public static void main(String[] args) {
	
		
		ArrayList<Integer> al= new ArrayList<Integer>(Arrays.asList(1,4,3,6,7,8));
		System.out.println(al);
		
		Collections.reverse(al); //using collections.reverse get the reverse
		System.out.println(al);
		
		ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(10);
		al1.add(40);
		al1.add(20);
		al1.add(30);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		System.out.println(al1.size());
		
		Object[] obj=new Object[4];//Collections.sort not available in array
		obj[0]=4;
		obj[1]=2;
		System.out.println(obj.length);
		
				
		
	}

}
