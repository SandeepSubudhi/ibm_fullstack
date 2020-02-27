package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcMySqlMain {

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
		System.out.println("Connection Establised!!");
		Statement stmt=dbcon.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM CONNACT");
		while(rs.next())
		{
			int id=rs.getInt("Id");
			String Name=rs.getString("Name");
			double phone=rs.getDouble("phone no.");
			System.out.println(id+ " - "+Name+" - "+phone);
		}
		rs.close();
		stmt.close();
		dbcon.close();
	}

}
