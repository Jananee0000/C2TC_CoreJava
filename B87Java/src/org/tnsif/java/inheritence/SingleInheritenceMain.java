package org.tnsif.java.inheritence;

public class SingleInheritenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student sOne= new Student(5467583454l,"Indian","19/04/1999","Bangalore, karnataka",014,"Afreen","CSE",8923456789l);
		System.out.println(sOne);
		
		sOne.setDob("19/10/1999");
		System.out.println(sOne);

	}

}
