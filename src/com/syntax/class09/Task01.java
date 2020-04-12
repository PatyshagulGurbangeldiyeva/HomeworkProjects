package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {
		/*Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */

		System.out.println("FIRST WAY");
		System.out.println();
		char [] letters= new char [6];
		letters[0]='A';
		letters[1]='B';
		letters[2]='C';
		letters[3]='D';
		letters[4]='E';
		letters[5]='F';
		
		System.out.println(letters[5]);
		
		System.out.println();
		System.out.println("Second way");
		
		char [] alphabit;
		alphabit=new char [6];
		alphabit[0]='A';
		alphabit[1]='B';
		alphabit [2]='C';
		alphabit[3]='D';
		alphabit[4]='E';
		alphabit [5]='F';
		System.out.println(alphabit[5]);
		
		System.out.println();
		System.out.println("third way");
		char []symbols= {'A','B','C','D','E','F'};
		System.out.println(symbols[5]);

	}

}
