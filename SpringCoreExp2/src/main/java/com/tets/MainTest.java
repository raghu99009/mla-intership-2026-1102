package com.tets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		  Customer obj = ctx.getBean("cst1",Customer.class);
//		  System.out.println(obj);
          ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
          Address aobj = ctx.getBean(Address.class);
          aobj.setCity("Tirumala");
          aobj.setState("AP");
          aobj.setCountry("IN");
          
          Address aobj1 = ctx.getBean(Address.class);
          
          aobj.setCity("Tirumala");
          aobj.setState("AP");
          aobj.setCountry("IN");
          List<Address> list = Arrays.asList(aobj,aobj1);
          Customer cst = ctx.getBean(Customer.class);
          
          cst.setId(1122);
          cst.setName("SKY");
          cst.setAdr(list);
          
          System.out.println(cst);
	}

}
