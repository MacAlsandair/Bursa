package com.macalsandair;

import com.macalsandair.models.PopCard;
import com.macalsandair.models.Town;

public class MigrationGroupBuilder {
	static MigrationGroup buildMG (PopCard parentPopCard, int ammount, SocialClass socialClass, Town town) {
		
		return new MigrationGroup(ammount, socialClass, town);
	}
}
