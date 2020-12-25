package com.syntax.class28;

public abstract class Card {
	/* Create a Card class 
	 *that will have implemented  and unimplemented methods 
	 *and a constructor that will initializes credit card type.  
	 *Create 3 subclasses of a Card card. 
	 *Create 3 objects of different card and store them into LinkedList. 
	 *Using for loop/advanced for loop/ iterator access all methods of the class.
	 */

	String cardType;
	double cashBack;
	double charge;
	
	Card(String cardType, double charge){
		this.cardType=cardType;
		this.charge=charge;
		
	}
	public abstract void annualFee();
	public double  cashBack() {
		if (charge>3000) {
			System.out.println("Your cashback is 1%");
		}else {
			System.out.println("Try to charge more than 3000$ in order to get cashback");
		}
		
		return cashBack;
		
	}
}
class Visa extends Card{

	Visa(String cardType, double charge) {
		super(cardType, charge);
		
	}

	@Override
	public void annualFee() {
		System.out.println("If you will choose "+cardType+" you will not have anual fee");
		
	}
	
}
class MasterCard extends Card{

	MasterCard(String cardType, double charge) {
		super(cardType, charge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void annualFee() {
		if (charge>1500) {
			System.out.println("You will not have annualFee");
		}else {
			System.out.println("Your annual fee will depend on your charge");
		}
		
	}
	
}
class AplleCard extends Card{

	AplleCard(String cardType, double charge) {
		super(cardType, charge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void annualFee() {
		System.out.println(cardType+" does not have annual fee");
		
	}
	
}
