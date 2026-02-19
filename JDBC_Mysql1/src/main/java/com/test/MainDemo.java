package com.test;

import java.util.List;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student std = new Student();
		  StudDao sda = new StudDao();
		  std.setAge(19);
		  std.setName("raju");
		  std.setId(01);
		  //sda.savaStudent(std);	 
		  System.out.println("updated Student Data..");
           List <Student> data1 = sda.getAllStudent();
           data1.forEach(System.out::println);
	}

}
