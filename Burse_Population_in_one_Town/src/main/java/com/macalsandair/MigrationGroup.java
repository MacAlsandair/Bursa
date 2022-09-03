package com.macalsandair;

import com.macalsandair.models.PopCard;
import com.macalsandair.models.Town;

public class MigrationGroup extends PopCard {
	private int ammount;
	private SocialClass socialClass;
	
	public MigrationGroup(int ammount, SocialClass socialClass, Town town) {
		super(ammount, socialClass, town);
		this.ammount = ammount;
		this.socialClass = socialClass;
	}

	public int getAmmount() {
		return ammount;
	}

	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
}
