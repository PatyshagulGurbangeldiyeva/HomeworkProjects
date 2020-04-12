package com.syntax.class19;

public class Student {
	
	/* Write program as a Student class  
	 *  that has instance variables name and address. 
	 *  Create a constructor that will initialize those variables. 
	 *  Print name & address of given  student using displayInfo method.
	 */
	
	String name, address;
	
	Student (String name, String address){
		this.name=name;
		this.address=address;
	}

	protected void display(String name, String address) {
		System.out.println("The student's name is "+this.name+" and address is "+this.address);
	}
	public static void main (String [] args) {
		Student st1=new Student("Patyshagul", "Garland");
		st1.display("Patyshagul", "Garland");
	}
}
