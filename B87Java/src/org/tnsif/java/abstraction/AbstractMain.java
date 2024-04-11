package org.tnsif.java.abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cannot instantiate the abstract class
		//Shape s= new Shape();
		
		Shape sOne = new Square(2.5f);
		sOne.calculateArea();
		sOne.display();
		
		Shape sTwo = new Rectangle(7,8.5f);
		sTwo.calculateArea();
		sTwo.display();
		
		

	}

}
