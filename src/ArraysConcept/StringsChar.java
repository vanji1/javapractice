

package ArraysConcept;

public class StringsChar {

	public static void main(String[] args) {
		
		
		//String.valeof(c) will convert char Array to String
		char[] c= {'s','c','h','o','o','l'};
		String s=String.valueOf(c);
		System.out.println(s);

		String s1=new String(c);
		System.out.println(s1);
		
		
		//Method 1 to reverse String
		String str="i Love You";
		char[] char1=str.toCharArray();  //str.toCharArray converts str to charArray
		System.out.println(char1);
		System.out.println(char1.length);
		for(int i=(char1.length)-1;i>=0;i--) {
			System.out.print(char1[i]);
		}
		
		System.out.println();
		
		
		//method 2 to reverse String
		for(int j=(str.length())-1;j>=0;j--) {
			
			System.out.print(str.charAt(j));
		}
		
		System.out.println();

		char[] c1=new char[5];
		str.getChars(2, 6, c1, 0);  //str.getchars takes part of string from index 2to6 into c1 array
		System.out.println(c1);
				
			
		
	}

}
