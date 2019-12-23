package com.restaurant.abc.service;

import com.restaurant.abc.bean.Book;
import com.restaurant.abc.bean.Customer;

//Create interface for HotelService.
public interface IHotelService {
	//Create Abstract method
	public long bookRoom(Book book);
	public Customer validateCustomer(Customer customer);
	public long addCustomer(Customer cust);
	
}
