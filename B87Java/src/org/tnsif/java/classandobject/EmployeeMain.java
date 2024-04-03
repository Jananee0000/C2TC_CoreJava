package org.tnsif.java.classandobject;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//className obj name = new ClassName();
		Employee empOne= new Employee(101,"Rahul",50000.00,"Testing");
		System.out.println(empOne);
		
		Employee empTwo= new Employee();
		empTwo.setEmployeeId(102);
		empTwo.setEmployeeName("Ravi");
		empTwo.setSalary(70000.00);
		empTwo.setDepartment("HR");
		System.out.println(empTwo);
		
		//user input through scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		//System.out.println(id);
		System.out.println("Enter the employee name");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the employee salary");
		double salary=sc.nextDouble();
		System.out.println("Enter the employee department");
		String dept=sc.next();
		
		Employee eThree = new Employee(id,name,salary,dept);
		System.out.println(eThree);
		

	}

}
