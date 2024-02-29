package JavaCourse;

public class Strings {

	public static void main(String[] args) {
		
		
		String s="Hello World!";
		int sLength=s.length();
		System.out.println(sLength);
		
		String s1=s.toUpperCase();
		System.out.println(s1);
		
		String s2=s.toLowerCase();
		System.out.println(s2);
		
		int strReplace=s.replace("Hello World", "Missisippi").length();
		System.out.println(strReplace);
		
		String greeting = "Hello";
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting);
		
	}

}
