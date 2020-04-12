package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Please enter your quiz score");
		
		double quiz=input.nextDouble();
		
		System.out.println("Please enter your mid term score");
		
		double midTerm=input.nextDouble();
		
		System.out.println("Please enter your final score");
		
		double finalScore=input.nextDouble();
		
		double average=(quiz+midTerm+finalScore)/3;
		
		if (average>=90) {
			System.out.println("Your grade is A");
		}else if (average>=70 && average<90) {
			System.out.println("Your grade is B");
		}else if (average>=50 && average<70) {
			System.out.println("Your grade is C");
		}else {
			System.out.println("Your grade is F");
		}		
	}

}
