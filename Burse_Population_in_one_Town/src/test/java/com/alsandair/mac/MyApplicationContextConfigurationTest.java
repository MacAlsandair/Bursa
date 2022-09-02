package com.alsandair.mac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.macalsandair.MyApplicationContextConfiguration;
import com.macalsandair.State;
import com.macalsandair.Town;

public class MyApplicationContextConfigurationTest {

	private static final Logger log = LoggerFactory.getLogger(MyApplicationContextConfigurationTest.class);
	
	@Test
	public void testBeanTown() {
		log.debug("Creating a Context");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
		Assertions.assertNotNull(ctx.getBean(Town.class));
		log.debug("{}", ctx.getBean(Town.class).toString());
	}
	
	@Test
	public void testBeanPopCard () {
		log.debug("Creating a Context");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
		log.debug("{}", ctx.getBean(Town.class).toString());
		//log.debug("{}", ctx.getBean(PopCard.class).toString());
	}
	
	@Test
	public void testBeanState () {
		log.debug("Creating a Context");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
		State myState = ctx.getBean(State.class);
		log.debug("{}", myState);
		//log.debug("{}", ctx.getBean(PopCard.class).toString());
	}
	
	
	
}
