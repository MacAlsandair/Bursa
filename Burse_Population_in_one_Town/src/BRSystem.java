//BirthRateSystem
public class BRSystem {
	static double birthRate = 1.02;
	static void birthRateTurn (PopCard popCard) {
		popCard.population = (int) (popCard.population * birthRate);
	}
}
