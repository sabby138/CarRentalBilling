package com.carRental.firstAccess;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstAccessController {

	@RequestMapping("/routeToEntryPage")
	public ModelAndView routeToEntryPage(){
		ModelAndView view = new ModelAndView("index");
		return view;
		
	}
}
