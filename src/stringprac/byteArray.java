package stringprac;

public class byteArray {

	public static void main(String[] args) {
		String s1 = "The new String equals This is a sample String.";
	   byte[] b = s1.getBytes();
	   String str = new String(b);
	   System.out.println(str);
	   int i=978;
	   
	  String s2 = String.valueOf(i);
	  System.out.println(s2);
	  
	  
	}

}
