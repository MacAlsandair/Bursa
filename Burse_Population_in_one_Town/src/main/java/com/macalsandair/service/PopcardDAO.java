package com.macalsandair.service;

import java.util.function.Consumer;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macalsandair.model.GameSave;
import com.macalsandair.repository.GameSaveRepository;

@Service
public class PopcardDAO {
	
	@Autowired
	GameSaveRepository gameSaveRepository;
	
	Iterable <GameSave> iterable;
	
	
	
	public void allGameSavePopcard (Long idOfGameSave, Consumer<GameSave> consumer) {
		
		iterable = gameSaveRepository.findAll();
		
		StreamSupport.stream(iterable.spliterator(), false).forEach(consumer);
	}	

}
