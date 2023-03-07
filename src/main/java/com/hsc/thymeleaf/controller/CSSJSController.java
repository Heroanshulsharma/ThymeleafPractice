package com.hsc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CSSJSController {

	@GetMapping("template")
	public String addCSSJS() {
		return "template";
	}
	
}
