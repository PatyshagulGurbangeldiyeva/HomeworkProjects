package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListHw {
	/*Create a generic ArrayList that will store 5 names into it. 
	 * Find out whether the given ArrayList is empty or not?
	 * Check whether the specific name is present in an ArrayList or not? 
	 * Find the size of your arrayList and print all values from that 
	 */

	public static void main(String[] args) {
		
		ArrayList <String> arrayList=new ArrayList<>(); 
		arrayList.add("Jack");
		arrayList.add("John");
	//	arrayList.add("Chloe");
		arrayList.add("Nyla");
		//arrayList.add("Lila");
		
	//	Find out whether the given ArrayList is empty or not?
		
		if (arrayList.isEmpty()) {
			System.out.println("Please give five names");
		}else {
			if (arrayList.size()<5) {
				System.out.println("Please provide 5 names");	
			}else {
				System.out.println("thanks for providing 5 names");
			}
			
		}
		System.out.println();
		
		// Check whether the specific name is present in an ArrayList or not? 
		
		if (arrayList.contains("Chloe")) { // ---> how can I wrote ignoreCase?????
			System.out.println("You have the specific name in your arrayList");
		}else {
			System.out.println("Pleas provide specific name 'Chloe' ");
		}
		
		System.out.println();
		// Find the size of your arrayList and print all values from that
		
		int size=arrayList.size();
		System.out.println(size);
		
		for (String values:arrayList) {
			System.out.println(values);
		}
	}

}
