package ArraysConcept;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] n1= {10,20,29,30,49,40};
		System.out.println("initial n1 nos: "+Arrays.toString(n1));
		int[] n2=n1;
		n2[2]=100;
		System.out.println("AFter inserting 100 at n2[2]: "+Arrays.toString(n1));
		
		int[] n3=add(n1);
		
		System.out.println("AFter inserting 100 at n2[2]: "+Arrays.toString(n3));
		
		
	}
	
	public static int[] add(int[] n1) {
		n1[0]=100;
		return n1;
//		int total=0;
//		for(int i=0;i<n1.length;i++) {
//			total=total+n1[i];
//		}
//		System.out.println(total);
	}

}
