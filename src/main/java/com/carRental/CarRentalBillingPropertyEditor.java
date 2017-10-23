package com.carRental;

import java.beans.PropertyEditorSupport;

import org.springframework.util.StringUtils;

public class CarRentalBillingPropertyEditor extends PropertyEditorSupport{

	private String fieldName;

	public CarRentalBillingPropertyEditor(String fieldName){
		this.fieldName = fieldName;
	}

	@Override
	public void setAsText(String inputString){

		if("firstName".equals(fieldName)){

			if(inputString.contains("Mr.") || inputString.contains("Ms.")){
				setValue(inputString);
			}else{
				setValue("Mr. "+inputString);
			}
		}
		if("lastName".equals(fieldName)){

			if(inputString.contains("*") || inputString.contains("%")){
				setValue(StringUtils.replace(inputString, "*", ",") );
				setValue(StringUtils.replace(inputString, "%", ",") );
			}
		}
	}
}
