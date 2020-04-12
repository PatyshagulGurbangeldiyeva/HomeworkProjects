package com.syntax.class21;

public class Shape {
	
	/*Shape class has a constructor that takes the radius
	 *  and has a subclass as  circle class. 
	 *  In circle class create a method to calculate the area of circle. 
	 *  Test your code
	 */
	
	int r;
	Shape (int r){
		this.r=r;
	}

}

	class Circle extends Shape{
	double p;
	Circle (int r, double p){
		super(r);
		this.p=p;
	}
	void area() {
		System.out.println("Area of circle is:"+(p*r*r));
	}
}
