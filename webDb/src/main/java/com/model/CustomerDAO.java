package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {
	private Connection conn;
	public CustomerDAO(){
		DbConnection db = new DbConnection();
		conn = db.getConn();
}
	public boolean insertCustomer(Customer ct)
	{
		boolean bo = true;
		String query = "insert into Customer values(?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1,ct.getId());
			ps.setString(2, ct.getName());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bo = false;
		} 
		return bo;
	}
}
