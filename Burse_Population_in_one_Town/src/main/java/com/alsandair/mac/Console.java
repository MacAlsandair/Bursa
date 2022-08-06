package com.alsandair.mac;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Console implements Runnable {
	
	private static final Logger log = LoggerFactory.getLogger(Console.class);

	Console () {
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		log.info("Please, enter y for one addition turn, or t for timer, or ts");
		
//		while (1 == 1) {
//			String i = sc.nextLine();
//			if (i.equals("y")) {
//				System.out.println("New turn");
//				TurnSystem.nextTurn();
//			}
//			else if (i.equals("t")) {
//				System.out.println("Please, write an interval");
//				try {
//					int j = sc.nextInt();
//					TimerForTurn.startATimer(j);
//				}
//				catch (IllegalArgumentException ex) {
//					System.out.println("i!=int");
//				}
//			}
//			else if (i.equals("ts")) {
//				TimerForTurn.stopATimer();
//			}
//			else {
//				System.out.println("Please, enter y for one addition turn");
//			}
//		}
		while (1 == 1){
			String i = sc.nextLine();
			switch (i) {
			case "y":
				Console.newTurn();
				break;
			case "t":
				Console.newTimer(sc);
				break;
			case "ts":
				Console.stopTimer();
				break;
			case "newCard":
				this.newPopCardCommand(sc);
				break;
			default:
				log.warn("You write illegal command");
				break;
			}
		}
				
	}
	
	// there we refactor the comsole commands
	public static void newTurn () {
		log.info("New turn");
		TurnSystem.nextTurn();
	}
	
	public static void stopTimer () {
		try {
			TimerForTurn.stopATimer();
		}
		catch (NullPointerException e) {
			e.getMessage();
			log.warn("Timer doesn't exist. Please, firstly create a timer");
		}
	}
	
	public static void newTimer (Scanner sc) {
		log.info("Please, write an interval");
		int interval;
		try {
			interval = sc.nextInt();
			TimerForTurn.startATimer(interval);
		}
		catch (InputMismatchException e) {
			//System.out.println(e.getMessage());
			log.warn("You tried to put an invalid argument as an interval");
			log.warn("Please, write a number as an argument");
		}
	}
	
	public static void printPopulation (Town burseTown) {
		for (int i = 0; i<burseTown.getPullOfPopCards().size(); i++) {
			log.info("{}", burseTown.getPullOfPopCards().get(i).getPopulation());
		}
	}
	
	public void newPopCardCommand (Scanner sc) {
		log.info("Please, enter an ammount of PopCard");
		int ammount;
		try {
			ammount = sc.nextInt();
		}
		catch (InputMismatchException e) {
			ammount = 100;
			e.getMessage();
			log.warn("You have written an invalid argument");
		}
		
		//System.out.println(ammount);
		//System.out.println("Please, enter a class of PopCard");
		//PopCard popCard = PopCardBuilder.createPopCard(ammount, SocialClass.returnSocialClass(sc.nextLine()));
		//PopCard popCard = PopCardBuilder.createPopCard(ammount, SocialClass.MIDDLE, @Autowired Town town);
		//log.info("{}", popCard.toString());
		
	}

}
