package com.alsandair.mac;
import org.slf4j.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GeneralSystem {
	
	//create a logger
	private static final Logger log = LoggerFactory.getLogger(GeneralSystem.class);
	
	
	public static void main (String [] args) {
		

		log.info("the class {} is started", GeneralSystem.class);
		log.error("В программе возникла ошибка!");
		
		GeneralSystem.startLogic();
		Console console = new Console ();
		Thread threadConsole = new Thread(console);
		threadConsole.start();
	}
	
	public static void startLogic () {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
		Town town = new Town ();
		//PopCard.setBurseTown(ctx.getBean(Town.class));
		//TurnSystem.setBurseTown(ctx.getBean(Town.class));
		TurnSystem.setBurseTown(town);
		GeneralSystem.dummyStart();
	}
	
	public static void dummyStart () {
		PopCardBuilder.createPopCard(100, SocialClass.RICH, new Town() );
	}

}
