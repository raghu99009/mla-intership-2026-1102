package com.test;

import java.util.List;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDao edao = new EmpDao();
		Employee emp1  = new Employee();
		
		emp1.setId(2);
		emp1.setName("Raju kumar");
		emp1.setCmp("CGI");
		emp1.setCity("HYB");
		emp1.toString();
		//edao.saveEmployee(emp1);
		//edao.updateEmployee(emp1);
		edao.deleteEmployee(1);
		System.out.println("updated Employee Data..");
		List <Employee> data = edao.getAllEmployees();
		data.forEach(System.out::println);
		
	}

}
