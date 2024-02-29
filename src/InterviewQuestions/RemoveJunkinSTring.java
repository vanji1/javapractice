package InterviewQuestions;

public class RemoveJunkinSTring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="#@#%$% kjkjhhkkh 8998809 ^&&^%&";
		String s1="I love You RRRRRRRRRR"; 
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");//this removes junk 
		System.out.println(s);
		
		String s2=s1.replace("Y","$");
		System.out.println(s1+"  "+s2);
		
		System.out.println(s1.replaceFirst("[Y]", "***"));//replce Y with ***
		
		System.out.println(s1.replaceAll("[^a-z]", "%"));
		//System.out.println(s3);
	}

}
