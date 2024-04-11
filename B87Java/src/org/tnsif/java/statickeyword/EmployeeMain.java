package org.tnsif.java.statickeyword;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(EmployeeStatic.getCompany());
		EmployeeStatic eOne = new EmployeeStatic(101,"Rahul");
		System.out.println(eOne);
		
		EmployeeStatic eTwo = new EmployeeStatic(102,"Ravi");
		System.out.println(eTwo);
	}

}
