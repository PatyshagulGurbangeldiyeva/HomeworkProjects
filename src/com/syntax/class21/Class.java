package com.syntax.class21;

public class Class {
	/*Create 1 class with a static method that has 3 overloaded forms. 
	 * Then call each overloaded method with specific arguments and observe result.
	 */
	
	static void method1(String str1) {
			
		System.out.println(str1);
	}
	static void method1(String str1, String str2) {
		System.out.println(str1+" "+str2);
	}
	static void method1(String str1, String str2, String str3) {
		System.out.println(str1+" "+str2+" "+str3);
	}
	public static void main (String []args) {
		Class obj=new Class ();
		obj.method1("Hello");
		obj.method1("Hello","how are");
		obj.method1("hello", "how are","you?");
	}
	

}
