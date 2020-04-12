package com.syntax.class21;

public class Class1 {
	/*Create 1 class with a private method that has 3 overloaded forms. 
	 * Then call each overloaded method with specific arguments and observe result.
	 */

	private void method() {
		System.out.println("I");
	}
	private void method (String str) {
		this.method();
		System.out.println(str);// here how I can concat the first default method??
	}
	private void method (String str, String str1) {
		this.method();
		System.out.println(str+" "+str1);
	}
	private static void main (String [] args) { // we can access them just in the same class
		Class1 obj=new Class1();				// as methods are private
		obj.method();
		obj.method("love");
		obj.method("love", "you");
	}
}
