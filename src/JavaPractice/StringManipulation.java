package JavaPractice;

public class StringManipulation {

	public static void main(String[] args) {
		String str="This is my java code and I am so HAppy";
		System.out.println("length: " + str.length());
		System.out.println("char at index: " + str.charAt(35));
		System.out.println("index of: " + str.indexOf("y"));
		System.out.println("index of: " + str.indexOf('y'));
		System.out.println("index of: " + str.indexOf("s")+1);
		
		System.out.println(str.indexOf("hello "));
		
		if (str.indexOf("hello")>0) {
			System.out.println("Pass");
		}else
			System.out.println("fail");
		
		
		//compare Strings
		String s1="Hello World";
		String s2="Hello World";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//Trim
		
		String p="--Hello World--";
		System.out.println(p.trim());

		//replace String
		System.out.println(p.replace(" ", ""));//replace to replace something
		System.out.println(p.trim().replace(" ", ""));//use Trim and replace together
			
		//replace in date
		String dob="01-01-1990";
		System.out.println(dob.replaceAll("-", "/"));
		System.out.println(dob.replace("-", "/"));

		//upper case, lower case
		System.out.println(p.toUpperCase());
		System.out.println(p.toLowerCase());
		
		//substring 
		
		System.out.println(p.substring(3));
		System.out.println(p.substring(2,5));

		//Split String
		
		String data="Tommy, 10,male,USA";
		String result[]=data.split(",");
		for(int i=0;i<result.length;i++) {
		System.out.println(" "+result[i]);
				}
	
	
	//Split String the same method different approach
	String name="Agi Aga Vanji Sami";
	System.out.println(name.split(" ")[0]);
	System.out.println(name.split(" ")[1]);
	System.out.println(name.split(" ")[2]);
	System.out.println(name.split(" ")[3]);

	
	for(int i=0;i<name.split(" ").length;i++) {
		System.out.println(name.split(" ")[i]); 
	}
	}
}
