package com.alsandair.mac;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class MyApplicationContextConfiguration {

	@Bean
	@Scope("singleton")
	public Town town() {
		return new Town();
	}
	
	@Bean 
	@Scope("singleton")
	public Console console() {
		return new Console();
	}
}
