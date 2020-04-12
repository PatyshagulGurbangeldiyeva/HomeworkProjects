package com.syntax.class21;

public class Calculate {
	// Create 1 class in which create a methods that will calculate
	// the area (volume) of Rectangle Square Box
	// Use separate class to test your code
	
	protected int areaRectangle (int longSide, int shortSide) {
		int area=longSide*shortSide;
		System.out.println("the area of rectangle is "+area);
		return area;
	}
	protected int areaSquare(int side) {
		int area=side*side;
		System.out.println("the area of square is "+area);
		return area;
	}
	protected int volume(int width, int length, int heigth) {
		int volume= width*length*heigth;
		System.out.println("the volume of box is "+ volume);
		
		return volume;
		
	}

}
