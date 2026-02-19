package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password = "root@39";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   con = DriverManager.getConnection(url,username,password);
		   System.out.println("connection created");
		   Statement stm = con.createStatement();
		   String sql = "";
		  ResultSet rs = stm.executeQuery(sql);
		   
		   con.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
}
