package com.macalsandair.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.macalsandair.service.TurnSystem;


@Controller
public class MainController {
	
	@Autowired
	TurnSystem turnSystem;

	@GetMapping("/")
	public String home (Model model) {
		return "home";
	}
	
	@PutMapping("/new-turn")
	public String turn(Model model) {
		turnSystem.commonTurn();
		return "turn-page";
	}
	

}
