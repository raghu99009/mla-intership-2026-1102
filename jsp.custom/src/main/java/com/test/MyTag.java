package com.test;


import java.util.Date;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int doStringTag() {
		JspWriter out =null;
		try {
			out = pageContext.getOut();
			out.println("Jsp custom Tag :"+new Date());
			out.println("Jsp custom Tag :"+new Date());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	   return SKIP_BODY;
}
}
