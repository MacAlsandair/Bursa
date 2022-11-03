package com.macalsandair.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macalsandair.model.LiveStatus;
import com.macalsandair.model.Popcard;
import com.macalsandair.model.Town;
import com.macalsandair.repository.PopcardRepository;
import com.macalsandair.repository.TownRepository;

@Service
public class TurnSystemImpl implements TurnSystem {
	
	private static final Logger log = LoggerFactory.getLogger(TurnSystemImpl.class);
	
	@Autowired
	PopcardRepository popcardRepository;
	
	@Autowired
	TownRepository townRepository;
	
	@Autowired
	BirthSystem birthSystem;
	
	@Override
	public void commonTurn() {
		log.info("Start the calculating of common turn");
		Iterable <Town> towns = townRepository.findAll();
		for (Town town : towns) {
			log.trace("start turn for town {}", town.getName());
			this.townTurn(town);
		}
	}

	@Override
	public void townTurn(Town town) {
		log.trace("Processing the turn for the town {}", town.getName());
		
		Iterable <Popcard> popcards = popcardRepository.findAll();
		
		for (Popcard popcard : popcards) {
			if (popcard.getLiveStatus() == LiveStatus.ALIVE) {
				this.popcardTurn(popcard);
			} else {
				log.trace("popcard {} is dead, hence popcard turn system skips it", popcard);
			}
		}
		
	}
	
	public void popcardTurn(Popcard popcard) {
		log.trace("start proccessing logic for popcard {}", popcard.getId());
		popcard.setAge(popcard.getAge()+1);
		
		if (popcard.getParent().getIncubated()==popcard 
				&& popcard.getAge()>=18) {
			popcard.getParent().setIncubated(null);
		}
		
		if (popcard.getAge()>=75) {
			popcard.killPopcard();
		} else {
			if (popcard.hasIncubated()) {
				birthSystem.increaseChildcard(popcard);
			} else {
				birthSystem.createChildcard(popcard);
			}
		}
	}
	
	

}
