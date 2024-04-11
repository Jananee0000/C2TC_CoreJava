package org.tnsif.java.interfacepackage;

public class CarrotHalwa extends Halwa{
	
	public CarrotHalwa() {
		super();
		System.out.println("carrot halwa is getting ready");
	}

	@Override
	public String consume() {
		// TODO Auto-generated method stub
		System.out.println(whoAmI);
		return  "Eat when Halwa is hot";
	}

	@Override
	public void makeHalwa() {
		// TODO Auto-generated method stub
		System.out.println("Search the receipe and make the carrot halwa");
		
	}

}
