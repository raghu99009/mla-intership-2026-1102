package com.tets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class AnnoConfig {
	@Bean
	//@Scope( value = "singleton", proxyMode = ScopedProxyMode.DEFAULT)
	@Primary
	public Address getAddress() {
		return new Address();
	}
	@Bean
	public Customer getCustomer() {
		return new Customer();
	}      
}
