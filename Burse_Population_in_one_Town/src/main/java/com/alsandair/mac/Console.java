package com.alsandair.mac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console implements Runnable {

	Console () {
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter y for one addition turn, or t for timer, or ts");
		
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
				System.out.println("You write illegal command");
				break;
			}
		}
				
	}
	
	// there we refactor the comsole commands
	public static void newTurn () {
		System.out.println("New turn");
		TurnSystem.nextTurn();
	}
	
	public static void stopTimer () {
		try {
			TimerForTurn.stopATimer();
		}
		catch (NullPointerException e) {
			e.getMessage();
			System.out.println("Timer doesn't exist. Please, firstly create a timer");
		}
	}
	
	public static void newTimer (Scanner sc) {
		System.out.println("Please, write an interval");
		int interval;
		try {
			interval = sc.nextInt();
			TimerForTurn.startATimer(interval);
		}
		catch (InputMismatchException e) {
			//System.out.println(e.getMessage());
			System.out.println("You tried to put an invalid argument as an interval");
			System.out.println("Please, write a number as an argument");
		}
	}
	
	public static void printPopulation (PullOfTown burseTown) {
		for (int i = 0; i<burseTown.PopCardPull.size(); i++) {
			System.out.println(burseTown.PopCardPull.get(i).getPopulation());
		}
	}
	
	public void newPopCardCommand (Scanner sc) {
		System.out.println("Please, enter an ammount of PopCard");
		int ammount;
		try {
			ammount = sc.nextInt();
		}
		catch (InputMismatchException e) {
			ammount = 100;
			e.getMessage();
			System.out.println("You have written an invalid argument");
		}
		
		//System.out.println(ammount);
		//System.out.println("Please, enter a class of PopCard");
		//PopCard popCard = PopCardBuilder.createPopCard(ammount, SocialClass.returnSocialClass(sc.nextLine()));
		PopCard popCard = PopCardBuilder.createPopCard(ammount, SocialClass.MIDDLE);
		System.out.println(popCard.toString());
		
	}

}
