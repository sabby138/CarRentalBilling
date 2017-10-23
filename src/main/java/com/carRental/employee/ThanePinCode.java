package com.carRental.employee;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy = ThanePinCodeValidator.class)
@Target( { ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ThanePinCode {
 
    
    String message() default "Pin code toh Thane ka hi chalega boss aur vo bhi 6 digit only.";
     
    Class<?>[] groups() default {};
     
    Class<? extends Payload>[] payload() default {};

	String startsWith() default "421";

	int maxLength() default 6;
      
}