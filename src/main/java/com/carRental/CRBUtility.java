package com.carRental;

public class CRBUtility {

	public static boolean validateForNullObject(Object obj ) {
		if(obj != null && (!obj.equals(null))){
			return true;
		}
		return false;
	}
}
