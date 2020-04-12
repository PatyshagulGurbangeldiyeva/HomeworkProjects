package com.syntax.class04;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("What city do you live?");
		
		String city=scan.nextLine();
		
		System.out.println("What is the temperature of your city in Fahrenheit?");

		float fahrenheit=scan.nextFloat();
		
		System.out.println("We will convert it to Celsius");
		
		float celsius=(fahrenheit-32)*5/9;
		
		System.out.println("The temperature is the city "+city+" is "+celsius);
		
		
		
	}

}
