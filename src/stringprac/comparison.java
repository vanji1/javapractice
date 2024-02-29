package stringprac;

public class comparison {

	public static void main(String[] args) {

		String s1="DELLMONT";
		String s2="DELLMONT";
		System.out.println(s1==s2);//compares the location and string
		System.out.println(s1.equals(s2));//compares teh string
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("contennt equal" + s1.contentEquals(s2));
		System.out.println(s1.compareTo(s2));//compare2 if teh object is greater than or less than or equal to, it returns integer

	}

}
