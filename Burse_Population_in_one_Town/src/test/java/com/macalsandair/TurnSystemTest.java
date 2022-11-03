package com.macalsandair;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.macalsandair.model.Town;
import com.macalsandair.repository.PopcardRepository;
import com.macalsandair.repository.TownRepository;
import com.macalsandair.service.BirthSystemImpl;
import com.macalsandair.service.TurnSystemImpl;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class TurnSystemTest {
	
	private static final Logger log = LoggerFactory.getLogger(TurnSystemTest.class);
	
	@Mock
	TownRepository mockedTownRepository;
	
	@Mock
	BirthSystemImpl mockedBirthSystem;
	
	@Mock
	PopcardRepository mockedPopcardRepository;
	
	@InjectMocks 
	TurnSystemImpl turnSystem;
	
	//We need Mockito framework for mocking. In the future we may be need integration tests
	
	@Test
	public void testCommonTurn () {
		
		Town newTown = new Town ("London");
		
		log.info("{}", newTown.getName());
		
		turnSystem.commonTurn();
		
		//mockedTownRepository.save(newTown);
		
		//log.info("{} is saved", newTown.getName());
	}
	
	
	@Test
	public void testTownTurn () {
		
		Town newTown = new Town ("London");
		
		log.info("{}", newTown.getName());
		
		turnSystem.townTurn(newTown);
		
		//mockedTownRepository.save(newTown);
		
		//log.info("{} is saved", newTown.getName());
	}
	
}
