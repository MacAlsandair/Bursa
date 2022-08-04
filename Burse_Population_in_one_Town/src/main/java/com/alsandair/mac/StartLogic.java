package com.alsandair.mac;

public class StartLogic {
	
	public static void startLogic () {
		PullOfTown pullOfTown = new PullOfTown ();
		PopCard.setBurseTown(pullOfTown);
		TurnSystem.setBurseTown(pullOfTown);
		StartLogic.dummyStart();
	}
	
	public static void dummyStart () {
		PopCardBuilder.createPopCard(100, SocialClass.RICH);
	}
	

}
