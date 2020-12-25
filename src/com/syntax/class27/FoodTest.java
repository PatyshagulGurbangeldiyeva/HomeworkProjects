package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
		

		ArrayList <Food> food= new ArrayList<> ();
		
		food.add(new Soup());
		food.add(new Meat());
		food.add(new Aspragus ());
		food.add(new Chiken ());
		
		for (int i=0; i<food.size();i++) {
			food.get(i).boil();
			food.get(i).cook();
			food.get(i).grill();
		System.out.println("----------------");
			
		}
		
        for (Food f:food) {
        	f.boil();
        	f.cook();
        	f.grill();
        	System.out.println("*******************");
        }
		
        Iterator <Food> foo=food.iterator();
        
        while (foo.hasNext()) {
        	Food x=foo.next();
        	x.boil();
        	x.grill();
        	x.cook();
        	System.out.println("***************");
        }
        
	}

}
