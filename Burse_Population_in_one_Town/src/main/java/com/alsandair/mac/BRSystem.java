package com.alsandair.mac;
//BirthRateSystem
public class BRSystem {
	private static double birthRate = 1.02;
//	static void birthRateTurn (PopCard burseTown) {
//		burseTown.population = (int) (burseTown.population * birthRate);
//	}
	static void birthRateTurn (PullOfTown burseTown) {
		for (int i = 0; i<burseTown.getPullOfTownArray().size(); i++) {
			burseTown.getPullOfTownArray().get(i).setPopulation((int) (burseTown.getPullOfTownArray().get(i).getPopulation() * birthRate));
			
		}
		
	}
	
	
	static boolean childCardLogic (PopCard popCard) {
		if (popCard.hasChild() == true) {
			return true;
		}
		else return false;
	}
}
