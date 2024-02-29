package ArraysConcept;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		double[] d=new double[100];
		int currentSize = 0;
		Scanner scanner=new Scanner(System.in);//takes input from user
		while(scanner.hasNextDouble()) {
			if(currentSize<d.length) {
				d[currentSize]=scanner.nextDouble();//nextDouble takes double input from user and store in array
				currentSize++;	
			}
			
		}
		System.out.println(currentSize);
//		System.out.println(Arrays.toString(d));
		for(int i=0;i<currentSize;i++) {
			System.out.println(d[i]);
			
		}

		
	}

}
