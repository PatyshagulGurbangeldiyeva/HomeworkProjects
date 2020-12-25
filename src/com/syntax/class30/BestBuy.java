package com.syntax.class30;
import java.util.*;

public class BestBuy {
//	Create a map of Best Buy store. 
//	Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//	Retrieve all keys and values from a Best Buy map using EntrySet.
	
	public static void main(String[] args) {
		
		Map <Integer, String> lmap=new LinkedHashMap<>();
		
		lmap.put(1234, "Printer");
		lmap.put(2345, "TV");
		lmap.put(3456, "Screen");
		
		Set <Integer>keys=lmap.keySet();
		
		Iterator <Integer>key=keys.iterator();
		
		while (key.hasNext()) {
			Integer k=key.next();
			
			System.out.println(k+" : "+lmap.get(k));
		}
		
	}
}
