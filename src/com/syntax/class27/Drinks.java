package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Drinks {
/*Create an arrayList of drinks. 
 * If any drink has letter “a” or “e” replace it with water.
 */
	
	public static void main (String [] args) {
	
	ArrayList <String> drinks=new ArrayList<>();
	
	drinks.add("cola");
	drinks.add("fanta");
	drinks.add("sprite");
	drinks.add("yuppi");
	drinks.add("juice");
	
	Iterator <String> drink=drinks.iterator();
	
	
	for (int i=0; i<drinks.size();i++) {
		if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
			drinks.set(i, "water");
		}
	}
	System.out.println(drinks);
	System.out.println("**************");
	
	for (String dr:drinks) {
		dr=dr.toLowerCase();
		if (dr.contains("a") || dr.contains("e")) {
			
			dr=dr.replaceAll(dr, "water");
		}
		System.out.println(dr);
		
	}
	System.out.println("*************");
	
	}
	
}
