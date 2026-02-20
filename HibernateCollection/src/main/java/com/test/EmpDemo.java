package com.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		List<String> s1 = Arrays.asList("java","DevOps");
		List<String> s2 = Arrays.asList("php","python","React");
		Employee emp1 = new Employee();
		emp1.setE_name("Rohit");
		emp1.setSkills(s1);
		Employee emp2 = new Employee();
		emp2.setE_name("kohli");
		emp2.setSkills(s2);
		session.persist(emp1);
		session.persist(emp2);
		//t.commit();
		session.close();
	}

}
