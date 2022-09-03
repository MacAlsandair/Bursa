package com.macalsandair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SocialBurseApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SocialBurseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SocialBurseApplication.class, args);
		
		//log.info("The program is started");
		
		
		//log.debug("Creating a Context");
		
		//@SuppressWarnings("resource")
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
		
	}

}
