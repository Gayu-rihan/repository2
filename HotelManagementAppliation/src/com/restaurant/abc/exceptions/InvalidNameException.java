package com.restaurant.abc.exceptions;

//Creating Exception if user enters an invalid name
public class InvalidNameException extends Exception{

	private static final long serialVersionUID = 1L;

	public InvalidNameException(){
		System.err.println("invalid name. Enter again");
	}
}
