
public class StartLogic {
	
	public static void startLogic () {
		PullOfTown burseTown = new PullOfTown ();
		PopCard.setBurseTown(burseTown);
		TurnSystem.setBurseTown(burseTown);
		StartLogic.dummyStart();
	}
	
	public static void dummyStart () {
		PopCard popCard1 = new PopCard(100, SocialClass.RICH);
	}
	

}
