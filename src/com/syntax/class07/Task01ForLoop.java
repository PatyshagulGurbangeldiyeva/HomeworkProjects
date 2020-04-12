package com.syntax.class07;

public class Task01ForLoop {

	public static void main(String[] args) {
		
		// print numbers from 50-1
		
		System.out.println("-----EXAPMLE----------");
		for (int i=50; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		System.out.println("--------------printing odd numbers 1 way--------------");
		
		// int odd numbers between 20 and 50 (2 ways)
		
		for (int z=20; z<=50; z++) {
			if (z%2==1) {
				System.out.print(z+" ");
			}
		
						
		}
		System.out.println(" ");
		System.out.println("-------------SECOND WAY-------");
		
		int b=20;
		
		while (b<=50) {
			if (b%2!=0) 
			System.out.print(b+" ");
			b++;
				}
		
	}

}
