package com.test;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
//import javax.servlet.Servlet;

/**
 * Servlet implementation class LifecycleDemo
 */
@WebServlet("/LifecycleDemo")
public class LifecycleDemo extends GenericServlet  {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()");
	} 

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory()");
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("serivce()");
		System.out.println("processing request and responde");
	}

}
