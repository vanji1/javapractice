package stringprac;

public class GetIndex {

	public static void main(String[] args) {

		
		String s = "The quick brown fox jumps over the lazy dog.";
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i) + " "  + s.indexOf(s.charAt(i)));
		}
	}

}
