package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {
	public static void main(String args[]) {
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = sf.openSession();
	Transaction t = session.beginTransaction();
	College c1 = new College();
	c1.setC_name("MLA1");
	Student s1 = new Student();
	s1.setC_name("sandy");
	s1.setS_type("Regular");
	s1.setS_branch("CSE");
	Faculity f1 = new Faculity();
	f1.setC_name("Arjun");
	f1.setF_type("Regular");
	f1.setF_skill("Admin");
	session.persist(c1);
	session.persist(s1);
	session.persist(f1);
	t.commit();
	

}
}
