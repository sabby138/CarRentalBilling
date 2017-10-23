package com.carRental.employee;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.carRental.CRBUtility;

public class ThanePinCodeValidator implements ConstraintValidator<ThanePinCode,Long >{

	String validPinCode;
	int validPinCodeSize;
	ThanePinCode thanePinCode;
	public void initialize(ThanePinCode thanePinCode) {
		 validPinCode= thanePinCode.startsWith();
		 validPinCodeSize = thanePinCode.maxLength();
		 this.thanePinCode = thanePinCode;
	}

	public boolean isValid(Long input, ConstraintValidatorContext arg1) {
		if(CRBUtility.validateForNullObject(input) 
				&& (!input.toString().startsWith(validPinCode) || (input.toString().length() !=validPinCodeSize))){
				return false;
			
		}
		return true;
	}

}
