package com.tnsif.java.collecfions;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> cars = new Vector<>();
		cars.add("Ferrari");
		cars.add("Bugatti");
		cars.add("Maruthi suzuki 800");
		cars.add("Porshe");
		
		System.out.println("cars in the vector: " +cars);
		System.out.println("Car in index 2: "+cars.get(2));
		System.out.println("cars in the vector: " +cars);
		
		Iterator<String> itr=cars.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		}
	}
	
}
