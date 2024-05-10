package com.tnsif.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.model.Employee;

import om.jdbc.service.DatabaseService;

public class EmployeeMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DatabaseService dbService = new DatabaseService();
		try (Scanner sc = new Scanner(System.in);) {
			boolean isRunning = true;
			while (isRunning) {
				System.out.println(" Enter your choice ");
				System.out.println("1. insert ");
				System.out.println("2. select all ");
				System.out.println("3. select by employee id ");
				System.out.println("4. delete employee ");
				System.out.println("5. update employee ");
				System.out.println("6. Exit ");

				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					System.out.println("Enter name, address, salary");
					Employee emp = new Employee(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()));
					dbService.insertEmployee(emp);
					break;
				case 2:
					dbService.getAllEmployee();
					break;
				case 3:
					System.out.println("Enter the employee id");
					dbService.getEmployeeById(Integer.parseInt(sc.nextLine()));
					break;
				case 4:
					System.out.println("enter the employee id");
					dbService.deleteEmployeeById(Integer.parseInt(sc.nextLine()));
					break;
				case 5:
					System.out.println("enter the employee id");
					int id = Integer.parseInt(sc.nextLine());
					boolean isFound = dbService.getEmployeeById(id);
					if(isFound) {
						System.out.println("enter the name, address, salary");
						Employee empl = new Employee(id, sc.nextLine(),sc.nextLine(), Double.parseDouble(sc.nextLine()));
						dbService.updateEmployee(empl);
						
					}
					break;
				case 6:
					System.out.println("Thank you for using the application!");
					isRunning = false;
					break;
				default:
					System.out.println("Incorrect choice, please enter valid choice");
					break;
					

				}
			}

		}

	}

}
