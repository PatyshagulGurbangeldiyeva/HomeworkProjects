package com.syntax.class09;

public class Task02 {

	public static void main(String[] args) {
		/*Create an array of names and store all names of your group.
		 *  Then print your name from that array. 
		 *  (use 2 different ways of creating an array).
		 */

		System.out.println("FIRST WAY");
		String [] names=new String[6];
		names[0]="Selbinyyaz";
		names[1]="Patyshagul";
		names[2]="Adile";
		names[3]="Arzu";
		names[4]="Guljemal";
		names[5]="Azra";
		
		System.out.println(names[1]);
		
		System.out.println();
		
		System.out.println("SECOND WAY");
		
		String [] name= {"Selbinyyaz","Patyshagul","Adile","Arzu","Guljemal","Azra"};
		System.out.println(name[1]);
		
	}

}
