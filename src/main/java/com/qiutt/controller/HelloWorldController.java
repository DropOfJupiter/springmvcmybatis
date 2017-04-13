package com.qiutt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/helloWorld")
public class HelloWorldController {
	
	@RequestMapping(value="/view",method = RequestMethod.GET)
	public String helloWorld() {
		System.out.println("进来了");
		return "helloWorld";
	}
}
