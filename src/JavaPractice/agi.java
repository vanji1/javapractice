package JavaPractice;
import java.util.Scanner;

public class agi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");

		double r=sc.nextDouble();
		double area =Math.PI*(r*r);
		System.out.println(area);
		
	}

}
