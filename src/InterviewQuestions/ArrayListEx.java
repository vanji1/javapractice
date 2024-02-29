package InterviewQuestions;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
        // create list
       List<String> crunchifyList = new ArrayList<String>();
 
        // add 4 different values to list
        crunchifyList.add("Facebook");
        crunchifyList.add("Paypal");
        crunchifyList.add("Google");
        crunchifyList.add("Yahoo");
 
        System.out.println("Crunchify List is :"+crunchifyList);  // print the ArrayList
        
        // Other way to define list is - we will not use this list :)
     //   List<String> crunchifyListNew = Arrays.asList("Facebook", "Paypal", "Google", "Yahoo");
 
        // Simple For loop
        System.out.println("==============> 1. Simple For loop Example.");
        for (int i = 0; i < crunchifyList.size(); i++) {
            System.out.println(crunchifyList.get(i));
        }
        
        System.out.println("*************");
        for(String s:crunchifyList) //for each loop
        	System.out.println(s);
        
        
     // Iterator - Returns an iterator over the elements in this list in proper sequence.
        System.out.println("\n==============> 3. Iterator Example...");
        Iterator<String> crunchifyIterator = crunchifyList.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());
        }
        System.out.println("------------------------------");
        Iterator<String> is=crunchifyList.iterator();
        
        while (is.hasNext()) {
        System.out.println(is.next());
        }
	}
		

}
