package org.tnsif.java.polymorphism;

public class MethodOverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI sb= new SBI();
		System.out.println(sb.getRateofInterest());
		
		RBI ic= new ICICI();
		System.out.println(ic.getRateofInterest());

	}

}
