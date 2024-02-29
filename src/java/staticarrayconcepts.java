package java;

import java.util.Arrays;

public class staticarrayconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//limitations
		//1.size is fixed-static array- to overcome this we use dynamic Array
		// similar type of data
		//use case - static type of data
		//types of static arrays - double, int, char, short,String
		
		
		int i[] = new int [4];
		i[0]=43;
		i[1]=32;
		
		int length=i.length;
		System.out.println("length:" + length);
		
		for (int m=0;m<i.length;m++) {
			System.out.println(i[m]);
			
		}
		for(int e: i) {
			System.out.println(e);
		}

		System.out.println("_________________"); 

		int j[] = {1,3,5,7,8};
		
		for(int e: j) {
			System.out.println(e);
		}
			
		//print static array without for loop
		
		System.out.println(Arrays.toString(j));

				
		
	}

}
