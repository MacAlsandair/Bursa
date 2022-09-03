package com.macalsandair.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.macalsandair.Locality;

@Controller
public class MainController {
	


	@GetMapping("/")
	public String home (Model model) {
		return "home";
	}

}
