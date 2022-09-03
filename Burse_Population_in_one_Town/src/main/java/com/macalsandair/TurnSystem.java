package com.macalsandair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.macalsandair.models.Town;

@Service
public class TurnSystem implements Turn {
	private Town town;
	private static final Logger log = LoggerFactory.getLogger(TurnSystem.class);
	BirthRateTurn birthRateTurn;


//	public static void setTown(Town town) {
//		TurnSystem.town = town;
//	}
	
	public TurnSystem (Town town, BirthRateTurn birthRateTurn) {
		this.town = town;
		this.birthRateTurn = birthRateTurn;
	}
	
	public void nextTurn () {

		birthRateTurn.birthRateTurn();

		
		//Console.printPopulation(town);
		
		town.getPullOfPopCards().stream().forEach((x) -> log.debug("{}", x));
		
		
		log.debug("Logic of new turn is delivered");
	}

}
