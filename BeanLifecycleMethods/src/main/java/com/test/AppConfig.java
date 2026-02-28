package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.test")
public class AppConfig {
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx  = new AnnotationConfigApplicationContext(AppConfig.class);
		ConnectionManager cm =ctx.getBean(ConnectionManager.class);
		cm.operation();
		ctx.close();
	}
	

}
