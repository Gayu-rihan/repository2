package com.restaurant.abc.exceptions;

//Creating Exception if user enters an invalid mobile number
public class InValidMobileNoException extends Exception{

	private static final long serialVersionUID = 1L;

	public InValidMobileNoException(){
		System.out.println("invalid mobile number");
	}
}
