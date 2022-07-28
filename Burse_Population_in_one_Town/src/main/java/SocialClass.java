
public enum SocialClass {
	POOR,
	MIDDLE,
	RICH;
	
	public static SocialClass returnSocialClass (String socialClass) {
		socialClass = socialClass.toUpperCase();
		SocialClass thisSocialClass = switch (socialClass) {
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
