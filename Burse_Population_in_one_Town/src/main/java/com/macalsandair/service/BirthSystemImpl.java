package com.macalsandair.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macalsandair.repository.PopcardRepository;
import com.macalsandair.model.Popcard;

//BirthRateSystem
@Service
public class BirthSystemImpl implements BirthSystem {
	private static final Logger log = LoggerFactory.getLogger(BirthSystemImpl.class);
	@Autowired
	private PopcardRepository PopcardRepository;
	private double birthRate = 1.02;

	public BirthSystemImpl () {
		
	}
	
	public void increaseChildcard(Popcard popcard) {
		int incrementalAmount = (int) ((int) popcard.getPopulation() * (birthRate-1.0));
		incrementalAmount = incrementalAmount>0 ? incrementalAmount : 1;
		popcard.getIncubated().setPopulation(popcard.getIncubated().getPopulation() + incrementalAmount);
	}

	public void createChildcard(Popcard parent) {
		int incrementalAmount = (int) ((int) parent.getPopulation() * (birthRate-1.0));
		incrementalAmount = incrementalAmount>0 ? incrementalAmount : 1;
		Popcard child = new Popcard(parent, incrementalAmount);
		PopcardRepository.save(child);
	}
	
}
