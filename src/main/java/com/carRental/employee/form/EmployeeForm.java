package com.carRental.employee.form;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.carRental.employee.ThanePinCode;

public class EmployeeForm {

	public EmployeeForm() {
		this.firstName = "First Name";
		this.lastName = "Last Name";
		this.emailId = "Email-Id";
	}
	
	@NotNull
	@Size(min=2,max=15,message="First Name")
	private String firstName;
	
	@Size(min=2,max=15,message="Last Name")
	private String lastName;
	
	@Digits(fraction = 0, integer = 10, message="Mobile No. should be consisted of 10 digits.")
	@ThanePinCode(startsWith="8655",maxLength=10,message="10 numberi daala de bawa")
	private Long mobileNo;
	
	@Email
	private String emailId;
	
	//@NotNull    Commented for now
	@Past
	private Date empDOB;
	
	@NotEmpty
	private ArrayList<String> roles;
	
	@NotNull
	private AddressForm empAddress;
	
	//---------------getters setters
	
	public AddressForm getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(AddressForm empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}
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
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public ArrayList<String> getRoles() {
		return roles;
	}
	public void setRoles(ArrayList<String> roles) {
		this.roles = roles;
	}
	
}
