package com.mycontrol.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	@RequestMapping(value="/test.html" , method= RequestMethod.GET)
	public ModelAndView gerAddmissonForm(){
		
		ModelAndView modelAndView = new ModelAndView("Hello"); 
		
		return modelAndView;
	}
}
