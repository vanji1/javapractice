package javaPractice1;

public class ReplaceAllEx {

	public static void main(String[] args) {
			String str = "We are abc working at Abc";
			String strd = "Hi 10, How 20 and 30 are doing!";
			
			String str2 = strd.replaceAll("[0-9]+", "");
		//	String str3 = strd.replaceAll(" [0-9]+", "");
			String str4 = str.replaceAll("[a-zA-Z]+", "Java");

			System.out.println("After Replacing First Sub String in str = " + str2);
		//	System.out.println("After Replacing Last Sub String in str = " + str3);
		System.out.println("After Replacing First Sub String in str1 = " + str4);
		System.out.println();
		String s=".h....i H_o-w .are you. %$%&&&(^&*Hhj879";
		System.out.println(s);
		System.out.println(s.replaceAll("\\.{2,}", "."));
		//replaceAll("\\.{2,}",".");
		}
	
	}


