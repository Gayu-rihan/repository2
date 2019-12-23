package com.restaurant.abc.dao;

import com.restaurant.abc.bean.Book;
import com.restaurant.abc.bean.Customer;

//Creating interface for BookDao with abstract methods.
public interface IBookDao {
	public long bookRoom(Book book);
	public long addCustomer(Customer cust);
}
