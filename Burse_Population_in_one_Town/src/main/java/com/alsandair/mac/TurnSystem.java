package com.alsandair.mac;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TurnSystem {
	private static Town town;
	private static final Logger log = LoggerFactory.getLogger(GeneralSystem.class);


	public static void setTown(Town town) {
		TurnSystem.town = town;
	}
	
	public static void nextTurn () {

		BRSystem.birthRateTurn();

		Console.printPopulation(town);
		
		log.trace("Logic of new turn be delivered");
	}

}
