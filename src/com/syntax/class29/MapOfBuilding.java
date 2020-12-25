package com.syntax.class29;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapOfBuilding {

	public static void main(String[] args) {
	/* Create a map of a building. 
	 * Store floor number and it is associated company name. 
	 * (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
	 * Check how many entries you have?
	 * Update company on a 4th floor 
	 * Remove company on the 7th floor
	 * Print your map 
	 */

		
		HashMap <Integer, String>company=new HashMap<>(); //---> no order in printing
		
		company.put(1,"Google");
		company.put(2,"Syntax");
		company.put(3, "FireFox");
		company.put(4, "Cyberteck");
		company.put(5, "Coding");
		company.put(6, "Battle");
		company.put(7, "Safari");
		
		System.out.println(company);
		
		System.out.println();
		
		int size=company.size();
		System.out.println(size);
		
		System.out.println();
		
		company.put(4,"Java");
		System.out.println(company);
		
		System.out.println();
		
		company.remove(7);
		System.out.println(company);
		
		System.out.println();
		
		Map <Integer, String>comp=new TreeMap<>(); //----> sorting obj according to key order
		
		comp.put(7, "Safari");
		comp.put(1,"Google");
		comp.put(6, "Battle");
		comp.put(3, "FireFox");
		comp.put(4, "Cyberteck");
		comp.put(5, "Coding");
		comp.put(2,"Syntax");
		
		
		System.out.println(comp);
		
		

	}

}
