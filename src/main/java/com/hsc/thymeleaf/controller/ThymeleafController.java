package com.hsc.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

	@GetMapping("variable")
	public String variableView(Model model) {
		
		model.addAttribute("name", "Anshul Sharma");
		
		
		return "VariableView";
	}
	
	@GetMapping("loop")
	public String loopView(Model m) {
		
		m.addAttribute("list", new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
		return "LoopView";
	}
	
	@GetMapping("condition")
	public String Conditional(Model m) {
		m.addAttribute("list", new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
		m.addAttribute("switchList", new ArrayList<>(Arrays.asList(1,2)));
		return "ConditionalView";
		
	}
	
	@GetMapping("fragment")
	public String fragments(Model m) {
		return "fragmentTest";
	}
	
	@GetMapping("about")
	public String about() {
		return "about";
	}
	
	
}
