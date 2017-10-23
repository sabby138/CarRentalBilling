package com.carRental.employee.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.carRental.CarRentalBillingPropertyEditor;
import com.carRental.employee.form.EmployeeForm;

@Controller
public class EmployeeController {

	@InitBinder
	public void setDataBindingConfigurations(WebDataBinder binder){
		//binder.setDisallowedFields("empDOB");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(Date.class, "empDOB", new CustomDateEditor(format, false));
		binder.registerCustomEditor(String.class, "firstName",new CarRentalBillingPropertyEditor("firstName") );
		binder.registerCustomEditor(String.class, "lastName",new CarRentalBillingPropertyEditor("lastName") );
	}
	
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
			
			//modelAndView.addObject("emp", employeeForm) ;    NO Need for setattribute as @ModelAttribute("emp") always setattributes at the end of method
			modelAndView.addObject("msgType", "alert-warning") ;
			modelAndView.setViewName("employee");
		}else {
			//modelAndView.addObject("emp", new EmployeeForm()) ; (samereason,  @ModelAttribute("emp") is necessary here for binding result
			
			modelAndView.addObject("msgType", "alert-success") ;
			modelAndView.addObject("headerMsg", "Employee has been created successfully !") ;
			modelAndView.setViewName("employee");
		}
		
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/events")
	public ModelAndView fetchEvents() throws IOException{
		ModelAndView modelAndView =null;
			modelAndView = new ModelAndView("employee");
			throw new IOException();
	}
	
	/*@ExceptionHandler(value=NullPointerException.class)
	public ModelAndView handleNullPointerException(Exception e){

		ModelAndView modelAndView = new ModelAndView("exceptionOccuredJSP");
		modelAndView.addObject("msgType", "alert-danger") ;
		modelAndView.addObject("headerMsg", "Null Pointer Exception occurred") ;
		return modelAndView;
		
	}
	
	@ExceptionHandler(value=Exception.class)
	public ModelAndView handleAllException(Exception e){

		ModelAndView modelAndView = new ModelAndView("exceptionOccuredJSP");
		modelAndView.addObject("msgType", "alert-danger") ;
		modelAndView.addObject("headerMsg", "Unknown Exception occurred") ;
		return modelAndView;
		
	}*/
	

}
