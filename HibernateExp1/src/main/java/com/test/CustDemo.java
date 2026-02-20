package com.test;

import java.util.List;

public class CustDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustDao cdao = new CustDao();
		Customer cst = new Customer();
		cst.setC_id(202);
		cst.setC_name("ram");
		cst.setC_city("North_city");
		//cdao.saveCustomer(cst);
		//cdao.updateCustomer(cst);
		cdao.deleteCustomer(cst);
		//List<Customer> list = cdao.getAllCustomers();
		System.out.println("Done...");
		//list.forEach(System.out::println);

	}

}
