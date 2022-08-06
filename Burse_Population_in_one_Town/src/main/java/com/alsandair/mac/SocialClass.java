package com.alsandair.mac;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum SocialClass {
	POOR,
	MIDDLE,
	RICH;
	
	private static final Logger log = LoggerFactory.getLogger(Console.class);

	
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
			log.warn("The wrong type");
			yield POOR;
		};
		return thisSocialClass;
	}
}
