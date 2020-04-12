package com.syntax.class05;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*Write a program to find largest of three double values using if-else..
		 * if and logical operators provided by a user (numbers must be distinct)
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter three double values");
		
		double n1=input.nextDouble();
		double n2=input.nextDouble();
		double n3=input.nextDouble();
		
		if (n1>n2 && n1>n3) {
			System.out.println(n1+ " is the biggest number");
				
		}else if (n2>n1 && n2>n3) {
				
		System.out.println(n2+ " is the biggest number");
				
		}else if (n3>n1 && n3>n2) {
			System.out.println(n3+" is the biggest number");
						
		}else {
		System.out.println("Please enter different number");
		}
	
}
}
