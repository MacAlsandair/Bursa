
public class TurnSystem {
	private static PullOfTown burseTown;


	public static void setBurseTown(PullOfTown burseTown) {
		TurnSystem.burseTown = burseTown;
	}
	
	public static void nextTurn () {
		BRSystem.birthRateTurn(burseTown);
		Console.printPopulation(burseTown);
	}

}
