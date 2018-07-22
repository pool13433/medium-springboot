package com.poolsawat.started.SpringbootOnMedium.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediumController {
	@RequestMapping(value="/medium")
	public String medium(){
		return "getting-started-spring-boot on eclipse tool";
	}
}
