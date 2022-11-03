package com.macalsandair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialBurseApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SocialBurseApplication.class, args);
		
		//log.debug("Creating a Context");
		
		//@SuppressWarnings("resource")
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
		
	}

}
