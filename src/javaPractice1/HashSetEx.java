package javaPractice1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		
		  HashSet<String> set=new HashSet<String>();  
		  set.add("hi");
		  set.add("how");
		  set.add("are");
		  set.add("you");
		  set.add("hi");
		
		  System.out.println("Set is: " + set);
//		  Iterator<String> is=set.iterator();
//		  		  while(is.hasNext()) {
//			  System.out.println(is.next());
//		  }
		  
		  set.add("ok");
		  System.out.println("Set is after adding ok " + set);
		  
		  
		  HashSet<String> set1=new HashSet<String>(); 
		  set.add("HII");
		  set.add("HoWW");
		  set.add("YOUU");
		  
		  set.addAll(set1);
		 
		  System.out.println("Set1 is  " + set1);
		  System.out.println("Set is after adding Set1 " + set);
		  
		  		  
		  set.removeAll(set1);
		 
		  System.out.println("Set1 is  " + set1);
		  System.out.println("Set is after adding Set1 " + set);
		  
		  set.removeIf(str->str.contains("hi"));    
          System.out.println("After invoking removeIf() method: "+set);  
		  
	}

}
