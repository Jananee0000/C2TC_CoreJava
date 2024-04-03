package org.tnsif.java.classandobject;

public class Employee {
	//instance variables
	private int employeeId;
	private String employeeName;
	private double salary;
	private String department;
	
	//default constructor
	public Employee() {
		System.out.println("default constructor is called");
		
	}
	
	//parameterized constructor
	public Employee(int employeeId, String employeeName, double salary, String department) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}
	
	
	
	
	//data encapsulation - make the members private, create getters and setters
	
	

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public void setDepartment(String department) {
		this.department = department;
	}

	//toString overriding method from object class

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	
	
	
	
}
