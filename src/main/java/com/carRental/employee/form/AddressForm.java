package com.carRental.employee.form;

import org.hibernate.validator.constraints.NotEmpty;

import com.carRental.employee.ThanePinCode;

public class AddressForm {
	public AddressForm(){
		this.city = "City";
		this.street = "Street";
		//we'll think abt carrying default value of pin code later
	}

	private String city;
	@NotEmpty
	private String street;
	@ThanePinCode( message="pin code bole toh Thane kya !")
	private Long pincode;
	
	//-------------getters setters
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Long getPincode() {
		return pincode;
	}
	@ThanePinCode
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
}
