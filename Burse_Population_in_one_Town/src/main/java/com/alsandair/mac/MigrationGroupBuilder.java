package com.alsandair.mac;

public class MigrationGroupBuilder {
	static MigrationGroup buildMG (PopCard parentPopCard, int ammount, SocialClass socialClass) {
		
		return new MigrationGroup(ammount, socialClass);
	}
}
