package org.tnsif.java.interfacepackage;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Food f=new Food();
		Halwa fOne = new CarrotHalwa();
		fOne.makeHalwa();
		System.out.println(fOne.consume());
	}

}
