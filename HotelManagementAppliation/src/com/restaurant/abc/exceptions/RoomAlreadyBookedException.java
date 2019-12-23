package com.restaurant.abc.exceptions;

//Creating Exception if user selects Already booked room(Unavailable rooms)
public class RoomAlreadyBookedException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public RoomAlreadyBookedException(String s) {
		super(s);
	}

}
