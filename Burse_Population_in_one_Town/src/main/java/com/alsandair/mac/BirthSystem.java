package com.alsandair.mac;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

//BirthRateSystem
@Service
public class BirthSystem implements BirthRateTurn {
	private double birthRate = 1.02;
	
	
	
	private static final Logger log = LoggerFactory.getLogger(BirthSystem.class);
	
//	static void birthRateTurn (PopCard burseTown) {
//		burseTown.population = (int) (burseTown.population * birthRate);
//	}
	
	public BirthSystem () {
		
	}
	
	@Override
	public void birthRateTurn () {
		log.debug("Start a process of enumeration of cities");
		
		for (int i = 0; i<Town.getPullOfTowns().size(); i++) {
			log.trace("Processing town number {}", i);
			birthRateTurnForTown (Town.getPullOfTowns().get(i));
		}
		
		log.debug("end of BirthRate Processing");
	}
	
	
	@Override
	public void birthRateTurnForTown (Town town) {
		for (int i = 0; i<town.getPullOfPopCards().size(); i++) {
			log.trace("Processing PopCard with a name: {}", town.getPullOfPopCards().get(i).toString());
			town.getPullOfPopCards().get(i).setPopulation((int) (town.getPullOfPopCards().get(i).getPopulation() * birthRate));
			log.trace("{}", town.getPullOfPopCards().get(i).getPopulation());
		}
	}
	
	
	boolean childCardLogic (PopCard popCard) {
		if (popCard.hasChild() == true) {
			return true;
		}
		else return false;
	}


	@Override
	public void setBirthRate(double birthRate) {
		this.birthRate = birthRate;
	}
}
