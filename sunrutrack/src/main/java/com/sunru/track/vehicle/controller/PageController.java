   package com.sunru.track.vehicle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/")
	String home(){
		return"sun.home";
	}
	
	@RequestMapping("/header")
	String header(){
		return"sun.default";
	}

	@RequestMapping("/menu")
	String menu(){
		return"sun.default";
	}
	@RequestMapping("/content")
	String content(){
		return"sun.default";
	}
	@RequestMapping("/footer")
	String footer(){
		return"sun.default";
	}
	
	

}
