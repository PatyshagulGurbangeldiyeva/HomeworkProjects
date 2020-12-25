package com.syntax.class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class Welociming {

	public static void main(String[] args) {
		/* Create the collection that will store single uniques ---> it means that it doesn't allow duplicates
		 * Objects of a String type in which order is preserved.
		 * Write a logic to concatenate all string from the collection.
		 */


		Set <String> unique=new LinkedHashSet<>();
		unique.add("Welcome ");
		unique.add("to ");
		unique.add("our ");
		unique.add("class ");
		unique.add("where ");
		unique.add("find your self!");
		
		for (String u:unique) {
			System.out.print(u);
		}

	}

}
