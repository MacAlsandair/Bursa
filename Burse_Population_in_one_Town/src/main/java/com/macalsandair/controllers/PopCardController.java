package com.macalsandair.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.macalsandair.models.PopCard;
import com.macalsandair.repo.PopCardRepository;

@Controller
public class PopCardController {
	
	@Autowired
	PopCardRepository popCardRepository;

	@GetMapping("/popcard-list")
	public String popCardList ( Model model ) {
		Iterable<PopCard> popCards = popCardRepository.findAll();
		model.addAttribute("popCards", popCards);
		return "popcard-list";
		
	}
}
