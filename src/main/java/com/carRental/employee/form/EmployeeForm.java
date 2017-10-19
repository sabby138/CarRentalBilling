package com.carRental.employee.form;

import javax.validation.constraints.Size;

public class EmployeeForm {

	public EmployeeForm() {

	}
	@Size(min=2,max=15)
	private String firstName;
	@Size(min=2,max=15)
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
