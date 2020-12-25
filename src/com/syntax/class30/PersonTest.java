package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {
//	Create a Person class with following private fields: name, lastName, age, salary. 
//	Variables should be initialized through constructor.
//	Inside the class also create a method to print user details.
//	In Test Class create a Map that will store key in ascending order. 
//	In that map store personId and a Person Object. Print each object details.
	
		
		public static void main(String[] args) {
			
			Map <Integer, Person> emp=new TreeMap<>();
			emp.put(456, new Person("Judy","Sun", 45, 4600));
			emp.put(234, new Person("Clara","Hit", 39, 4700));
			emp.put(567, new Person("Jane","Ainshtan", 36, 3500));
			emp.put(123, new Person("Jack","Ngu", 25, 2500));
			
			// we can get obj by using: .values(), .keySet(), .entrySet()
			
			System.out.println("*** getting obj by using .values() ******");
			
			System.out.println("---- 1. using enhanced loop ------");
		
			Collection <Person> col=emp.values();
			
			for (Person c:col) {
				c.info();
			}
			
			System.out.println();
			
			System.out.println("---2. using iterator ------");
			
			Iterator <Person> colIt=col.iterator();
			
			while (colIt.hasNext()) {
				colIt.next().info();
			}
			
			System.out.println();
			
			System.out.println("*** getting obj by using .keySet() ******");
			
			Set <Integer> keys=emp.keySet(); //--> <key> getting all keys (in key part we have Integer)
			
			System.out.println("---- 1. using enhanced loop ------");
			
			for (Integer key:keys ) {
				System.out.println("ID number is "+key);
			    emp.get(key).info();
			}
			System.out.println();
			
		
			
			System.out.println("---2. using iterator ------");
			
			Iterator <Integer> kIt=keys.iterator();
			
			while (kIt.hasNext()) {
				int k=kIt.next();			
				
			System.out.println("the ID number is "+k);
		    emp.get(k).info();
			
			// or we can use like this
			// System.out.println("Id: "+ k+" Name: "+emp.get(k).name+" "+emp.get(k).lastName);  //--> if name and lastName is visible
																								//( but mine are private so it will not work)
			}
			
			System.out.println();
			
			System.out.println("*** getting obj by using .entrySet() ******");
			
		
			Set <Entry <Integer, Person>>entry=emp.entrySet();
			
			System.out.println("---- 1. using enhanced loop ------");
			
			for (Entry<Integer, Person> e:entry) {
				System.out.print("ID number "+e.getKey()+" ");
				e.getValue().info();
				
			}
			System.out.println();
		
			System.out.println("---2. using iterator ------");
			
			Iterator <Entry<Integer, Person>> it=entry.iterator();
			while(it.hasNext()) {
				Entry<Integer, Person> p=it.next();
				System.out.print(p.getKey()+" ");
				p.getValue().info();
			}
		}
	}



