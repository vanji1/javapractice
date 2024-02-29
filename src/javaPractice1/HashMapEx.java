package javaPractice1;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("name","Vanji");
		hm.put("age", "30");
		hm.put("city", "chicago");
		System.out.println(hm);
		
		for(Map.Entry<String,String> i:hm.entrySet()) {
			
			System.out.println(i.getKey()+i.getValue());
		}
		
		
		        Map<String,String> gfg = new HashMap<String,String>(); 
		      
		        // enter name/url pair 
		        gfg.put("GFG", "geeksforgeeks.org"); 
		        gfg.put("Practice", "practice.geeksforgeeks.org"); 
		        gfg.put("Code", "code.geeksforgeeks.org"); 
		        gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
		          
		        // using keySet() for iteration over keys 
		        for (String name : gfg.keySet())  
		            System.out.println("key: " + name); 
		          
		        // using values() for iteration over keys 
		        for (String url : gfg.values())  
		            System.out.println("value: " + url); 
		    } 
		
		

	}


