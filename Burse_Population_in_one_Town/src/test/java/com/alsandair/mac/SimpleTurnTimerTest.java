package com.alsandair.mac;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.macalsandair.MyApplicationContextConfiguration;
import com.macalsandair.SimpleTurnTimer;

public class SimpleTurnTimerTest {
	
	@Test
	public void testGetTurn ( ) {
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
		System.out.println("here we created an annotation");
		//Turn turn = ctx.getBean(Turn.class);
		SimpleTurnTimer simpleTurnTimer = ctx.getBean(SimpleTurnTimer.class);
		System.out.println("here we take a SimpleTurnTimer singleton instance");
		
		System.out.println(simpleTurnTimer.getTurn());
		
	}
	
	
}
