package com.syntax.class04;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		
		System.out.println("What loan do you need?");
		
		int loan=scan.nextInt();
		
		if (loan<=200000) {
			System.out.println("Demand rejected");
			
		}else {
			System.out.println("Your demand is accepted");
		}
		
		

	}

}
