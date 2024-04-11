package org.tnsif.java.secondpackage;

import org.tnsif.java.firstpackage.Base;

public class ExecutorTwo extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bOne = new Base();
		System.out.println(bOne.getVarPrivate());
		//System.out.println(bOne.varDefault);
		ExecutorTwo et = new ExecutorTwo();
		System.out.println(et.varProtected);
		
		System.out.println(bOne.varPublic);
		

	}

}
