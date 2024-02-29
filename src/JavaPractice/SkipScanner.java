package JavaPractice;

import java.util.Scanner;

public class SkipScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner("Hello world, I am happy to see you");
		scan.skip(".*I am ");

		System.out.println(scan.nextLine());
		scan.close();
		System.out.println("hi");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter"+scanner.nextLine());
		
	}

}
