package com.macalsandair.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.macalsandair.model.Popcard;
import com.macalsandair.repository.PopcardRepository;
import com.macalsandair.service.BirthSystem;

@Controller
public class PopCardController {
	
	@Autowired
	PopcardRepository popcardRepository;
	
	@Autowired
	BirthSystem birthSystem;

	@GetMapping("/popcard-list")
	public String popCardList ( Model model ) {
		Iterable<Popcard> popcards = popcardRepository.findAll();
		model.addAttribute("popCards", popcards);
		return "popcard-list";
		
	}
	
	@PostMapping("/add-popcard-from-nothing")
	public ResponseEntity<?> addPopcardFromNothing (@RequestBody Popcard popcard) {
		
		popcardRepository.save(popcard);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PostMapping("/add-child-by-id")
	public ResponseEntity<?> addChild (@RequestBody Long id) {
		Optional <Popcard> parent = popcardRepository.findById(id);
		if (parent.isPresent()) {
			birthSystem.createChildcard(parent.get());
			return new ResponseEntity<>(HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/popcard")
	public ResponseEntity<?> addTown (@RequestBody Long id) {
		Optional <Popcard> popcard = popcardRepository.findById(id);
		if (popcard.isPresent()) {
			popcardRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
	}
	
}
