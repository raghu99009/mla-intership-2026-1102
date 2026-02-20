package com.test;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CustDao {
	
	public static Session getDBSession() {
       Session session = null;
		try {
			   // Configuration cfg = new Configuration();
			   // cfg.configure("hibernate.cfg.xml");
			    //SessionFactory sf = cfg.buildSessionFactory();
			    //session = sf.openSession();
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			 session = sf.openSession();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return session;
		
	}
	
     public void saveCustomer(Customer cst) {
    	 Session session = CustDao.getDBSession();
    	    Transaction t = session .beginTransaction();
    	     // session.persist(cst);
    	    //session.merge(cst,202);
    	    ///session.merge(cst);
    	    t.commit();
    	   // CustDao.getDBSession().close();
     }
     public List<Customer> getAllCustomers(){
    	 //List<Customer> list = new ArrayList<>();
    	 Query<Customer> q = CustDao.getDBSession().createQuery("from Customer");
    	 List<Customer> list = q.list();
    	 return list;
     }
     public void updateCustomer(Customer cst) {
    	 Session session = CustDao.getDBSession();
    	 Transaction t = session.beginTransaction();
    	 Customer obj = session.find(Customer.class,cst.getC_id());
    	 obj.setC_name(cst.getC_name());
    	 obj.setC_city(cst.getC_city());
    	 t.commit();
    	 session.close();
     }
     public void deleteCustomer(Customer cst) {
    	 Session session = CustDao.getDBSession();
    	 Transaction t = session.beginTransaction();
    	 session.remove(cst);
    	 t.commit();
    	 session.close();
     }

}
