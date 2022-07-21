//BirthRateSystem
public class BRSystem {
	static double birthRate = 1.02;
//	static void birthRateTurn (PopCard burseTown) {
//		burseTown.population = (int) (burseTown.population * birthRate);
//	}
	static void birthRateTurn (PullOfTown burseTown) {
		for (int i = 0; i<burseTown.PopCardPull.size(); i++) {
			burseTown.PopCardPull.get(i).population = (int) (burseTown.PopCardPull.get(i).population * birthRate);
			
		}
		
	}
	
	
	static void childCardLogic (PopCard popCard) {
		if (popCard.hasChild() == true) {
		}
	}
}
