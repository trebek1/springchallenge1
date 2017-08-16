package com.alex.spring.ioc.demo.challenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		// create application context (container) 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml"); 
		
		// create the bean 
		City city = (City) ctx.getBean("mycity"); 
		
		// print city name 
		city.cityName();  
		
		((ClassPathXmlApplicationContext)ctx).close(); 
		
	}

}
