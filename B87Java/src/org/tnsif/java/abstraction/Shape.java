package org.tnsif.java.abstraction;

public abstract class Shape {
	static float area;
	//float area;
	
	//abstract method
	public abstract float calculateArea() ;
	
	
	//non abstract method
	public void display() {
		System.out.println("area of the shape: "+area);
	}
}
