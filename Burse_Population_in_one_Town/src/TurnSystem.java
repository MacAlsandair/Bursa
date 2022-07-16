
public class TurnSystem {
	private static PopCard popCard;
	
	static void setterpopCard (PopCard popCard) {
		TurnSystem.popCard = popCard;
	}
	
	public static void nextTurn () {
		BRSystem.birthRateTurn(popCard);
		System.out.println(popCard.population);
	}
}
