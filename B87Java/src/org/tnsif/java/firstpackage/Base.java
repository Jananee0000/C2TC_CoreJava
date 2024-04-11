package org.tnsif.java.firstpackage;

public class Base {
	
	private int varPrivate=10; //private filed is only visible within that class
	protected int varProtected=20;
	int varDefault=30;
	public int varPublic=40;
	
	
	
	public int getVarPrivate() {
		return varPrivate;
	}

	protected int getVarProtected() {
		return varProtected;
	}
	
	void methodDefault() {
		System.out.println("default access for the base class");
		System.out.println("default variable: "+varDefault);
	}
}
