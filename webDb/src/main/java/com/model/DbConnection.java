package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	Connection con;
	public DbConnection()
{
	try {
		Class.forName("org.h2.Driver");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public Connection getConn() {
		try {
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vinz","sa","sa");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
}
}
