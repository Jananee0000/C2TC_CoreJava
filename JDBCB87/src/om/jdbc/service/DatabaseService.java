package om.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.model.Employee;
import com.jdbc.util.DatabaseUtil;
import com.jdbc.util.QueryUtil;

public class DatabaseService {
	
	DatabaseUtil dbutil= new DatabaseUtil();
	//to insert  employee records to the table
	public void insertEmployee(Employee emp) throws SQLException {
		try(Connection con=dbutil.establishConnection();
			PreparedStatement ps=con.prepareStatement(QueryUtil.insertEmployeeQuery());){
			ps.setString(1, emp.getEmployeeName());
			ps.setString(2, emp.getEmployeeAddress());
			ps.setDouble(3, emp.getEmployeeSalary());
			int rows=ps.executeUpdate(); //0 or 1
			if(rows>0) {
				System.out.println("record created successfully");
			}else {
				System.out.println("insert record is failed");
			}
			
			
			
		}
	
	}
	
	//to retrieve all the records from table
	
	public void getAllEmployee() throws SQLException {
		try(Connection con=dbutil.establishConnection();
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(QueryUtil.selectAllEmployeeQuery());){
			
			while(rs.next()) {
				printEmployee(new Employee(rs.getInt("employee_Id"),
						rs.getString("employee_Name"),
						rs.getString("employee_Address"),
						rs.getDouble("employee_Salary")));
			}
		}
				
		
	}
	
	
	
	//to print all the employees
	public void printEmployee(Employee emp) {
		System.out.println("employee id: "+ emp.getEmployeeId());
		System.out.println("employee name: "+ emp.getEmployeeName());
		System.out.println("employee address: "+emp.getEmployeeAddress());
		System.out.println("employee salary: "+emp.getEmployeeSalary());
	}
	
	
	//to retrieve specific records bypassing the id
	public boolean getEmployeeById(int id) throws SQLException{
		boolean isFound=false;
		try(Connection con=dbutil.establishConnection();
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(QueryUtil.selectEmployeeById(id));){
			if(rs.next()) {
				isFound=true;
				printEmployee(new Employee(rs.getInt("employee_Id"),
						rs.getString("employee_Name"),
						rs.getString("employee_Address"),
						rs.getDouble("employee_Salary")));
			}else {
				System.out.println("record is not available for the id: "+id);
			}
			
		}
		return isFound;
			
				
		
	}
	//to delete employee
	public void deleteEmployeeById(int id) throws SQLException{
		try(Connection con=dbutil.establishConnection();
				Statement stmt=con.createStatement();){
			int rows=stmt.executeUpdate(QueryUtil.deleteEmployeeById(id));
			if(rows>0) {
				System.out.println("record deleted successfully");
			}else {
				System.out.println("delete record is failed");
			}
			
		}
			
	}
	
	//update the records
	public void updateEmployee(Employee emp) throws SQLException{
		try(Connection con=dbutil.establishConnection();
				PreparedStatement	ps=con.prepareStatement(QueryUtil.UpdateEmployeeById(emp.getEmployeeId()));){
			ps.setString(1, emp.getEmployeeName());
			ps.setString(2, emp.getEmployeeAddress());
			ps.setDouble(3, emp.getEmployeeSalary());
			int rows=ps.executeUpdate(); //0 or 1
			if(rows>0) {
				System.out.println("record updated successfully");
			}else {
				System.out.println("update record is failed");
			}
			
		
		
		
		
		
		}
	
	
	
	
	}
	

}
