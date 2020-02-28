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
		//Inserting an row/data
		//stmt.executeUpdate("INSERT INTO CONTACT VALUES(4,'SWADHIN',700844.00)");
		//Deleteing an row/data.
		//stmt.executeUpdate("DELETE FROM CONTACT WHERE ID=2");
		//updating the data.
		//stmt.executeUpdate("UPDATE CONTACT SET Name='DIPU', phone=789456.00 WHERE ID=3");
		//copying data from one table to another
		//stmt.executeUpdate("INSERT INTO CONTACTCOPY SELECT * FROM CONTACT");
		ResultSet rs=stmt.executeQuery("SELECT * FROM CONTACT");
		while(rs.next())
		{
			int id=rs.getInt("Id");
			String Name=rs.getString("Name");
			double phone=rs.getDouble("phone");
			System.out.println(id+ " - "+Name+" - "+phone);
		}
		System.out.println("----------------------------");
		ResultSet rs1=stmt.executeQuery("SELECT * FROM CONTACTCOPY");
		while(rs1.next())
		{
			int id=rs1.getInt("Id");
			String Name=rs1.getString("Name");
			double phone=rs1.getDouble("phone");
			System.out.println(id+ " - "+Name+" - "+phone);
		}
		rs1.close();
		rs.close();
		stmt.close();
		dbcon.close();
	}

}
