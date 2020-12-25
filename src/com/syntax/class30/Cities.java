package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class Cities {

	/* Create a Map from array of cities that will sort keys in alphabetical order. 
	 * As a key store the name of the city and as a value store the length of the city 
	 *(Example: Paris=5, Moscow =6, Washington DC=13 etc..).
	 *If any city name is more than 7 characters remove that city  
	 */

	
	public static void main(String[] args) {
		
		Map <String, Integer> cities=new TreeMap<>();
		
		cities.put("Paris", 5);
		cities.put("Ashgabat", 8);
		cities.put("Moscow", 6);
		cities.put("Istanbul", 8);
		cities.put("Garland", 7);
		
		System.out.println(cities);
		
		// if you want to sort the cities we need to convert them to the collection type
		// we can call them by using .values()/ .keySet()/ entrySet()
		
	Set <Entry <String, Integer>>entry=cities.entrySet();
	
	Iterator <Entry<String, Integer>>it=entry.iterator();
	
	while (it.hasNext()) {
		Entry<String, Integer>k=it.next();
		if (k.getKey().length()>7) {
			it.remove();
		}
	}
	System.out.println(cities);
		
	
	
	}
}
