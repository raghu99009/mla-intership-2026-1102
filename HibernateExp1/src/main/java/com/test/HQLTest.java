package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		String hql1 = "delete from Customer where c_id =:id";
		Query q = session.createQuery(hql1);
		q.setParameter("id",252);
		int row = q.executeUpdate();
		String hql = "from Customer ";
        Query<Customer> dt = session.createQuery(hql,Customer.class);
        List<Customer> list = dt.getResultList();
        System.out.println("Result");
        list.forEach(System.out::println);
        t.commit();
        session.close();
	}

}
