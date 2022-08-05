package com.alsandair.mac;

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
