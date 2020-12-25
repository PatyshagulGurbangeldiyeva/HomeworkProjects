package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceArrayList {

	public static void main(String[] args) {
		
ArrayList <Insurance> insurance= new ArrayList<>();
insurance.add(new Car("Gieco", "WV", 125.9));
insurance.add(new Pet("Pet's Health","cat", 50.8));
insurance.add(new Health("Ambetter",50,18.5));




System.out.println("****using for loop****");
System.out.println();

for (int i=0; i< insurance.size();i++) {
	insurance.get(i).getQuote();
	insurance.get(i).getInsurance();
	System.out.println();
	
}
System.out.println("*****using advance for loop******");

for (Insurance i:insurance) {
	i.getQuote();
	i.getInsurance();
	System.out.println();
}

System.out.println("***** using iterator******");
Iterator <Insurance> it=insurance.iterator();

while (it.hasNext()) {
	Insurance ins=it.next();
	ins.getInsurance();
	ins.getQuote();
	System.out.println();
}
	}

}
