package ArraysConcept;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		int[] primes= {1,3,5,7,9};
		
		for (int i = 0; i < 2; i++)
		{
		 primes[4 - i] = primes[i];
		}
		
		System.out.println(Arrays.toString(primes));
		
		for (int i = 0; i < 5; i++)
		{
			if(i>0) {
				System.out.print("|");//to print seperators for the array elements
			}
		 primes[i]++;
		 System.out.print(primes[i]);
		 
		}
		System.out.println();
		System.out.println(Arrays.toString(primes));
	

	
	//String array
	System.out.println();
	String[] words= {"run","ran", "fun","fan","sin","san","can","man","nan","an"};
	
	for(String s:words) {
	System.out.print(s); 
	System.out.print(" | ");
	}
	
}
}
