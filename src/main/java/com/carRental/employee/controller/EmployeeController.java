package com.carRental.employee.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.carRental.employee.form.EmployeeForm;

@Controller
public class EmployeeController {

	@RequestMapping(method=RequestMethod.GET,  value="/create")
	public ModelAndView createEmployee(ModelAndView modelAndView){
		modelAndView.addObject("emp", new EmployeeForm()) ;
		modelAndView.setViewName("employee");
		return modelAndView;
	} 
	
	/*@RequestMapping(method=RequestMethod.POST,  value="/save")
	public ModelAndView saveEmployee(@Valid @ModelAttribute("employeeForms") EmployeeForm employeeForm, BindingResult bindingResult){
		System.out.println(employeeForm.getFirstName() + "  "+employeeForm.getLastName());
		ModelAndView modelAndView = new ModelAndView();
		if(bindingResult.hasErrors()){
			
			modelAndView.addObject("command", employeeForm) ;
			modelAndView.setViewName("employee");
		}else {
			
			modelAndView.addObject("command", employeeForm) ;
			modelAndView.addObject("validationMsg", "Employee has been created successfully !");	
			modelAndView.setViewName("employee");
		}
		return modelAndView;
	} */
	
	@RequestMapping(method=RequestMethod.POST,  value="/save")
	public ModelAndView saveEmployee(@Valid @ModelAttribute() EmployeeForm employeeForm, BindingResult bindingResult){
		System.out.println(employeeForm.getFirstName() + "  "+employeeForm.getLastName());
		ModelAndView modelAndView = new ModelAndView();
		if(bindingResult.hasErrors()){
			
			modelAndView.addObject("emp", employeeForm) ;
			modelAndView.setViewName("employee");
		}else {
			modelAndView.addObject("emp", new EmployeeForm()) ;
			modelAndView.addObject("validationMsg", "Employee has been created successfully !");	
			modelAndView.setViewName("employee");
		}
		return modelAndView;
	} 
}
