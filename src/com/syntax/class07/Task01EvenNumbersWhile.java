package com.syntax.class07;

public class Task01EvenNumbersWhile {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		
		// WHILE
		int a=20;
		while (a>=1) {
			if (a%2!=1) 
				System.out.print(a+" ");
				a--;
			
		}
		
		System.out.println(" ");
		System.out.println("----------------------2nd way----------------");
		
		
		for (int z=20;z>=1;z--) {
			if (z%2==0) {
				System.out.print(z+" ");
			}
		}
		
		
	}

}
