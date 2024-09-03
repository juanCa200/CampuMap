package com.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrivateController {

	@GetMapping("/private/index")
	public String index() {
		return "index";
	}
	
}
