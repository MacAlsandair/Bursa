package com.macalsandair;

public class ChildPopCard extends PopCard {
	
	PopCard parent;

	ChildPopCard(int population, SocialClass socialClass, Town town) {
		super(population, socialClass, town);
	}
	ChildPopCard (int population, PopCard popCard) {
		super(population, popCard.getSocialClass(), popCard.getTown());
		this.parent = popCard;
	}

}
