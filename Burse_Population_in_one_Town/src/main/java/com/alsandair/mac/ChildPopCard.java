package com.alsandair.mac;

public class ChildPopCard extends PopCard {
	
	PopCard parent;

	ChildPopCard(int population, SocialClass socialClass) {
		super(population, socialClass);
	}
	ChildPopCard (int population, PopCard popCard) {
		super(population, popCard.getSocialClass());
		this.parent = popCard;
	}

}
