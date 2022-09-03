package com.macalsandair;

import com.macalsandair.models.Town;

public interface BirthRateTurn {

	void birthRateTurn();

	void birthRateTurnForTown(Town town);

	void setBirthRate(double birthRate);

}