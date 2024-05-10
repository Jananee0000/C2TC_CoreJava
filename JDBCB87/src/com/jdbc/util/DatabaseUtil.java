package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	private static final String DRIVER_PATH="com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL="jdbc:mysql://localhost:3306/b87";
	private static final String USERNAME="root";
	private static final String PASSWORD="admin123";
	
	public DatabaseUtil() throws RuntimeException {
		try {
			Class.forName(DRIVER_PATH);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Driver did not load properly "+ e.getMessage());
		}
	}
	
	//user defined method
	
	public Connection establishConnection() throws SQLException {
		return DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
	}
}
