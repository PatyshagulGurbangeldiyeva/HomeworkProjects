package com.syntax.class22;

public class StudetnTest {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.study();
		student.doHomework(); //here we get from our own class
		
		System.out.println("--------");
		System.out.println();
		
		SyntaxStudent syntax=new SyntaxStudent();
		syntax.study(); // here in the parent class we wrote super calling method
		syntax.getJob();
		// access from own class syntaxStudents...=.. SyntaxStudents()
		
		System.out.println("------");
		System.out.println();
		
		// lets do overriding and upcasting
		// parentClass ...=new  childClass 
			Student st=new SyntaxStudent(); // --->kicini ula goyjak bolyas
			st.study(); // ----> when we use this syntax we cann access to the methods that were declared in parent class
						// information must be too in the parent class
			student.doHomework();// ---> even the method is not in child class but it is in parent class
								// ---> the method will be executed
			student.study();
	//		student.getJob();---> will not be executed as it is not in parent class!!!!
			

	}

}
