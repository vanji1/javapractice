package JavaPractice;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		final int LENGTH=10;
		double[] values=new double[LENGTH];
		
		int currentSize=0;
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(n);		
		//in.hasNext();
		
		System.out.println(values.length);
		System.out.println("CurrentSixze: "+ currentSize);
		
		while(in.hasNextDouble()) {
			if(currentSize<values.length) {
				values[currentSize]=in.nextDouble();
				currentSize++;
			}
			else {
				break;
			}
					}
		for (int i = 0; i < currentSize; i++)
		{
		 System.out.println(values[i]);
		 		 
		 }
		
		System.out.println("Using New for loop method: ");
		for(double e:values) {
			 System.out.println(e);
		}
		
		int counter = 0;
		for (double element : values)
		{
		 if (element == 0) { counter++; }
		}
		System.out.println(counter);
	}

}
