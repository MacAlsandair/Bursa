package com.alsandair.mac;
import org.slf4j.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GeneralSystem {
	
	//create a logger
	private static final Logger log = LoggerFactory.getLogger(GeneralSystem.class);
	
	
	public static void main (String [] args) {
		
		log.info("The program is started");
		
		
		log.debug("Creating a Context");
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
		
		//Town town = new Town ();
		//PopCard.setBurseTown(ctx.getBean(Town.class));
		//TurnSystem.setBurseTown(ctx.getBean(Town.class));
		
		//TurnSystem.setTown(ctx.getBean(Town.class));
		
		//GeneralSystem.dummyStart();
		
		//GeneralSystem.startLogic();
		//log.info("Creating a console");
		log.debug("Creating a thread for the console");
		Thread threadConsole = new Thread(ctx.getBean(Console.class));
		threadConsole.start();
		log.debug("Thread is started");
		PopCardBuilder.createPopCard(100, SocialClass.RICH, ctx.getBean(Town.class));
	}
	
	//public static void startLogic () {

	//}
	

}
