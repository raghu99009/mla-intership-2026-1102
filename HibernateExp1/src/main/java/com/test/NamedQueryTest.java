package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class NamedQueryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createNamedQuery("customquery");
		query.setParameter("name","SKY1");
		List list = query.getResultList();
		System.out.println(list);
		t.commit();
		session.close();
		

	}

}
