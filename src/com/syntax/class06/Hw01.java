package com.syntax.class06;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		/*Using scanner class create calculator.
		 * Allow user to enter 2 numbers and operator(+,-,*,/).
		 * Based on operator provide the result to user.
		 */
		Scanner input=new Scanner (System.in);
		int n1, n2,result;
		char operator;
					
			
		System.out.println("Please enter first numbers:");
		
		n1=input.nextInt();
		

		System.out.println("Please enter first number: ");		
		n2=input.nextInt();
		
		System.out.println("Please enter one of the operators that you want to do with these two numbers: +,-,* or /: ");
		
		operator=input.next().charAt(0);
		
		result=0;
		
		switch (operator) {
		case '+':
			result=n1+n2;
			break;
			
		case '-':
			result=n1-n2;
			break;
			
		case '*':
			result=n1*n2;
			break;
			
		case '/':
		    result=n1/n2;
		    break;
		default:
		   System.out.println("You have enetered the wrong operator");
		   
		}
		// if the result was not calculated I do not want to see below message
		if (result!=0) {
			System.out.println("The result of your operation is "+result);
				
		}
		
			
		}

}
