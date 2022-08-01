package com.alsandair.mac;

public enum SocialClass {
	POOR,
	MIDDLE,
	RICH;
	
	public static SocialClass returnSocialClass (String socialClassString) {
		socialClassString = socialClassString.toUpperCase();
		SocialClass thisSocialClass = switch (socialClassString) {
		case "RICH":
			yield RICH;
		case "MIDDLE":
			yield MIDDLE;
		case "POOR":
			yield POOR;
		default:
			System.out.println("The wrong type");
			yield POOR;
		};
		return thisSocialClass;
	}
}
