package javaPractice1;

public class Strings {

	public static void main(String[] args) {
		String s="  ---Today is first day of November and it is very cold--  '";
		String s1="Today is first day of November and it is not very cold";
		System.out.println("Length of String: "+s.length());
		System.out.println("Char at: "+s.charAt(1));
		System.out.println("Index at: "+s.indexOf("T") + " and "+(s.indexOf("f")+1));
		System.out.println("Index of word: " + s.indexOf("November"));
		System.out.println("Index of f: " + s.indexOf("f")+1);
		
		
		System.out.println("Compare String s and s1: "+s.equals(s1));
		System.out.println("Compare String s and s1: "+s.equalsIgnoreCase(s1));
		
		System.out.println("Trim: "+s.trim());
		
		System.out.println("Replace character: "+ s.replace("i", "$"));
		System.out.println("String s is: "+s);
		System.out.println("Replace: "+s.replace("day", "Day"));
		
		
	String date="1990-8-9";
	System.out.println("Replace all: "+date.replaceAll("-", "/"));
	System.out.println("Replace: "+date.replace("-", "/"));
	
	System.out.println("UpperCase: "+s.toUpperCase());
	System.out.println("LowerCase: "+s.toLowerCase());
	
	System.out.println("Substring: "+ s.substring(20));
	System.out.println("Substring: "+ s.substring(5, 20));
	
	
	System.out.println("Split: " );
		String[] splitString=s.split(" ");
		for (String ss:splitString) {
			System.out.println(ss);
		}
		
		System.out.println(s.split(" ")[9]);
	}


}
