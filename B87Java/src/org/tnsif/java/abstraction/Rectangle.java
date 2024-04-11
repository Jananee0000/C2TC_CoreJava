package org.tnsif.java.abstraction;

public class Rectangle extends Shape {
	
	float length, breadth;
	
	public Rectangle(float length, float breadth) {
		super();
		this.breadth=breadth;
		this.length=length;
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return area=length*breadth;
	}

}
