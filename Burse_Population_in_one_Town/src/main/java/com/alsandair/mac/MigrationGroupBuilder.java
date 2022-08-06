package com.alsandair.mac;

public class MigrationGroupBuilder {
	static MigrationGroup buildMG (PopCard parentPopCard, int ammount, SocialClass socialClass, Town town) {
		
		return new MigrationGroup(ammount, socialClass, town);
	}
}
