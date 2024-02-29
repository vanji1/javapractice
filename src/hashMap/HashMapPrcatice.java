package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPrcatice {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hM=new HashMap<Integer,String>();
		
		hM.put(1, "Tom");
		hM.put(2, "Henry");
		hM.put(3, "Jimmy");
		
		System.out.println(hM);
		

		hM.remove(3); // to remove
		System.out.println(hM);
		
		System.out.println(" -----for lopp--------");
		for(Map.Entry<Integer,String> m: hM.entrySet()){  //for loop
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
			System.out.println("------");
			
			Iterator<Integer> it = hM.keySet().iterator();       //keyset is a method  
			while(it.hasNext())  
			{  
			int i=it.next();  
			System.out.println(hM.get(i));  
			
		}

	}

}
