package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class Employee {
	
//	Create a Map that will store Employee name and salary. 
//	Write a logic to retrieve an employee who gets the highest salary. 
//	Output should be in the below format
//	John Smith=$100000
	
	
	public static void main(String[] args) {
		
		Map <String, Integer> emp=new LinkedHashMap<>();
		
		emp.put("Maks Burg", 3400);
		emp.put("Jane Auston", 2350);
		emp.put("Nate Dove", 4555);
		emp.put("John Smith", 100000);
		
		int maxSalary = Collections.max(emp.values()); /// ask to friends how did they found it
		
		Set <Entry <String, Integer>> em=emp.entrySet();
		
		System.out.println("*** using iteragtor ******");
		
		Iterator <Entry<String, Integer>>it=em.iterator();
		
		while(it.hasNext()) {
			Entry <String, Integer>next=it.next();
			
			if (next.getValue()==maxSalary) {
				System.out.println(next.getKey()+"=$"+next.getValue());
				
			}
			
		}
		
		System.out.println();
		
		 System.out.println("*** Using for enhanced loop *****");
		for (Entry<String, Integer> e:em) {
			if (e.getValue()==maxSalary) {
				System.out.println(e.getKey()+"=$"+e.getValue());
			}
		}
		System.out.println();
		System.out.println("******Using without collections.max()********");
		
		 Integer max=emp.get("Maks Burg");//--> referans is our MAP!!!!--> returns the value ( we use get() in order to get key from the map and get value
		 for (Entry <String, Integer> empl:em) {
			 if (empl.getValue()>max) {
				 System.out.println(empl.getKey()+"=$"+empl.getValue());
			 }
		 }
		
		
	}

}
