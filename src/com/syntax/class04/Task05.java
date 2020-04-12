package com.syntax.class04;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner question=new Scanner (System.in);
		System.out.println("How many years did you work?");
		
		int years=question.nextInt();
		
		System.out.println("What is your annual salary?");
		
		double salary=question.nextDouble();
		
		if(years>=5) {
			System.out.println("You can get bonus");
			if (salary>50000) {
				System.out.println("You will get 5000$");
			}else {
				System.out.println("You will get 3000$");
			}
		}else {
			System.out.println("Try to work more years!");}
		
		
	}
	
}
