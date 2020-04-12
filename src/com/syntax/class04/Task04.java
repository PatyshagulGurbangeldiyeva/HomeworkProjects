package com.syntax.class04;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		System.out.println("Do you have a credit card?");
		
		String card=input.nextLine(); // if we want to capture boolean: boolean card=input.nextBoolean
		
		//  if (card){ System......}
		// we are using boolean like that!!!!
		
		if (card.equals ("yes")){  // we can use here boolean too. but we used String to capture input. on top u will see boolean sample
			
			
			System.out.println("What's your balance?");
			int balance=input.nextInt();
			if (balance>=1000) {
				System.out.println("You need to pay immediately");
			}else {
				System.out.println("You can spend more");
			}
		}else { 
			System.out.println("Would you like to get a new one?");
			
			String answer=input.nextLine();
		}
	}

}

	
	

