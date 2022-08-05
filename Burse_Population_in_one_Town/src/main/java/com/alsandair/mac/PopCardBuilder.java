package com.alsandair.mac;

public class PopCardBuilder {

	public static PopCard createPopCard (int ammount, SocialClass socialClass, Town town) {
		return new PopCard(ammount, socialClass, town);
	}
	public static ChildPopCard createChildPopCard (int ammount, PopCard popCard) {
		return new ChildPopCard(ammount, popCard);
	}
}
