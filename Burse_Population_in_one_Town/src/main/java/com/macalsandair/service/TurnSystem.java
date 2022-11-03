package com.macalsandair.service;

import com.macalsandair.model.Popcard;
import com.macalsandair.model.Town;

public interface TurnSystem {

	public void commonTurn ();
	
	public void townTurn(Town town);
	
	public void popcardTurn(Popcard popcard);
}
