package JavaPractice;

import java.util.Arrays;

public class ArrayPrintMethods {

	public static void main(String[] args) {

		
		
		int[] ii1= new int[4];
		
		ii1[0]=70;
		ii1[1]=60;
		ii1[2]=50;
		ii1[3]=40;
		
		for(int i=0;i<ii1.length;i++) {
			System.out.println(ii1[i]);
		}
		
		for(int j:ii1) {
			System.out.println(j);
		}
		 

		int[] ii= {1,4,7,8,9};
		
		for(int i=0;i<ii.length;i++) {
			System.out.println(ii[i]);
		}
		System.out.println("Arrays"+Arrays.toString(ii));
		
		
		String[] s=new String[5];
		s[0]="deer";
		s[1]="Bear";
		s[2]="Lion";
		s[3]="Tiger";
		
	for(String s1 :s) {
		System.out.println(s1);
	}
	System.out.println("Arrays"+Arrays.toString(s));
	
	}

}
