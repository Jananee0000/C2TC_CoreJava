package org.tnsif.java.firstpackage;

public class ExecutorOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base bOne = new Base();
		System.out.println(bOne.getVarPrivate());
		System.out.println(bOne.varPublic);
		System.out.println(bOne.varProtected);
		System.out.println(bOne.varDefault);

	}

}
