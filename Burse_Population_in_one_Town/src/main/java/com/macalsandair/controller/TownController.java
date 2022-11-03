package com.macalsandair.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.macalsandair.model.Town;
import com.macalsandair.repository.TownRepository;

@Controller
public class TownController {
	@Autowired
	TownRepository townRepository;
	
	@PostMapping("/town")
	public ResponseEntity<?> addTown (@RequestBody Town town) {
		
		townRepository.save(town);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/town")
	public ResponseEntity<?> addTown (@RequestBody Long id) {
		Optional <Town> town = townRepository.findById(id);
		if (town.isPresent()) {
			townRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
	}
}