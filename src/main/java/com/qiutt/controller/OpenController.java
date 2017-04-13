package com.qiutt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/open")
public class OpenController {
	
	@RequestMapping(value="/upload")
	public ModelAndView upload() {
		return new ModelAndView("uploadFile");
	}
}
