package com.carRental.employee.form;

public class AddressForm {
	public AddressForm(){
		
	}

	private String city;
	private String street;
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
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
}
