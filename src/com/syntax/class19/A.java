package com.syntax.class19;

public class A {
	/* Write program for multilevel inheritance 
	 * where class A inherited by B 
	 * and class B inherit class by C.
	 * 
	 * Write program to inherit class A 
	 * that has method printF which is static
	 *  and call or reuse that method into class B
	 */

	static void printF() {
		System.out.println("PrintF");
	}
}

class B extends A {

	public static void main (String []args) {
		A callA=new B();
		
		
		
	}
	
	
}

class C extends B{
	public static void main(String[] args) {
		A prtintF=new C();
		A.printF();
	}
}

