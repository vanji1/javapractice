package stringprac;

public class findChar {

	public static void main(String[] args) {

		
		String s1 = "PHP Exercises and Python Exercises";
		String s2 = "and";
		if (s1.contains(s2)) {
			System.out.println("s2 is present in s1");
		}
		else
			System.out.println("s2 is not present in s1");
		
		int index = s1.indexOf(s2);
		if (index > -1) {
			System.out.println("s2 is present in s1");
		}
		System.out.println(index);
			
	}

}
