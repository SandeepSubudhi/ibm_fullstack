package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dml_UsingPreparedStatement {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
		System.out.println("Connection Establised!!");
		/*//Inserting using PreparedStatement
		PreparedStatement pstmt=dbcon.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?)");
		pstmt.setInt(1,456);
		pstmt.setString(2,"Dipu");
		pstmt.setDouble(3,30000.00);*/
		/*//Updating using PreapredStatement
		PreparedStatement pstmt=dbcon.prepareStatement("UPDATE EMPLOYEE SET NAME=? WHERE ID=?");
		pstmt.setString(1,"Swadhin");
		pstmt.setDouble(2,2);*/
		//Deleting the data using PreparedStatement
		PreparedStatement pstmt=dbcon.prepareStatement("DELETE FROM EMPLOYEE WHERE ID=?");
		pstmt.setInt(1,3);
		int updates=pstmt.executeUpdate();
		ResultSet rs=pstmt.executeQuery("SELECT * FROM EMPLOYEE");
		while(rs.next())
		{
			int id=rs.getInt("Id");
			String Name=rs.getString("Name");
			double sal=rs.getDouble("Salary");
			System.out.println(id+ " - "+Name+" - "+sal);
		}
		pstmt.close();
		dbcon.close();
	}

}
