package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StoteData {

	public static void main(String[] args) {
		      Configuration cfg = new Configuration();
		      cfg.configure("hibernate.cfg.xml");
		      SessionFactory sf = cfg.buildSessionFactory();
		      Session session = sf.openSession();
		      Transaction t = session.beginTransaction();
		      Book obj = new Book();
		      obj.setB_name("DELL");
		      obj.setB_author("MPA");
		      obj.setB_price(30);
		      
		      Query<Book> q = session.createQuery("from Book");
		      List<Book> list = q.list();
		      for(Book b:list) {
		    	  System.out.println(b.getId()+" "+b.getB_name()+" "+b.getB_author());
		      }
		      
		      //session.persist(obj);
		      //t.commit();
		      /*
		      Book dt = session.get(Book.class,1);
		      System.out.println(dt.getId()+" "+dt.getB_name()+" "+dt.getB_author()+" "+dt.getB_price());
		      dt.setB_name("js");
		      dt.setB_author("EY");
		      dt.setB_price(25);
		      //session.persist(obj);
		     // t.commit();
		     session.remove(dt);
		      t.commit();
		      System.out.println("Done..");
		      */
		      

	}

}
