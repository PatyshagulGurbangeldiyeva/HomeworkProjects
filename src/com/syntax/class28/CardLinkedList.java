package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class CardLinkedList {

	public static void main(String[] args) {
		
		LinkedList <Card> cards=new LinkedList<>();
		
		cards.add(new Visa("Visa", 3400));
		cards.add(new MasterCard("Master Card", 2500));
		cards.add(new AplleCard("Apple Card", 4000));
		
		System.out.println("***** using enhanced for loop *******");
		System.out.println();
		
		for (Card c:cards) {
			c.annualFee();
			c.cashBack();
			System.out.println();
		}
		 System.out.println();
		 System.out.println("****** using for loop****");
		 System.out.println();
		
		 for (int i=0; i<cards.size();i++) {
			 cards.get(i).annualFee();
			 cards.get(i).cashBack();
			 System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("**** using iterator*****");
		 System.out.println();
		 
		 Iterator <Card> it=cards.iterator();
		 
		 while(it.hasNext()) {
			 Card card=it.next();
			 card.annualFee();
			 card.cashBack();
			 System.out.println();
		 }
		 
		
	}

}
