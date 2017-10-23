package com.carRental.employee.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.carRental.employee.form.EmployeeForm;

@Controller
public class EmployeeController {

	
	/**
	 * @param modelAndView
	 * @param editable
	 * @return
	 * Note:  create Employee With Request Param Demo
	 */
	/*@RequestMapping(method=RequestMethod.GET,  value="/create")
	public ModelAndView createEmployeeWithRequestParamDemo(ModelAndView modelAndView, @RequestParam String editable){
		EmployeeForm employeeForm =  new EmployeeForm();
		if("Y".equals(editable)){
			 employeeForm.setFirstName("Saurabh");
			 employeeForm.setLastName("Dubey");
		}else{
			 employeeForm.setFirstName("First Name");
			 employeeForm.setLastName("Last Name");
		}
		modelAndView.addObject("emp", employeeForm) ;
		modelAndView.addObject("edit", editable) ;
		modelAndView.setViewName("employee");
		return modelAndView;
	}
	*/
	/*@RequestMapping(method=RequestMethod.GET,  value="/create")
	public ModelAndView createEmployeeWithRequestParamDemo(ModelAndView modelAndView, @RequestParam String editable,  @RequestParam String tempVar){
		System.out.println(editable  + "  "+tempVar);
		EmployeeForm employeeForm =  new EmployeeForm();
		modelAndView.addObject("emp", employeeForm) ;
		modelAndView.addObject("edit", editable) ;
		modelAndView.setViewName("employee");
		return modelAndView;
	} */
	/**
	 * @param modelAndView
	 * @param editable
	 * @return
	 * Note :create Employee With Path Var Map
	 */
	/*@RequestMapping(method=RequestMethod.GET,  value="/create/{editable}/{tempVar}")
	public ModelAndView createEmployeeWithRequestParamDemo(ModelAndView modelAndView, @PathVariable  Map<String, String> pathVars){
		System.out.println(pathVars.get("editable")  + "  "+pathVars.get("tempVar"));
		EmployeeForm employeeForm =  new EmployeeForm();
		modelAndView.addObject("emp", employeeForm) ;
		modelAndView.addObject("edit", pathVars.get("editable")) ;
		modelAndView.setViewName("employee");
		return modelAndView;
	} */
	
	/**
	 * @param modelAndView
	 * @param editable
	 * @return
	 * Note :create Employee With Path Param Demo
	 */
	@RequestMapping(method=RequestMethod.GET,  value="/create/{editable}")
	public ModelAndView createEmployeeWithPathParamDemo(ModelAndView modelAndView,  @PathVariable String editable){
		System.out.println(editable );
		EmployeeForm employeeForm =  new EmployeeForm();
		if("Y".equals(editable)){
			 employeeForm.setFirstName("Saurabh");
			 employeeForm.setLastName("Dubey");
		}else{
			 employeeForm.setFirstName("First Name");
			 employeeForm.setLastName("Last Name");
		}
		modelAndView.addObject("emp", employeeForm) ;
		modelAndView.addObject("edit", editable) ;

		modelAndView.addObject("msgType", "alert-info") ;
		modelAndView.addObject("headerMsg", "fields marked with '*' are mandatory !") ;
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
	public ModelAndView saveEmployee(@Valid @ModelAttribute("emp") EmployeeForm employeeForm, BindingResult bindingResult){
		System.out.println(employeeForm.getFirstName() + "  "+employeeForm.getLastName());
		ModelAndView modelAndView = new ModelAndView();
		if(bindingResult.hasErrors()){
			
			modelAndView.addObject("emp", employeeForm) ;
			modelAndView.setViewName("employee");
		}else {
			modelAndView.addObject("emp", new EmployeeForm()) ;
			
			modelAndView.addObject("msgType", "alert alert-success") ;
			modelAndView.addObject("headerMsg", "Employee has been created successfully !") ;
			modelAndView.setViewName("employee");
		}
		return modelAndView;
	} 
}
