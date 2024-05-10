package com.jdbc.util;

public class QueryUtil {
	//Inserrt query
	public static String insertEmployeeQuery() {
		return "INSERT INTO employee(employee_name,employee_address,employee_salary) VALUES (?,?,?)";
	}
	
	//retrieval query
	public static String selectAllEmployeeQuery() {
		return "SELECT * FROM employee";
	}
	
	//retrieval for only specific id
	public static String selectEmployeeById(int employeeId) {
		return "SELECT * FROM employee WHERE employee_id= " +employeeId; 
	}
	
	//query to delete the record
	public static String deleteEmployeeById(int employeeId) {
		return "DELETE FROM employee WHERE employee_id= " +employeeId;
	}
	
	//query to update the record
	public static String UpdateEmployeeById(int employeeId) {
		return "UPDATE employee SET employee_name = ?, employee_address = ?, employee_salary = ? WHERE employee_id= " +employeeId;
	}
	
	
	
	
	
}
