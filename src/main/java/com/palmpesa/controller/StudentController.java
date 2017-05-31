package com.palmpesa.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping({ "/student" })
	public String studentPage(Model model) {
		return "student";
	}
	
	@GetMapping({ "/allTx" })
	public String studentTx(Model model) {
		
		return "tx";
	}
}
