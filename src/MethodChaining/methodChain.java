package MethodChaining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class methodChain {
	public static void main(String[] args) {
		
		List<String> fruits=Arrays.asList("Apple","Orange","Grapes","Mango");
		
		System.out.println(fruits);
		List<String> fruitsNew=new ArrayList<String>();
		
		for(String s:fruits) {
			String f=s+ " "+"fruit";
			fruitsNew.add(f);
			}
		
		System.out.println("Fruits New "+fruitsNew);
//		
//		Stream<String> streamFruits=fruits.stream();
//		Stream<String> streamFruitsMap=streamFruits.map(e->e+ "fruits");
//		List<String> l=streamFruitsMap.collect(Collectors.toList());
//		System.out.println(l);
//		
		List<String> l=fruits.stream().map(e->e+ "fruits").collect(Collectors.toList());
		//the above is method chaining
		System.out.println(l);
		
	}
	
	

}
