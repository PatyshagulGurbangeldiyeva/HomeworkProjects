package com.syntax.class19;

public class Book {
	/* Write program as a Book class  
	 * that will have 2 Constructors.
	 * While creating an object make sure:
	 * Instance variables are being initialized
	 */

	
	Book (){
		this("Protective parents",100);
		System.out.println("I am a book that parents need me");
	}
	Book (String book, int page){
		System.out.println("this book that will make you find better choices");
	}

	public static void main (String []args) {
		Book book1=new Book ();
	}
}
