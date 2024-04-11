package org.tnsif.java.polymorphism;

import org.tnsif.java.inheritence.Citizen;

public class MethodOverridingMain extends Citizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI sb= new SBI();
		System.out.println(sb.getRateofInterest());
		
		RBI ic= new ICICI();
		System.out.println(ic.getRateofInterest());
		
		//Citizen c = new Citizen();
		 MethodOverridingMain m = new  MethodOverridingMain();
		

	}

}
