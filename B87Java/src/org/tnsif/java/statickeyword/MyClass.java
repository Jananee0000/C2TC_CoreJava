package org.tnsif.java.statickeyword;

public class MyClass {
	private int section; //non static variable or instance variable
	private static int srNo; //static variable or class varibale
	
	MyClass(){
		System.out.println("within default constructor");
		srNo++;
	}
	//static block
	static {
		System.out.println("within the static block");
		srNo=1000;
	}
	public static void display() {
		//cant access non static member from a static member
		//System.out.println(section);
		System.out.println(srNo);
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + ", serial Number=" + srNo +"]";
	}
	
	

}
