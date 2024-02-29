package javaPractice1;

import java.util.HashSet;

public class HastSetUsingInt {

	public static void main(String[] args) {
		
		int[] i={11,12,16,17,15,18,19};
		
		
		HashSet<Integer> hi=new HashSet<Integer>();
		
		hi.add(1);
		hi.add(2);
		hi.add(3);
		hi.add(4);
		hi.add(5);
		hi.add(6);
		System.out.println(hi);
			
		for(int i1:i) {
			hi.add(i1);
		}
		
		System.out.println(hi);
	}

}
