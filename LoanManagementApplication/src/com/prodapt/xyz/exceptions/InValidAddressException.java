package com.prodapt.xyz.exceptions;

public class InValidAddressException extends Exception {
	/**
	 Invalid Address Exception
	 **/
	private static final long serialVersionUID = 1L;

	public InValidAddressException(String s) {
		super(s);
	}
}