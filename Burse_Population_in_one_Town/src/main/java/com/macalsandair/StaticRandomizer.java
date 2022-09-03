package com.macalsandair;

import org.springframework.stereotype.Service;

import com.macalsandair.models.Town;

@Service
public class StaticRandomizer {
	private static Town town;
	private Town nonStaticTown;
	
	public StaticRandomizer (Town town2) {
		this.nonStaticTown = town2;
		StaticRandomizer.town = town2;
	}
	
	public static Town getRandomTown () {
		return town;
	}
	
	
}
