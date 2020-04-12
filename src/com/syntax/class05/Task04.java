package com.syntax.class05;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*Program to find largest number among three numbers 
		 * using nested if provided by a user (numbers must be distinct)
		 */

		Scanner input=new Scanner (System.in);
		
		System.out.println("Please privide three numbers");
		double n1=input.nextDouble();
		double n2=input.nextDouble();
		double n3=input.nextDouble();
		
		double largest;
		if (n1>n2) {
			if (n1>n3) {
				largest=n1;	
			}else {
			   largest=n3;
			}
		
		}else {//n2>n1
			if (n2>n3) {
			  largest=n2;
			}else {
			  largest=n3;
			}
		
	}
		System.out.println("The largest number is "+largest);
	}
		
	}
		


