package JavaPractice;

import java.util.ArrayList;

public class PrimeEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> squares = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
		{
		 squares.add(i * i);
		}
		
		squares.add(200); //to insert a value to al
		System.out.println(squares);

	}

}
