package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateelementsArrray {

	public static void main(String[] args) {
		String s[]= {"java","c","c++","java","c"};

		//System.out.println(s[0]);
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])){
					System.out.println("The duplicate array element is: "+s[i]);
				}
			}
		}
		
		System.out.println("**********************");
		
		Set<String> set=new HashSet<String>();
		
		for(String hashList:s)
		   if(set.add(hashList)==false){  //if the element is duplicate hastset returns false
			   System.out.println("the duplicate element is:"+hashList);
		   }
		
		System.out.println(set);
		set.clear(); //this clear() deletes the element in hash set addall() will ppend one Arraylist or other hastset
		System.out.println(set);
		
	}
	

}
