package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudDao {
	public static Connection getCon() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String pas = "root@39";
		 Connection con = null;
		 try {
			 Class.forName(driver);
			 con=DriverManager.getConnection(url,user,pas);	
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		 return con;
     }
	public void savaStudent(Student std) {
		
		try {
			
			String sql = "insert into students1(id,name,age) values(?,?,?)";
			Connection con = StudDao.getCon();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, std.getId());
			pst.setString(2, std.getName());
			pst.setInt(3, std.getAge());
			pst.execute();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public List <Student> getAllStudent(){
		List <Student> stdList = new ArrayList<>();
		try {
			
			String sql = "select * from students1";
			   PreparedStatement pst = StudDao.getCon().prepareStatement(sql);
			   ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Student stud = new Student();
			stud.setId(rs.getInt(1));
			stud.setName(rs.getString(2));
			stud.setAge(rs.getInt(3));
			stdList.add(stud);
		}
					
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return stdList;
	}
}
