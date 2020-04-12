package com.syntax.class22;

public class Student {
	/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
	 * Define common behavior within parent class and override some of the methods in child classes
	 * Define some methods specific to child classes
	 * Write example of achieving run time polymorphism
	 */
	public void study () {
		System.out.println("Students are studying");
	}
	public void doHomework() {
		System.out.println("Students are doing homework");
	}
}

class SyntaxStudent extends Student {
	@Override
	public void study() {
		super.study();// ---> calling parent class method
		System.out.println("Syntax students are studying");
	}
	// @Override ---> if you will write this to check override it will give CE as it is not overriding
	public void getJob() {
		System.out.println("Syntax students will get a job");
	}
}

class CollegeStudentd extends Student {
	public void read() {
		System.out.println("college students are reading");
	}
	public void study() {
		System.out.println("college students are studying");
	}
}

class SchoolStudent extends Student {
	public void sutdy() {
		System.out.println("school students stydy hard");
	}
	public void doHomework() {
		System.out.println("school studnets do homework a lot");
	}
}