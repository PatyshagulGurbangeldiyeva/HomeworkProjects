package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers {
	/*Create an arrayList of even numbers from 1 to 50.
	 * Using Iterator remove any number that is divisible by 5 from that arrayList.
	 * 
	 */

	public static void main (String [] args) {
	ArrayList <Integer> evenNumbers=new ArrayList<>();
	
	for (int i=0; i<51;i+=2) {
		evenNumbers.add(i);
	}
	System.out.println(evenNumbers);
	
	Iterator <Integer> five=evenNumbers.iterator();
	
	while (five.hasNext()) {
		if (five.next()%5==0) {
			five.remove();
		}
	}
	System.out.println(evenNumbers);
	}
}
