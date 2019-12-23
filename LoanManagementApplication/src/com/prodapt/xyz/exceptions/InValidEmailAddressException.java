package com.prodapt.xyz.exceptions;

public class InValidEmailAddressException extends Exception {
	/**
	 Invalid Email Address Exception 
	 **/
	private static final long serialVersionUID = 1L;

	public InValidEmailAddressException(String s) {
		super(s);
	}
}
