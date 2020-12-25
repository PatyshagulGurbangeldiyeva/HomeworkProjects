package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionInteger {

	public static void main(String[] args) {
		/* Create a collection of integers in which you can keep duplicates.
		 * Write a logic to find sum of all integers 
		 */


		ArrayList <Integer> col=new ArrayList<>();
		
		col.add(1);
		col.add(2);
		col.add(3);
		col.add(4);
		
		
		System.out.println("**** using iterator *******");
		Iterator <Integer> sum=col.iterator();
		int total=0;
		while (sum.hasNext()) {
			
			total+=sum.next();
			
		}
		System.out.println(total);
		
		
		System.out.println();
		System.out.println("**** using for enhanced loop ******");
		int tot=0;
		for (Integer c:col) {
			tot+=c;
		}
		System.out.println(tot);
	}

}
